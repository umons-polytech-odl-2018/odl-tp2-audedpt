package exercise1;

public class WorkHourSalaryEmployee extends Employee {
	private int hourlyRoute;

	public WorkHourSalaryEmployee(String name, int hourlyRoute) {
		super(name);
		this.hourlyRoute = hourlyRoute;
	}

	public int computeSalary(){
		return (hourlyRoute*getWorkedHours());
	}
}
