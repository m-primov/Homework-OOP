package _01_Task;

public class Task {
	private String name;
	private static int workingHours; // how many hours remain to complete the task
	
	public Task(String name, int workingHours) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
		
		if (workingHours > 0) {
			Task.workingHours = workingHours;
		}
	}
	
	public int getWorkingHours() {
		return Task.workingHours;
	}
	
	public String getName() {
		return this.name;
	}
}
