package _02_Task;

public class Student {
	private String name;
	private String subject;
	private double grade;
	private int yearInCollege;
	private int age;
	private boolean isDegree;
	private double money;
	
	public Student() {
		this.grade = 4.0;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;
	}
	
	public Student(String name, String subject, int age) {
		this();
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}		
		if (subject != null && !subject.isEmpty()) {
			this.subject = subject;
		}
		if (age > 18) {
			this.age = age;
		}
	}
	
	public String getSubject() {
		return this.subject;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getGrade() {
		return this.grade;
	}
	
	public void setGrade(double grade) {
		if ((grade >= 2 && grade <= 6)) {
			this.grade = grade;
		}
	}

	public int getYearInCollege() {
		return yearInCollege;
	}

	public int getAge() {
		return age;
	}

	public boolean isDegree() {
		return isDegree;
	}

	public double getMoney() {
		return money;
	}

	public void upYear() {
		if (!isDegree) {
			this.yearInCollege++;
			if (this.yearInCollege == 4) {
				this.isDegree = true;
			}
		} else {
			System.out.println("The student have already degree.");
		}
	}
	
	public double receiveScholarship(double min, double amount) {
		if ((min > 2 && min <= 6) && amount > 0) {
			if (this.grade >= min && this.age < 30) {
				this.money += amount;
			} else {
				System.out.println("Student " + this.name + " cannot receive scholarship");
			}
		} else {
			System.out.println("Invalid input for minimum grade or scholarship amount.");
		}
		
		return this.money;
	}
}
