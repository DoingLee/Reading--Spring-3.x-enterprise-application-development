package com.baobaotao.oxm.xmlbeans;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.baobaotao.oxm.xmlbeans.UserType.Logs;
import com.baobaotao.utils.ResourceUtils;

public class TestXmlBeansSample {

	@Test
	public void objectToXml() throws Exception {
		XmlbeansSample.objectToXml();
	}

	@Test
	public void xmlToObject() throws Exception {
		XmlbeansSample.objectToXml();
		UserType[] users = XmlbeansSample.xmlToObject();
		assertNotNull(users);
		for (UserType u : users) {
			assertNotNull(u.getLogs());
			Logs userlog = u.getLogs();
			LogType[] logs = userlog.getLoginLogArray();
			for (LogType log : logs) {
				assertNotNull(log);
				assertNotNull(log.getIp());
				assertNotNull(log.getLoginDate());
			}
		}

	}
}
