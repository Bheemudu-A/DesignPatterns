package src.servermodule;

public class Laptop{

	private String ram;
	private String ssd;
	private String cpu;
	private boolean isGraphicalEnabled;
	private boolean isBluetoothEnabled;
	
	
	public String getRam() {
		return ram;
	}
	
	public String getSsd() {
		return ssd;
	}

	public String getCpu() {
		return cpu;
	}

	public boolean isGraphicalEnabled() {
		return isGraphicalEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	public void setBluetoothEnabled(boolean isBluetoothEnabled) {
		this.isBluetoothEnabled = isBluetoothEnabled;
	}	
	
	private Laptop(LaptopBuilder laptopBuilder) {
		
		this.ram = laptopBuilder.ram;
		this.cpu = laptopBuilder.cpu;
		this.ssd = laptopBuilder.ssd;	
		this.isBluetoothEnabled = laptopBuilder.isBluetoothEnabled;
		this.isGraphicalEnabled = laptopBuilder.isGraphicalEnabled;
	}

	
	public static class LaptopBuilder{
		
		private String ram;
		private String ssd;
		private String cpu;
		private boolean isGraphicalEnabled;
		private boolean isBluetoothEnabled;
		
		public LaptopBuilder(String ram, String ssd, String cpu) {
			this.ram = ram;
			this.ssd = ssd;
			this.cpu = cpu;
		}

		public LaptopBuilder setGraphicalEnabled(boolean isGraphicalEnabled) {
			this.isGraphicalEnabled = isGraphicalEnabled;
			return this;
		}

		public LaptopBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
	
		public Laptop build() {		
			return new Laptop(this);
		}		
	}
	
	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", ssd=" + ssd + ", cpu=" + cpu + ", isGraphicalEnabled=" + isGraphicalEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}	
	
}
