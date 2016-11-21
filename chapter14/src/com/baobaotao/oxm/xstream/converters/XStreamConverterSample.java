package com.baobaotao.oxm.xstream.converters;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.Locale;
import com.baobaotao.domain.LoginLog;
import com.baobaotao.domain.User;
import com.baobaotao.utils.ResourceUtils;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
public class XStreamConverterSample {
	public static String FILE_NAME = "";
	private static XStream xstream;
	private static User u;
	static{
        //new DomDriver()，这种方式不需要加xpp3包
	    xstream = new XStream(new DomDriver());
	    //设置类别名,默认为当前类名称加上包名
        xstream.alias("loginLog", LoginLog.class);
        xstream.alias("user", User.class);
        //设置类成员别名
        xstream.aliasField("id",User.class,"userId");
        //把 User的userId属性视为 XML属性,默认为XML的元素
        xstream.useAttributeFor(User.class, "userId");
        //去掉集合类型生成xml的父节点,即忽略 XML中的 <logs></logs>标记
        xstream.addImplicitCollection(User.class, "logs");
        //注册自定义转换器
        xstream.registerConverter(new DateConverter(Locale.SIMPLIFIED_CHINESE));
	}
	// 初始化转换对象
	public static void initUser() {
		LoginLog log1 = new LoginLog();
		LoginLog log2 = new LoginLog();
		log1.setIp("192.168.1.91");
		log1.setLoginDate(new Date());
		log2.setIp("192.168.1.92");
		log2.setLoginDate(new Date());
        u = new User();
		u.setUserId(1);
		u.setUserName("xstream");
		u.addLoginLog(log1);
		u.addLoginLog(log2);
	}
	 /**
     * JAVA对象转化为XML
     */
    public static void objectToXml()throws Exception{
    	initUser();
        FileOutputStream fs = new FileOutputStream(FILE_NAME);
        OutputStreamWriter writer = new OutputStreamWriter(fs, Charset.forName("UTF-8"));    
        xstream.toXML(u, writer);
    }
    
    /**
     * XML转化为JAVA对象
     */
    public static User xmlToObject()throws Exception{
    	FileInputStream fis = new FileInputStream(FILE_NAME);
    	InputStreamReader reader = new InputStreamReader(fis, Charset.forName("UTF-8")); 
        User u = (User) xstream.fromXML(fis);
        for(LoginLog log : u.getLogs()){
        	if(log!=null){
        		System.out.println("访问IP: " + log.getIp());
        		System.out.println("访问时间: " + log.getLoginDate());
            }
        }
        return u;
    }

    public static void main(String[] args)throws Exception {
    	FILE_NAME = ResourceUtils.getResourceFullPath(XStreamConverterSample.class, "XStreamConverterSample.xml");
        objectToXml();
        xmlToObject();
    }
}
