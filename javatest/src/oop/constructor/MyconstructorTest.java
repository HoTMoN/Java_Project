package oop.constructor;

public class MyconstructorTest {
	public static void main(String[] args) {
		Myconstructor abc = new Myconstructor();
		abc.setId("jang");
		abc.setName("장동건");
		abc.setPass("1234"); //암호화된 값 전달
		abc.setTelNum("010");
		abc.setSsn("730111");
		abc.setAddr("서울");
		abc.setNickname("짱");
		abc.print();
		
		Myconstructor abc2 = new Myconstructor("이민호", "lee", "1234");
		abc2.setTelNum("010");
		abc2.setSsn("850111");
		abc2.setAddr("인천");
		abc2.setNickname("F4");
		abc2.print();
		
		Myconstructor abc3 = new Myconstructor("장기용", "jang2", "1234","천안", "010");
		abc3.setSsn("900111");
		abc3.setNickname("duke");
		abc3.print();
		
		System.out.println("============================");
		
		Myconstructor abc4 = new Myconstructor("김범룡", "kim", "1234","청주", "010","600603","김");
		abc4.print();
	}
}
