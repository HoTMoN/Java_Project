package api.lang;

public class CG_Person {
	String name;
	int age;
	String addr;
	public CG_Person() {
	}
	
	public CG_Person(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	//ObjectŬ������ toString�������̵�
//	public String toString() {
//		return "����:"+getName()+",+����:"+getAge()+",�ּ�:"+getAddr();
	@Override
	public String toString() {
		return "����:"+name+",����:"+age+",�ּ�:"+addr;
	}
}