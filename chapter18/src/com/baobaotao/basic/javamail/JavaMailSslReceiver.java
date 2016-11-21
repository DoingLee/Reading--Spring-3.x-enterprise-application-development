package com.baobaotao.basic.javamail;

import java.io.UnsupportedEncodingException;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeUtility;

public class JavaMailSslReceiver {

	public static void main(String argv[]) throws Exception {
		Properties props = new Properties();
		Session session = Session.getDefaultInstance(props);
		URLName urln = new URLName("pop3s", "pop.gmail.com", 995, null,
				"masterspring3", "masterspring");
		Store store = session.getStore(urln);
		
		Folder inbox = null;
		try {
			store.connect();
			inbox = store.getFolder("INBOX");
			inbox.open(Folder.READ_ONLY);
			FetchProfile profile = new FetchProfile();
			profile.add(FetchProfile.Item.ENVELOPE);
			Message[] msgs = inbox.getMessages();
			inbox.fetch(msgs, profile);
			System.out.println("收件箱的邮件数：" + msgs.length);
			for (int i = 0; i < msgs.length; i++) {
				String from = msgs[i].getFrom()[0].toString();
				InternetAddress ia = new InternetAddress(from);
				System.out.println("-----------------------------");
				System.out.println("发送者:" + ia.getPersonal() + "/"
						+ ia.getAddress());
				System.out.println("标题:" + msgs[i].getSubject());
				System.out.println("大小:" + msgs[i].getSize());
				System.out.println("时间:" + msgs[i].getSentDate());
			}
		} finally {
			try {
				inbox.close(false);
			} catch (Exception e) {
			}
			try {
				store.close();
			} catch (Exception e) {
			}
		}
	}

	protected static String decodeText(String text)
			throws UnsupportedEncodingException {
		if (text == null)
			return null;
		if (text.startsWith("=?GB") || text.startsWith("=?gb"))
			text = MimeUtility.decodeText(text);
		else
			text = new String(text.getBytes("ISO8859_1"));
		return text;
	}

}
