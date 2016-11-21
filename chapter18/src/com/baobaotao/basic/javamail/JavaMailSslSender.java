package com.baobaotao.basic.javamail;

import java.security.Security;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.URLName;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class JavaMailSslSender {

	public static void main(String[] args) throws AddressException,
			MessagingException {
//		Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
		final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
		// Get a Properties object
		Properties props = System.getProperties();
		props.setProperty("mail.smtp.host", "smtp.gmail.com");
		props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
		props.setProperty("mail.smtp.socketFactory.fallback", "false");
		props.setProperty("mail.smtp.port", "465");
		props.setProperty("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.auth", "true");
		final String username = "masterspring3";
		final String password = "masterspring";
		Session session = Session.getDefaultInstance(props,
				new Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(username, password);
					}
				});
		Message msg = new MimeMessage(session);

		msg.setFrom(new InternetAddress(username + "@gmail.com"));
		
		msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(
				"masterspring@sina.com", false));
		msg.setSubject("Hello");
		msg.setText("How are you");
		msg.setSentDate(new Date());
		URLName urln = new URLName("smtps", "smtp.gmail.com", 465, null,
				username, password);
        Transport t = session.getTransport(urln);
		t.send(msg);

		System.out.println("Message sent.");
	}
}
