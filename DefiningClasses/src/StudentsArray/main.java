package StudentsArray;

import java.util.Arrays;

import SchoolClasses.Student;
import SchoolClasses.Worker;

public class main {

	public static void main(String[] args) {
		Student[] students = new Student[10];
		
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student("student" + i, "student", i);
		}

		Arrays.sort(students);
		for (Student student : students) {
			System.out.println(student.getGrade());
		}
		
		Worker[] worker = new Worker[10];
		
		for (int i  = 0; i < worker.length; i++) {
			worker[i] = new Worker("Worker" + i,"LastName" + i , i + 10, i + 5 );
		}
		
		Arrays.sort(worker);
        for (Worker worker2 : worker) {
			System.out.println(worker2.getWeekSalary());
		}
	}

}
