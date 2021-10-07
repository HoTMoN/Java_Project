package oop.basic;

public class PersonTest {
	public static void main(String[] args) {
		//Person클래스의 객체생성
		Person p1 = new Person();
		//생성된 객체의 맴버변수에 값 셋팅하기
		p1.name = "장동건";
		p1.age = 45;
		p1.addr = "서울시";
		System.out.println("이름:"+p1.name+",나이:"+p1.age+",주소:"+p1.addr);
		System.out.println("Person객체가 할당된 heap의 주소:"+p1);
		
		Person p2 = new Person();
		p2.name = "김서연";
		p2.age = 25;
		p2.addr = "인천시";
		System.out.println("이름:"+p2.name+",나이:"+p2.age+",주소:"+p2.addr);
		System.out.println("Person객체가 할당된 heap의 주소:"+p2);
		
	}

}
