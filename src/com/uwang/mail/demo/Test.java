package com.uwang.mail.demo;

import com.liem.mail.MailModel;
import com.liem.mail.MailTo;

public class Test {
	public static void main(String[] args) {
		// �õ�MailModel����
		MailModel mailModel = MailModel.getInstance("mail.properties");
		// �����ռ���,���˽���
		// mailModel.setToAddress("996052600@qq.com,907702688@qq.com");
		// ���˽���
		mailModel.setToAddress("1479407285@qq.com");
		// �����ʼ�����
		mailModel.setSubject("����һ���ʼ�����");
		// �����ʼ�����
		String code ="xxxxxxx";
		mailModel.setContent("�����ʼ����ݣ���֤��Ϊ��" + code);
		// ���ø���
//		mailModel.setAttachFileNames(new String[] {"H:\\zuomian\\timg.jpg"});
		// �������Ҫ�������ʼ�
		Boolean result = MailTo.sendEmail(mailModel, MailTo.SEND_TEXT);
		
		System.out.println(result ? "���ͳɹ�" : "����ʧ��");
	}
}
