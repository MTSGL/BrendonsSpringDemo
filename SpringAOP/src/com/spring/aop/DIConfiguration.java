package com.spring.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.aop.Services.EmailService;
import com.spring.aop.Services.IMessageService;
import com.spring.aop.Services.TwitterService;

@Configuration	//Lets spring know that this is a configuration class
@ComponentScan(value={"com.spring.aop"})	//Tells spring where to look for components
public class DIConfiguration {

//	@Bean
//	public IMessageService getMessageService(){
//		return new EmailService();
//	}

//	@Bean
//	public EmailService getEmailService(){
//		return new EmailService();
//	}	
//	
//	@Bean
//	public TwitterService getTwitterService(){
//		return new TwitterService();
//	}
	
}