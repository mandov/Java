package SchoolClasses;

public class Worker extends Human implements Comparable<Worker> {
	public int WeekSalary;
	public int WorkHoursPerDay;

	public Worker(String firstname, String secondname, int weekSalary, int hoursPerWeek) {
		super(firstname, secondname);
		this.WeekSalary = weekSalary;
		this.WorkHoursPerDay = hoursPerWeek;
	}

	public double salaryPerHour() {
		double result = (double) this.WeekSalary / this.WorkHoursPerDay;
		return result;
	}

	public int getWeekSalary() {
		return WeekSalary;
	}

	public int compareTo(Worker other) {
		int compareSalary = ((Worker) other).getWeekSalary();
		return compareSalary - WeekSalary;
	}
}
