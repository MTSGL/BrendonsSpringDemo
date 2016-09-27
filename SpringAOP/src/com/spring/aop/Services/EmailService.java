package com.spring.aop.Services;

import java.time.Instant;
import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("EmailService")
@Scope("prototype")
public class EmailService implements IMessageService {
	private String thedate = Date.from(Instant.now()).toString();
	
	public boolean sendMessage(String msg, String rec) {
		System.out.println("Email Sent to "+rec+ " with Message="+msg + " date:"+ thedate);
		return true;
	}

}
