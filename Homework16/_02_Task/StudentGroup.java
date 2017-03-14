package _02_Task;

public class StudentGroup {
	private String groupSubject;
	private Student[] students;
	private int freePlaces;
	
	public StudentGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
	}
	
	public StudentGroup(String subject) {
		this();
		if (subject != null && !subject.isEmpty()) {
			this.groupSubject = subject;
		}
	}
	
	public String getGroupSubject() {
		return this.groupSubject;
	}
	
	public void addStudent(Student student) {
		if (student.getSubject().equals(this.groupSubject)) {
			if (this.freePlaces > 0) {
				this.students[this.students.length - this.freePlaces] = student;
				this.freePlaces--;
			} else {
				System.out.println("No free places in group");
			}
		} else {
			System.out.println("Student subject is different from the group subject");
		}
	}
	
	public void emptyGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
	}
	
	public String theBestStudent() {
		String bestStudentName = this.students[0].getName();
		if (this.freePlaces < 4) {
			for (int i = 1; i < this.students.length - this.freePlaces; i++) {
				if (this.students[i].getGrade() > this.students[i-1].getGrade()) {
					bestStudentName = this.students[i].getName();
				}
			}
		}
		
		return bestStudentName;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (this.freePlaces < 5) {
			for (int i = 0; i < this.students.length - this.freePlaces; i++) {
				sb.append("=======Info for student number " + (i + 1) + 
						" in group with subject " + this.groupSubject + "=======" + "\n");
				sb.append("Name: " + this.students[i].getName() + "\n");
				sb.append("Subject: " + this.students[i].getSubject() + "\n");
				sb.append("Grade: " + this.students[i].getGrade() + "\n");
				sb.append("Year in college: " + this.students[i].getYearInCollege() + "\n");
				sb.append("Student age: " + this.students[i].getAge() + "\n");
				sb.append("Is degree student: " + this.students[i].isDegree() + "\n");
				sb.append("Money: " + this.students[i].getMoney() + "\n");
				//sb.append("=============================================================" + "\n");
			}
		} else {
			sb.append("No students in this group");
		}
		
		
		return sb.toString();
	}
}
