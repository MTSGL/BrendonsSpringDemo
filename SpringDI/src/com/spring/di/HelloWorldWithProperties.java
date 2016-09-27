package com.spring.di;

import java.time.Instant;
import java.util.Date;

public class HelloWorldWithProperties {
	private String message;
	private String message2;


	private String thedate = Date.from(Instant.now()).toString();
	
	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message + " date:" + thedate);
	}

	public void getMessage2() {
		System.out.println("Message2 : " + message2);
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}
	
}