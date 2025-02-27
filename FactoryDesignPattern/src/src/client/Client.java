package src.client;

import src.servermodule.Computer;
import src.servermodule.ComputerFactory;
import src.servermodule.ComputerType;

public class Client {
	
	public static void main(String[] args) {
		
		Computer pc = ComputerFactory.getComputer(ComputerType.PC, "8 GB", "256 SSD", "2,23 HGZ", true, false);
		System.out.println("Pc : "+pc.toString());
		Computer laptop = ComputerFactory.getComputer(ComputerType.LAPTOP, "16 GB", "512 SSD", "2,89 HGZ", true, false);
		System.out.println("Pc : "+laptop.toString());
		Computer server = ComputerFactory.getComputer(ComputerType.SERVER, "2 GB", "1024 SSD", "5,34 HGZ", false, false);
		System.out.println("Pc : "+server.toString());
	}

}
