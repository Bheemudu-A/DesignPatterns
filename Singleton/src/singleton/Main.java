package singleton;

public class Main {

	public static void main(String[] args) {
		
		Logger loger1 = new Logger();
		Logger loger2 = new Logger();
		Logger loger3 = new Logger();
		
		
		
		loger2.deposit("Siri", 900);
		loger3.withdraw("Siri", 2000);
		loger1.deposit("Bheem", 100);
		loger2.withdraw("Bheem", 500);
		loger1.transaction("Srinu", "Bheem", 400);
		
		
		SingletonLogger sloger1 = SingletonLogger.getInstance();
		SingletonLogger sloger2 = SingletonLogger.getInstance();
		SingletonLogger sloger3 = SingletonLogger.getInstance();
		
		System.out.println("------------------------");
		
		sloger1.deposit("Bheem", 100);
		sloger2.withdraw("Bheem", 500);
		sloger1.transaction("Srinu", "Bheem", 400);
		sloger2.deposit("Siri", 900);
		sloger3.withdraw("Siri", 2000);
		
		//check if only one instance is created
		System.out.println("sloger1 : "+sloger1 +" sloger2 : "+sloger2);
		
	}
}
