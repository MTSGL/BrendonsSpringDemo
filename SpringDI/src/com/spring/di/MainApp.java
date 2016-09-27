package com.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) throws InterruptedException {

		// Load the bean definitions into the application context
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		MainApp app = new MainApp();

//		// Show singleton scope
//		app.RunHelloWorldSingleton(context);
//
//		 //Sleep for 2 seconds
//		Thread.sleep(2000);
//
//		 //Show singleton scope
//		app.RunHelloWorldSingleton(context);
//
//		System.out.println("");
//		
//
////		*********************  Demo Prototype
////		  //Show prototype scope 
//		app.RunHelloWorldPrototype(context);
////		  
////		  //Sleep for 2 seconds 
//		Thread.sleep(2000);
////		  
////		  //Show singleton scope 
//		app.RunHelloWorldPrototype(context);
////		 
//		System.out.println("");

//		*********************  Demo Child config
		app.RunHelloIndia(context);
//		
		System.out.println("");
		
		
		
//		*********************  Demo Injection with interface
//		TextEditor_WithOutDependencies te = (TextEditor_WithOutDependencies) context.getBean("textEditor");
//	    te.ProcessText("The quick brown fox");
	   
		
		
		
		
		// Does a graceful shutdown calling destroy methods on all the singleton
		// beans
		context.registerShutdownHook();
	}

	public void RunHelloWorldSingleton(ApplicationContext context) {
		HelloWorldWithProperties helloWorldClassSingleton = (HelloWorldWithProperties) context
				.getBean("helloWorldSingletonScope");
		helloWorldClassSingleton.getMessage();
	}

	public void RunHelloWorldPrototype(ApplicationContext context) {
		HelloWorldWithProperties helloWorldClassPrototype = (HelloWorldWithProperties) context
				.getBean("helloWorldPrototypeScope");
		helloWorldClassPrototype.getMessage();
	}

	public void RunHelloIndia(ApplicationContext context) {
		HelloWorldWithProperties helloWorldClassPrototype = (HelloWorldWithProperties) context
				.getBean("helloIndia");
		helloWorldClassPrototype.getMessage();
		helloWorldClassPrototype.getMessage2();
	}	
	
	
}