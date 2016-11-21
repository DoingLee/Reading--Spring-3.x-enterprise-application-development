package com.baobaotao.basic.freemarker;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import freemarker.template.Template;

public class FreeMarkerHello {
	public static void main(String[] args) throws Throwable{
		  String[] paths = new String[]{"applicationContext.xml"};
          ApplicationContext ctx = new ClassPathXmlApplicationContext(paths);
          FreeMarkerConfigurer fmc = (FreeMarkerConfigurer)ctx.getBean("mailTemplateEngine");
          Template t = fmc.getConfiguration().getTemplate("simple.ftl");
          Map map = new HashMap();
          Book book = new Book();
          book.setName("中国人");
          map.put("book",book);
          String str = FreeMarkerTemplateUtils.processTemplateIntoString(t, map);
          System.out.println("str:"+str);
	}
}
