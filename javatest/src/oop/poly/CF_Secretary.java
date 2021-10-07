package oop.poly;

public class CF_Secretary extends CF_Employee implements CF_Bonus{
	
	public CF_Secretary() {	
		super();
	}
	
	public CF_Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	
	public double tax(){
		return getSalary()*10/100;
	}
	@Override
	public void incentive(int pay) {
		setSalary(getSalary()+(int)(pay*0.8));
	}

}

