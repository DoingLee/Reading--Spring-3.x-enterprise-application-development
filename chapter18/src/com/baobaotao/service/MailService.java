package com.baobaotao.service;

import java.util.HashMap;
import java.util.Map;

import javax.mail.BodyPart;
import javax.mail.MessagingException;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.task.TaskExecutor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;

import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import freemarker.template.Template;

@Service
public class MailService {
	
	@Autowired
	private JavaMailSender sender;
	
	@Autowired
	private FreeMarkerConfigurer freeMarkerConfigurer;
	
	@Autowired
	private TaskExecutor taskExecutor;

	public void sendSimpleMail(int userId) {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setFrom("masterspring@163.com");
		msg.setTo("masterspring3@gmail.com");
		msg.setReplyTo("masterspring@163.com");
		msg.setCc("masterspring@sina.com");
		msg.setSubject("注册成功");
		msg.setText("恭喜，您在宝宝淘论坛已经注册成功!您的用户ID为：" + userId);
		sender.send(msg);
	}
	
	public void sendHtmlMail(int userId) throws MessagingException {
		MimeMessage msg = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(msg, false, "utf-8");
		helper.setFrom("masterspring@163.com");
		helper.setTo("masterspring3@gmail.com");
		helper.setSubject("注册成功");
		String htmlText = "<html><head>"
				+ "<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\">"
				+ "</head><body>" + "恭喜，您在宝宝淘论坛已经注册成功!您的用户ID为："
				+ "<font size='20' size='30'>" + userId + "</font>"
				+ "</body></html>";
		helper.setText(htmlText, true);
		sender.send(msg);
	}

	public void sendInlineMail() throws MessagingException {
		MimeMessage msg = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(msg, true, "utf-8");
		helper.setFrom("masterspring@163.com");
		helper.setTo("masterspring3@gmail.com");
		helper.setSubject("注册成功");
		String htmlText = "<html><head>"
				+ "<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\">"
				+ "</head><body>" + "欢迎访问宝宝淘论坛！</hr>"
				+ "<div><img src=\"cid:img01\"></img></div>" + "</body></html>";
		helper.setText(htmlText, true);
		ClassPathResource img = new ClassPathResource("bbt.gif");
		helper.addInline("img01", img);
		sender.send(msg);
	}

	public void sendAttachmentMail() throws Exception {
		MimeMessage msg = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(msg, true, "utf-8");
		helper.setFrom("masterspring@163.com");
		helper.setTo("masterspring3@gmail.com");
		helper.setSubject("注册成功");
		helper.setText("欢迎访问宝宝淘论坛！");
		ClassPathResource file1 = new ClassPathResource("bbt.zip");
		helper.addAttachment("file01.zip", file1.getFile());
		ClassPathResource file2 = new ClassPathResource("file.doc");
		helper.addAttachment("file02.doc", file2.getFile());
		sender.send(msg);
	}

	public void sendAlternativeMail() throws Exception {
		MimeMessagePreparator mmp = new MimeMessagePreparator() {
			public void prepare(MimeMessage msg) throws Exception {
				MimeMessageHelper helper = new MimeMessageHelper(msg, true,
						"utf-8");
				helper.setFrom("masterspring@163.com");
				helper.setTo("masterspring3@gmail.com");
				helper.setSubject("注册成功");

				MimeMultipart mmPart = new MimeMultipart("alternative");
				msg.setContent(mmPart);

				BodyPart plainTextPart = new MimeBodyPart();
				plainTextPart.setText("欢迎访问宝宝淘论坛！");
				mmPart.addBodyPart(plainTextPart);

				BodyPart htmlPart = new MimeBodyPart();
				String htmlText = "<html><head>"
						+ "<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\">"
						+ "</head><body><font size='20' size='30'>"
						+ "欢迎访问宝宝淘论坛</font>" + "</body></html>";
				htmlPart.setContent(htmlText, "text/html;charset=utf-8");
				mmPart.addBodyPart(htmlPart);
			}
		};
		sender.send(mmp);
	}


	public void sendTemplateMail(int userId) throws MessagingException {
		MimeMessage msg = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(msg, false, "utf-8");
		helper.setFrom("masterspring@163.com");
		helper.setTo("masterspring3@gmail.com");
		helper.setSubject("注册成功:基于模板");
		String htmlText = getMailText(userId);
		helper.setText(htmlText, true);
		sender.send(msg);
	}
	
	private String getMailText(int userId) {
		String htmlText = null;
		try {
			Template tpl = freeMarkerConfigurer.getConfiguration().getTemplate(
					"registerUser.ftl");
			Map map = new HashMap();
			map.put("userId", userId);
			htmlText = FreeMarkerTemplateUtils.processTemplateIntoString(tpl,
					map);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return htmlText;
	}


	public void sendAsyncMail(final int userId) {
		taskExecutor.execute(new Runnable() {
			public void run() {
				try {
					sendTemplateMail(userId);
					System.out.println("邮件发送成功！");
				} catch (Exception e) {
					System.out.println("邮件发送失败！，异常信息：" + e.getMessage());
				}
			}
		});
	}
}
