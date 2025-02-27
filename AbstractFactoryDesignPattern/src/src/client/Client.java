package src.client;

import src.servermodule.Computer;
import src.servermodule.ComputerFactory;
import src.servermodule.Laptop;
import src.servermodule.PC;
import src.servermodule.Server;

public class Client {
	
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer(new Laptop( "16 GB", "512 SSD", "2,89 HGZ", true, false));
		System.out.println("Laptop : "+pc.toString());
		Computer laptop = ComputerFactory.getComputer(new PC( "16 GB", "512 SSD", "2,89 HGZ", true, false));
		System.out.println("PC : "+laptop.toString());
		Computer server = ComputerFactory.getComputer(new Server("2 GB", "1024 SSD", "5,34 HGZ", false, false));
		System.out.println("Server : "+server.toString());
	}

}
