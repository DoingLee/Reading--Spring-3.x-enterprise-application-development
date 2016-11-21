package com.baobaotao.oxm.jibx;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import com.baobaotao.domain.LoginLog;
import com.baobaotao.domain.User;

public class TestJibxSample {

	@Test
	public void objectToXml()throws Exception {
		JibxSample.objectToXml();
	}

	@Test
	public void xmlToObject() throws Exception {
		JibxSample.objectToXml();
		User u = JibxSample.xmlToObject();
		assertNotNull(u);
		assertEquals("jibx", u.getUserName());
		for (LoginLog log : u.getLogs()) {
			assertNotNull(log);
			assertNotNull(log.getIp());
			assertNotNull(log.getLoginDate());
		}

	}
}
