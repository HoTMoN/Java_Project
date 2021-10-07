package test;
//jvm은 현재 작업중인 패키지(test), java.lang패키지만 기본으로 인식
//따라서 그 외의 패키지에 작성된 클래스를 사용하기 위해서 import (ctrl shift o)
import oop.basic.PersonMethod;

public class PublicTest {
	public static void main(String[] args) {
		PersonMethod p = new PersonMethod();
		//p.name은 public으로 정의되었기 때문에 다른 패키지의 클래스에서 접근이 가능
		System.out.println(p.name+","+p.addr);
		//addr변수는 default접근제한자로 정의되었기 때문에 해당 Person 클래스가 정의된
		//oop.basic패키지의 클래스에서만 접근이 가능
	}

}
