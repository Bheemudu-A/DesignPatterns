package src.servermodule;

public class ComputerFactory {
	
	//private constructor
	private ComputerFactory() {
		
	}
	
	
	public static Computer getComputer(ComputerType computerType, String ram, String ssd, String cpu, boolean isGraphicalEnabled, boolean isBluetoothEnabled) {
		
		switch(computerType) {
		case PC:
			return new PC(ram, ssd, cpu, isGraphicalEnabled, isBluetoothEnabled);
		case SERVER:
			return new Server(ram, ssd, cpu, isGraphicalEnabled, isBluetoothEnabled);
		case LAPTOP:
			return new Laptop(ram, ssd, cpu, isGraphicalEnabled, isBluetoothEnabled);
		default:
			throw new RuntimeException("Invalid Computer Type Passed");	
		}
		
		
	}

}
