package com.baobaotao.oxm;

import java.io.FileOutputStream;
import java.util.Date;
import javax.xml.transform.stream.StreamResult;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.oxm.castor.CastorMarshaller;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.oxm.jibx.JibxMarshaller;
import org.springframework.oxm.xmlbeans.XmlBeansMarshaller;
import org.springframework.oxm.xstream.XStreamMarshaller;
import org.unitils.UnitilsJUnit4;
import org.unitils.spring.annotation.SpringApplicationContext;
import org.unitils.spring.annotation.SpringBeanByType;
import com.baobaotao.domain.LoginLog;
import com.baobaotao.domain.User;
import com.baobaotao.utils.ResourceUtils;

import static org.junit.Assert.*;

@SpringApplicationContext( { "classpath:config/c" })
public class SpringOxmSampleTest extends UnitilsJUnit4 {
    private static  String FILE_NAME = "";

	@SpringBeanByType
	private XStreamMarshaller xstreamMarshaller;

	@SpringBeanByType
	private Jaxb2Marshaller jaxb2Marshaller;

	@SpringBeanByType
	private CastorMarshaller castorMarshaller;
	
	@SpringBeanByType
	private XmlBeansMarshaller xmlBeansMarshaller;
	
	@SpringBeanByType
	private JibxMarshaller jibxMarshaller;

	private User u;
	
	@BeforeClass
	public static void initClass(){
		FILE_NAME = ResourceUtils.getResourceFullPath(SpringOxmSample.class, "spring-oxm-sample.xml");
	}

	@Before
	public void init() {
		LoginLog log1 = new LoginLog();
		log1.setIp("192.168.1.91");
		log1.setLoginDate(new Date());
		LoginLog log2 = new LoginLog();
		log2.setIp("192.168.1.92");
		log2.setLoginDate(new Date());
		u = new User();
		u.setUserName("spring-oxm");
		u.addLoginLog(log1);
		u.addLoginLog(log2);
		
	}

	@Test
	public void marshaller()throws Exception {
		assertNotNull(xstreamMarshaller);
		assertNotNull(jaxb2Marshaller);
		assertNotNull(castorMarshaller);
		assertNotNull(xmlBeansMarshaller);
		assertNotNull(jibxMarshaller);

		FileOutputStream os = null;
		try {
			os = new FileOutputStream(FILE_NAME);
			xstreamMarshaller.marshal(u, new StreamResult(os));
			//jaxb2Marshaller.marshal(u, new StreamResult(os));
			//castorMarshaller.marshal(u, new StreamResult(os));
			//xmlBeansMarshaller.marshal(u, new StreamResult(os));
			//jibxMarshaller.marshal(u, new StreamResult(os));
		} finally {
			if (os != null) {
				os.close();
			}
		}
	}

}
