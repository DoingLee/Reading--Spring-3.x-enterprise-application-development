package com.baobaotao.service;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml" })
public class MailServiceTest{

	@Autowired
	private MailService mailService;


	@Test
	@Ignore
	public void testSendSimpleMail() {
		mailService.sendSimpleMail(100);
		System.out.println("发送成功！");
	}

	@Test
	@Ignore
	public void testSendHtmlMail() {
		try {
			mailService.sendHtmlMail(100);
			System.out.println("发送成功！");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	@Ignore
	public void testSendInlineMail() {
		try {
			mailService.sendInlineMail();
			System.out.println("发送成功！");
		} catch (Exception e) {
			System.out.println("发送失败！");
			e.printStackTrace();
		}
	}

	@Test
	@Ignore
	public void testSendAttachmentMail() {
		try {
			mailService.sendAttachmentMail();
			System.out.println("发送成功！");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("OK！");
	}

	@Test
	@Ignore
	public void testSendAlternativeMail() {
		try {
			mailService.sendAlternativeMail();
			System.out.println("发送成功！");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("OK！");
	}

	@Test
	@Ignore
	public void testSendTemplateMail() {
		try {
			long s = System.currentTimeMillis();
			mailService.sendTemplateMail(100);
			s = s - System.currentTimeMillis();
			System.out.println("s:" + s);
			System.out.println("发送成功！");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Test	
	public void testSendAsyncMail() {
		try {
			long s = System.currentTimeMillis();
			mailService.sendAsyncMail(100);
			s = s - System.currentTimeMillis();
			System.out.println("s:" + s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("调用结束！");
		try {
			Thread.sleep(15000);// 防止JVM停止导致执行器关闭
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
