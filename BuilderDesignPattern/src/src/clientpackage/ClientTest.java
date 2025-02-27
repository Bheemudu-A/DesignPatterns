package src.clientpackage;
import src.servermodule.Laptop;



public class ClientTest {
	
	public static void main(String[] args) {
		
		//flexibilty of builder pattern is we can ignore optional fields
		Laptop laptop = new Laptop.LaptopBuilder("8GB", "256 GB", "2,23 HZ").build();
		  System.out.println("laptop : "+laptop.toString());
		  
		  Laptop withAllfields = new Laptop.LaptopBuilder("4GB", "128 GB", "2,01 HZ").setBluetoothEnabled(true).setGraphicalEnabled(false).build();
		  System.out.println("laptop withAllfields : "+laptop.toString());
	}

}
