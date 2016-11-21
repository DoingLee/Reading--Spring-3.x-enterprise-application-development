package com.baobaotao.oxm.jaxb;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;
import com.baobaotao.domain.jaxb.LoginLog;
import com.baobaotao.domain.jaxb.User;
import com.baobaotao.utils.ResourceUtils;

public class TestJaxbSample {
	
	@Test
	public void objectToXml()throws Exception  {
		JaxbSample.objectToXml();
	}

	@Test
	public void xmlToObject()throws Exception {
		JaxbSample.objectToXml();
		User u = JaxbSample.xmlToObject();
		assertNotNull(u);
		assertEquals("jaxb", u.getUserName());
		for (LoginLog log :  u.getLogs().getLoginLog()) {
			assertNotNull(log);
			assertNotNull(log.getIp());
			assertNotNull(log.getLoginDate());
		}

	}

}
