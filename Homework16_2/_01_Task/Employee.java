package _01_Task;

public class Employee {
	private String name;
	private Task currentTask;
	private int hoursLeft; // worker hours left for the day
	private static int currentTaskHoursLeft;
	
	public Employee(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
		
		this.hoursLeft = 8;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setCurrentTask(Task currentTask) {
		if (currentTask != null) {
			this.currentTask = currentTask;
			Employee.currentTaskHoursLeft = currentTask.getWorkingHours();
		}
	}
	
	public void work() {
		if (this.hoursLeft == 0) {
			this.hoursLeft = 8;
		}
		if (this.currentTask != null) {
			if (this.hoursLeft <= Employee.currentTaskHoursLeft) {
				Employee.currentTaskHoursLeft -= this.hoursLeft;
				this.hoursLeft = 0;
			} else if (this.hoursLeft > Employee.currentTaskHoursLeft) {
				this.hoursLeft -= Employee.currentTaskHoursLeft;
				Employee.currentTaskHoursLeft = 0;
			} else {
				System.out.println("No current task for worker");
			}
		}
	}
	
	public void showReport() {
		if (this.currentTask != null) {
			System.out.println("Current worker: " + this.name + "\n" +
					   "Current task: " + this.currentTask.getName() + "\n" +
					   "Worker hours left for the day: " + this.hoursLeft + "\n" +
					   "Task hours left: " + Employee.currentTaskHoursLeft);
		} else {
			System.out.println("The worker " + this.name + " dont have task.");
		}
		
	}
}
