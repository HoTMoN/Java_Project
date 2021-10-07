package oop.poly;

public class CF_Sales extends CF_Employee implements CF_Bonus{

	public CF_Sales() {	
	}
	
	public CF_Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	
	public double tax(){
		return getSalary()*13/100;
	}
	@Override
	public void incentive(int pay) {
		setSalary(getSalary()+(int)(pay*1.2));
	}

}
