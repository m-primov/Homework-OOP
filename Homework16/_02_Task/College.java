package _02_Task;

public class College {

	public static void main(String[] args) {
		Student ivan = new Student("Ivan", "Java", 21);
		ivan.setGrade(3.88);
		Student georgi = new Student("Georgi", "Java", 26);
		georgi.setGrade(5.67);
		Student misho = new Student ("Mihail", "Javascript", 29);
		misho.setGrade(5.87);
		Student aleksandra = new Student("Aleksandra", "Java", 22);
		aleksandra.setGrade(5.00);
		Student tedi = new Student("Teodora", "Java", 24);
		tedi.setGrade(6.00);
		Student kris = new Student("Kristian", "Javascript", 27);
		kris.setGrade(5.01);
		Student maria = new Student("Maria", "Java", 25);
		maria.setGrade(5.99);
		Student eli = new Student("Elisaveta", "Python", 20);
		eli.setGrade(3.25);
		
		StudentGroup java = new StudentGroup("Java");
		java.addStudent(ivan); // added
		java.addStudent(georgi); // added
		java.addStudent(misho); // not added
		java.addStudent(aleksandra); // added
		java.addStudent(maria); // added
		java.addStudent(tedi); // added
		StudentGroup javascript = new StudentGroup("Javascript");
		javascript.addStudent(misho); // added
		javascript.addStudent(ivan); // not added
		javascript.addStudent(kris); // added
		StudentGroup php = new StudentGroup("PHP");
		
		georgi.receiveScholarship(5.50, 600);
		misho.receiveScholarship(5.50, 600);
		tedi.receiveScholarship(5.50, 600);
		kris.receiveScholarship(5, 600);
		
		ivan.upYear();
		aleksandra.upYear();
		System.out.println("The student with best grade in group " + java.getGroupSubject() + " is " + 
					java.theBestStudent());
		System.out.println("The student with best grade in group " + java.getGroupSubject() + " is " + 
																			javascript.theBestStudent());
		
		System.out.println(java.toString());
		
		
	}

}
