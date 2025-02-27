package singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SingletonLogger {
	
	private static String fileName = "src/singleton/singleLog.txt";
 
	 private PrintWriter printwriter;
    
    private static SingletonLogger singletonLogger = null;
    
    //constructor should be private	because it should not be accessible from outside
    private SingletonLogger() {
    	try {
    		FileWriter filewriter = new FileWriter(fileName);
    		printwriter = new PrintWriter(filewriter, true);
    	} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    
    public static SingletonLogger getInstance() {
    	if(singletonLogger == null) {		
    		synchronized (SingletonLogger.class) {
    			if(singletonLogger == null) {
    				singletonLogger = new SingletonLogger();
    			}
    		}
    	}
    	return singletonLogger;
    }
    
    
    //we can make method syncronized but, it can block many threads, making synchronized at field level only if instance is null
 /*   public static synchronized SingletonLogger getInstance() {
    	if(singletonLogger == null) {		 		
    				 singletonLogger = new SingletonLogger();		
    	}
    	return singletonLogger;
    }*/
    
    protected void withdraw(String account, int amount) {
		printwriter.println("Account : "+ account+" amount : "+amount);
    //	System.out.println("Account : "+ account+" amount : "+amount);
	}
	
	
	protected void deposit(String account, int amount) {
		printwriter.println("Account : "+ account+" amount : "+amount);
	//	System.out.println("Account : "+ account+" amount : "+amount);
	}
	
	protected void transaction(String sender, String reciver, int amount) {
		printwriter.println("sender : "+ sender+   " reciver : "+reciver+" amount : "+amount);
	//	System.out.println("sender : "+ sender+   " reciver : "+reciver+" amount : "+amount);
	}
	
	
}
