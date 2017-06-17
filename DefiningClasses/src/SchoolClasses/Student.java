package SchoolClasses;

public class Student extends Human implements Comparable<Student> {

	public int grade;

	public Student(String firstname, String secondname, int grade) {
		super(firstname, secondname);
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public int compareTo(Student other) {
		int compareGrade = ((Student) other).getGrade();
		return compareGrade - this.grade;
	}
}
