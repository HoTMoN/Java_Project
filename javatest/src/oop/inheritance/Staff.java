package oop.inheritance;

public class Staff extends person {
	private String dept;

	public Staff() {
		
	}
	public Staff(String name, int age, String dept) {
		super(name,age);
		this.dept = dept;
	}

	public void print() {
		super.print();
		System.out.println(" ºÎ    ¼­ : "+this.dept);
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
}
