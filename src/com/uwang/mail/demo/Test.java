package com.uwang.mail.demo;

import com.liem.mail.MailModel;
import com.liem.mail.MailTo;

public class Test {
	public static void main(String[] args) {
		// 得到MailModel对象
		MailModel mailModel = MailModel.getInstance("mail.properties");
		// 设置收件人,多人接收
		// mailModel.setToAddress("996052600@qq.com,907702688@qq.com");
		// 单人接收
		mailModel.setToAddress("1479407285@qq.com");
		// 设置邮件标题
		mailModel.setSubject("这是一个邮件标题");
		// 设置邮件内容
		String code ="xxxxxxx";
		mailModel.setContent("这是邮件内容，验证码为：" + code);
		// 设置附件
//		mailModel.setAttachFileNames(new String[] {"H:\\zuomian\\timg.jpg"});
		// 这个类主要来发送邮件
		Boolean result = MailTo.sendEmail(mailModel, MailTo.SEND_TEXT);
		
		System.out.println(result ? "发送成功" : "发送失败");
	}
}
