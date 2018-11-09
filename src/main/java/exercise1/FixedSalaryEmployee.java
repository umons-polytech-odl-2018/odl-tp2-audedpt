package exercise1;

public class FixedSalaryEmployee extends Employee {
	private int mensualSalary;

	public FixedSalaryEmployee(String name, int mensualSalary){
		super(name);
		this.mensualSalary = mensualSalary;
	}

	public int computeSalary() {return  mensualSalary;}
}
