package oop.basic;

public class Staff {
	private String name;
	private int age;
	private String dept;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void print() {
		System.out.println("�� �� : "+this.name+" �� �� : "+this.age+" ��    �� : "+this.dept);
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getDept() {
		return this.dept;
	}

}
