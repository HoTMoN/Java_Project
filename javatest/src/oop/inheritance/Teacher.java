package oop.inheritance;

public class Teacher extends person{
	private String subject;
	
	public Teacher() {	
	}
	
	public Teacher(String name, int age, String subject) {
		super(name,age);
		this.subject = subject;
	}
	
	public void print() {
		System.out.println("�� �� : "+getName()+" �� �� : "+getAge()+" ������ : "+this.subject);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}
