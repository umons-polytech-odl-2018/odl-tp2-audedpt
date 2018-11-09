package exercise1;

import exercise2.Payable;

public abstract class Employee implements Payable {
	private String name;
	private int sales = 0;
	private int workedHours = 0;

	public Employee(String name){
		this.name = name;
	}


	public void sell() {
		sales++;
	}

	public void workOneHour() {
		workedHours++;
	}

	public String getName() { return name; }
	public int getSales() {return sales;}
	public int getWorkedHours() {return workedHours;}
}
