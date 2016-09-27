package com.what.is.di;
//
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
public class Class1 {
//	
//	private ILogger myLogger;
//	
//	public Class1(ILogger logger) {
//		myLogger = logger;
//	}
//	
//
//	public void DoStuff(){
//		
//		//New object
//		//ILogger myLogger = new Logger(null, null) { };	
//		
//		//ILogger myLogger = LoggerFactory.Create();
//		
//		myLogger.log(Level.INFO, "Hi im doing some stuff");
//		
//		
//		//Or static
//		//Logger.getAnonymousLogger().log(Level.INFO, "Hi im doing some stuff");
//		
//		
//	}
//	
}
//
//
//
//
//public class LoggerFactory {
//
//	public static Logger Create(){
//	
//		//New Logger
//		return new Logger(null, null) { };
//
//	}
//	
//}
//
//
//
//
//
//
//
//
//
//
//// want to add new FileLogger
//// dont want to replace all Logger with FileLogger
//// Use ILogger so all classes use an interface and this can change
//// move the instatiation to a factory  LoggerFactory.Create();
//// problem is that now all classes have dependency on LoggerFactory
//// Using injection move to contructor
//
//
