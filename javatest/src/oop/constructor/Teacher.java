package oop.constructor;

public class Teacher {
	private String name;
	private int age;
	private String subject;
	public Teacher() {
		
	}
	public Teacher(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	public void print() {
		System.out.println("이 름 : "+this.name+" 나 이 : "+this.age+" 담당과목 : "+this.subject);
	}
}
