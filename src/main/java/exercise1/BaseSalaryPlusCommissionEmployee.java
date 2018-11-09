package exercise1;

public class BaseSalaryPlusCommissionEmployee extends Employee {
	//int Sales;
	int commission;
	int baseSalary;

	public BaseSalaryPlusCommissionEmployee(String name, int baseSalary, int commission) {
		super(name);
		//Sales = super.getSales();
		this.commission = commission;
		this.baseSalary = baseSalary;
	}

	public int computeSalary() {
		return baseSalary+getSales()*commission;
	}
}
