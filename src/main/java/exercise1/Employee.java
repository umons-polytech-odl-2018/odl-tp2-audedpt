package exercise1;

import exercise2.Payable;

public abstract class Employee implements Payable {

	private String name;
	private int Sales = 0;
	private int workedHours =0;

	//public abstract int  computeSalary();

	public Employee (String name){
		this.name = name;
	}

	public void sell() {
		Sales++;
	}

	public void workOneHour() {
		workedHours++;
	}

	public String getName() {
		return name;
	}
	public int getSales (){return Sales;}
	public int getWorkedHours (){return workedHours;}


}

