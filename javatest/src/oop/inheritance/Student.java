package oop.inheritance;

public class Student extends person{
	private int id;
	
	public Student() {
	}	
	public Student(String name, int age, int id) {
		super(name,age);
		this.id = id;
	}
	public void print() {
		System.out.println("�� �� : "+getName()+" �� �� : "+getAge()+" ��    �� : "+this.id);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
