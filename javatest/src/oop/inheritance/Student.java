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
		System.out.println("이 름 : "+getName()+" 나 이 : "+getAge()+" 학    번 : "+this.id);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
