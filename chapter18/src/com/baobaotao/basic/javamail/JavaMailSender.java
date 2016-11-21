package com.baobaotao.basic.javamail;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class JavaMailSender {
	public static void main(String[] args) {
		Transport transport = null;
		try {
			Properties props = new Properties();
			props.put("mail.smtp.host", "smtp.163.com");
			props.put("mail.smtp.auth", "true");
			Authenticator auth = new Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("masterspring", "spring");
				}
			};
			Session session = Session.getDefaultInstance(props, auth);
			Message msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress("masterspring@163.com"));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(
					"masterspring@sina.com"));

			msg.setSubject("Test Title");
			msg.setSentDate(new Date());
			msg.setText("How are you!!");
			transport = session.getTransport("smtp");
			transport.send(msg);
			System.out.println("邮件发送成功!");
		} catch (MessagingException m) {
			System.out.println("邮件发送失败!");
			m.printStackTrace();
		} finally {
			try {
				transport.close();
			} catch (Exception e) {
			}			
		}
	}
}
