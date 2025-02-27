package src.servermodule;

public class ComputerFactory {
	
	//private constructor
	private ComputerFactory() {
		
	}
	
	
	public static Computer getComputer(AbstractComputerInterface abstractComputerInterface) {
		return abstractComputerInterface.createComputer();
	}

}
