package src.servermodule;

public class Server implements AbstractComputerInterface{

	private String ram;
	private String ssd;
	private String cpu;
	private boolean isGraphicalEnabled;
	private boolean isBluetoothEnabled;
	
	public Server(String ram, String ssd, String cpu, boolean isGraphicalEnabled, boolean isBluetoothEnabled) {
		super();
		this.ram = ram;
		this.ssd = ssd;
		this.cpu = cpu;
		this.isGraphicalEnabled = isGraphicalEnabled;
		this.isBluetoothEnabled = isBluetoothEnabled;
	}
	
	@Override
	public Computer createComputer() {
		return new Server(ram, ssd, cpu, isGraphicalEnabled, isBluetoothEnabled);
	}

	@Override
	public String ram() {
		return ram;
	}

	@Override
	public String ssd() {
		return ssd;
	}

	@Override
	public String cpu() {
		return cpu;
	}

	@Override
	public boolean isGraphicalEnabled() {
		return isGraphicalEnabled;
	}

	@Override
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	@Override
	public String toString() {
		return "Server [ram=" + ram + ", ssd=" + ssd + ", cpu=" + cpu + ", isGraphicalEnabled=" + isGraphicalEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}
}
