package _01_Task;

public class Demo {

	public static void main(String[] args) {
		Task digGold = new Task("Dig gold", 18);
		Employee ivan = new Employee("Ivan");
		Employee gosho = new Employee("Georgi");
		ivan.setCurrentTask(digGold);
		gosho.setCurrentTask(digGold);
		
		ivan.work();
		ivan.work();
		
		gosho.work();
		
		System.out.println("Info for worker " + ivan.getName());
		ivan.showReport();
		System.out.println("===============");
		System.out.println("Info for worker " + gosho.getName());
		gosho.showReport();
	}

}
