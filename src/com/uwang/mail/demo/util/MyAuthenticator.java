package com.uwang.mail.demo.util;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * 身份验证，后执行发送
 *
 */
public class MyAuthenticator extends Authenticator {
	
	String userName = null;
	String password = null;

	public MyAuthenticator() {
	}

	public MyAuthenticator(String username, String password) {
		this.userName = username;
		this.password = password;
	}

	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(userName, password);
	}
 
}