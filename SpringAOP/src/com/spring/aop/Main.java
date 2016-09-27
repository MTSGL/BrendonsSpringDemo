package com.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

		public static void main(String[] args) throws InterruptedException {
		
		//Tell spring to load the DI container using annotations
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.spring.aop"); //Pass the base package

		MyApplication app = context.getBean(MyApplication.class);	//Pass the class to tell spring what bean we want
		app.processMessage("Hello World", "brendon.frater@mtsgl.com");

		Thread.sleep(2000);
		app.processMessage("Hello World2", "brendon.frater@mtsgl.com");
		
		//close the context
		context.close();
	}

}
