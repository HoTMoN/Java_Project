package test;
//jvm�� ���� �۾����� ��Ű��(test), java.lang��Ű���� �⺻���� �ν�
//���� �� ���� ��Ű���� �ۼ��� Ŭ������ ����ϱ� ���ؼ� import (ctrl shift o)
import oop.basic.PersonMethod;

public class PublicTest {
	public static void main(String[] args) {
		PersonMethod p = new PersonMethod();
		//p.name�� public���� ���ǵǾ��� ������ �ٸ� ��Ű���� Ŭ�������� ������ ����
		System.out.println(p.name+","+p.addr);
		//addr������ default���������ڷ� ���ǵǾ��� ������ �ش� Person Ŭ������ ���ǵ�
		//oop.basic��Ű���� Ŭ���������� ������ ����
	}

}
