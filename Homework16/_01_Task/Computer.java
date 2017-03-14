package _01_Task;

public class Computer {
	private int year;
	private double price;
	private boolean isNotebook;
	private double hardDiskMemory;
	private double freeMemory;
	private String operationSystem;
	
	public Computer() {
		this.isNotebook = false;
		this.operationSystem = "Win XP";
	}
	
	public Computer(int year, double price, double hardDiskMemory, double freeMemory) {
		this();
		if (year >= 1950 && year <= 2017) {
			this.year = year;
		}
		if (price > 0) {
			this.price = price;
		}
		if (hardDiskMemory > 0) {
			this.hardDiskMemory = hardDiskMemory;
		}
		if (freeMemory > 0) {
			this.freeMemory = freeMemory;
		}
	}
	
	public Computer(int year, double price, boolean isNotebook, 
			double hardDiskMemory, double freeMemory, String operationSystem) {
		this(year, price, hardDiskMemory, freeMemory);
		this.isNotebook = isNotebook;
	}
	
	public Computer(int year, double price, double hardDiskMemory, double freeMemory,
			String operationSystem) {
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operationSystem = operationSystem;
	}

	public void setNotebook(boolean isNotebook) {
		this.isNotebook = isNotebook;
	}

	public boolean isNotebook() {
		return this.isNotebook;
	}
	
	public String getOperationSystem () {
		return this.operationSystem;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void changeOperationSystem(String newOperationSystem){
		this.operationSystem = newOperationSystem;
	}
	
	public void useMemory(int memory){
		if (memory > this.freeMemory) {
			System.out.println("Not enough free memory!");
		} else {
			this.freeMemory -= memory;
		}
	}
	
	public int comparePrice(Computer c) {
		if (this.price > c.price) {
			return -1;
		}
		if (this.price < c.price) {
			return 1;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Year of manufacture: " + this.year + "\n" +
							"Price(BGN): " + this.price + "\n" + 
							"Is notebook: " + this.isNotebook() + "\n" +
							"Hard disk capacity(GB): " + this.hardDiskMemory + "\n" +
							"Free memory(GB): " + this.freeMemory + "\n" +
							"Operation system: " + this.operationSystem);
		
		return sb.toString();
	}

	
}
