package _01_Task;

public class Computer {
	private int year;
	private double price;
	private boolean isNotebook;
	private int hardDiskMemory;
	private int freeMemory;
	private String operationSystem;
	
	
	
	public Computer(int year, double price, int hardDiskMemory, int freeMemory,
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
