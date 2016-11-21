package com.baobaotao.oxm.xstream;

import static org.custommonkey.xmlunit.XMLAssert.assertXpathExists;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.io.BufferedReader;
import java.io.FileReader;
import org.junit.Test;
import com.baobaotao.domain.LoginLog;
import com.baobaotao.domain.User;

public class TestXStreamSample {


	@Test
	public void objectToXml()throws Exception {
		XStreamSample.objectToXml();
		FileReader reader = new FileReader("D:\\masterSpring\\chapter14\\out\\XStreamSample.xml");
		BufferedReader br = new BufferedReader(reader);
		StringBuffer sb = new StringBuffer("");
		String s;
		while ((s = br.readLine()) != null) {
			sb.append(s);
		}
		System.out.println(sb.toString());
		reader.close();
		br.close();
		assertXpathExists("//com.baobaotao.domain.User",sb.toString());
		assertXpathExists("//credits",sb.toString());
		assertXpathExists("//userName",sb.toString());
		assertXpathExists("//com.baobaotao.domain.LoginLog",sb.toString());
	}

	@Test
	public void xmlToObject()throws Exception  {
		XStreamSample.objectToXml();
		User u = XStreamSample.xmlToObject();
		assertNotNull(u);
		assertEquals("xstream", u.getUserName());
		for (LoginLog log : u.getLogs()) {
			assertNotNull(log);
			assertNotNull(log.getIp());
			assertNotNull(log.getLoginDate());
		}

	}
}
