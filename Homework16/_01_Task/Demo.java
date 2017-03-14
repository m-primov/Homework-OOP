package _01_Task;

public class Demo {

	public static void main(String[] args) {
		Computer homePC = new Computer(2016, 1999.99, 2000, 1500, "Windows 10 EDU");
		Computer workPC = new Computer(2016, 1839, 1000, 350, "Linux");
		
		homePC.setNotebook(true);
		workPC.setNotebook(false);
		
		homePC.useMemory(100);
		workPC.changeOperationSystem("Mac OS");
		
		System.out.println("Home PC characteristics:");
		System.out.println(homePC.toString());
		System.out.println("=========================");
		System.out.println("Work PC characteristics:");
		System.out.println(workPC.toString());
		
		System.out.println("=========================");
		
		Computer pc1 = new Computer();
		Computer pc2 = new Computer(2006, 600, 60, 15);
		Computer pc3 = new Computer(2016, 2000, true, 1000, 500, "Windows 10");
		
		if (pc2.comparePrice(pc3) < 0) {
			System.out.println("The price of computer manifactured in " + pc2.getYear() 
				+ " is bigger than the price of computer manifactured in " + pc3.getYear());
		} else if (pc2.comparePrice(pc3) > 0) {
			System.out.println("The price of computer manifactured in " + pc2.getYear() 
			+ " is smaller than the price of computer manifactured in " + pc3.getYear());
		} else {
			System.out.println("They have equal prices.");
		}
	}

}
