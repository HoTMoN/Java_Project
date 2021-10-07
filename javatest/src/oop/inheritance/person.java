package oop.inheritance;

public class person {
	private String name;
	protected int age;
	public person() {
	}
	public person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void print() {
		System.out.print("이 름 : "+getName()+" 나 이 : "+getAge());
	
	}
}
