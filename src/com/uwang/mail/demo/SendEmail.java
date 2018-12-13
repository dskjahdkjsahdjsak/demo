package com.uwang.mail.demo;

import java.io.File;

import java.io.FileReader;

import com.uwang.mail.demo.util.MailSenderInfo;
import com.uwang.mail.demo.util.SimpleMailSender;

/**
 * 发送邮件客户端
 *
 */
public class SendEmail {

	public static void main(String[] args) {
			send();
		
//		System.out.println(getString());	
		
	}
	
	public static void send(){
		// 这个类主要是设置邮件
		MailSenderInfo mailInfo = new MailSenderInfo();
		
		// 设置协议服务地址
		mailInfo.setMailServerHost(mailInfo.getMailServerHost());
		// 设置端口
		mailInfo.setMailServerPort(mailInfo.getMailServerPort());
		mailInfo.setValidate(true);
		
		
		// 发送邮件者
		mailInfo.setUserName("1107040585@qq.com");
		// 您的邮箱密码（现在已经改成授权码）
		mailInfo.setPassword("xfhljrumvyfuijia");
		// 昵称
		mailInfo.setFromAddress("1107040585@qq.com");
		// 发给谁
		mailInfo.setToAddress("1479407285@qq.com");
		// 设置邮件标题
		mailInfo.setSubject("66666666");
		// 设置邮件内容
		mailInfo.setContent("666666666");
//		 这个类主要来发送邮件
		SimpleMailSender.sendTextMail(mailInfo); // 执行发送普通文本
//		SimpleMailSender.sendHtmlMail(mailInfo);// 发送html格式
		System.out.println("发送成功");

	}
	
	/**
	 * 拼成HTML文件
	 * @return
	 */
	public static StringBuffer getString(){
		StringBuffer sb = new StringBuffer();
		try {
			FileReader fileReader=new FileReader(new File("./mail.properties"));
			char cha[]=new char[1024];
			int len= 0;
			while ( (len=fileReader.read(cha)) != -1) {
				
				sb.append(new String(cha, 0, len));
			}
			fileReader.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return sb;
	}
}
