package com.spring.aop.Services;

import java.time.Instant;
import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("TwitterService")
@Scope("singleton")
public class TwitterService implements IMessageService {

	private String thedate = Date.from(Instant.now()).toString();
	
	public boolean sendMessage(String msg, String rec) {
		System.out.println("Twitter message Sent to "+rec+ " with Message="+msg + " date:"+ thedate);
		return true;
	}
	
}
