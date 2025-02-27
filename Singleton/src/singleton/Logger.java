package singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
	
	//for log.txt check in sytem explorer
	private static String fileName = "src/singleton/log.txt";
	private PrintWriter printwriter;
	
	
	public Logger() {
		 try {
			 FileWriter	filewriter = new FileWriter(fileName);
			 printwriter = new PrintWriter(filewriter, true);
		} catch (IOException e) {		
			e.printStackTrace();
		}
	}
	
	
	protected void withdraw(String account, int amount) {
		printwriter.println("Account : "+ account+" amount : "+amount);
		System.out.println("Account : "+ account+" amount : "+amount);
	}
	
	
	protected void deposit(String account, int amount) {
		printwriter.println("Account : "+ account+" amount : "+amount);
		System.out.println("Account : "+ account+" amount : "+amount);
	}
	
	protected void transaction(String sender, String reciver, int amount) {
		printwriter.println("sender : "+ sender+   " reciver : "+reciver+" amount : "+amount);
		System.out.println("sender : "+ sender+   " reciver : "+reciver+" amount : "+amount);
	}

}
