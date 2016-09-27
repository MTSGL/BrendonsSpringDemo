package com.spring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring.aop.Services.IMessageService;


@Component		//Signals to Spring that this is a component which is what spring looks for when configuring the container
//@Service
public class MyApplication {
	//field-based dependency injection
	@Autowired
	@Qualifier("EmailService") 
	private IMessageService service;
	
	//Constructor-based dependency injection	
//	@Autowired
//	public MyApplication(@Qualifier("EmailService") IMessageService svc){
//		this.service=svc;
//	}
		
	//Setter based dependency injection
//	@Autowired
//	public void setService(@Qualifier("EmailService") IMessageService svc){
//		this.service=svc;
//	}
//	
	public boolean processMessage(String msg, String rec){
		//some magic like validation, logging etc
		return this.service.sendMessage(msg, rec);
	}
}
