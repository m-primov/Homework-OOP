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
	}

}
