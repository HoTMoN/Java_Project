package oop.inheritance;
/*
 * <<��Ӱ��迡�� Ŭ������ ���ǵ� �޼ҵ尡 ���� Ư¡>>
 * 1. ����Ŭ������ ���ǵ� �޼ҵ带 ����Ŭ�������γ� ����Ŭ���� ���������� ���ؼ� ȣ���� �� �ִ�.
 * 2. ����Ŭ������ ���ǵ� �޼ҵ�� ������ �޼ҵ带 ����Ŭ�������� �����Ͽ� ȣ���ϴ� ���
 *	  ����Ŭ������ �޼ҵ�� �νĵȴ�.
 *	  =>����Ŭ������ �޼ҵ弱��θ� ����Ŭ�������� �����ϰ� �����Ͽ� ����ϴ� ���� �޼ҵ��� �����Ƕ� �Ѵ�.
 *	    ��, �޼ҵ�������̵�(overriding)�̶� �Ѵ�. *�޼ҵ带 �������̵��ϴ� ��� �ݵ�� �޽��弱���(����Ÿ��, �Ű���������, �Ű�����Ÿ��)�� ����Ŭ������ �����ؾ� �Ѵ�.
 * 3. super�� �̿��ϸ� �θ��� �޼ҵ嵵 �������� �����ϴ�.
*/
class Parent{
	public void display() {
		System.out.println("�θ�Ŭ������ display()");
	}
}
class Child extends Parent{	
	public void test() {
		System.out.println("�ڽ�Ŭ������ test()");
		display(); //1.�� �׽�Ʈ�ڵ� - �ڱ��ڽ��� ����� ȣ���ϴ� ���  ���������� ���� ȣ������ �ʰ� �׳� �޼ҵ�� �����Ͽ� ȣ���� �� �ִ�.
		//�θ�Ŭ������ display()ȣ��
		super.display();//3.�� �׽�Ʈ�ڵ�
	}
	public void display() {//2.�� �׽�Ʈ�ڵ� - �޼ҵ�������̵�
		System.out.println("����Ŭ������ display()");
	}
}
public class inheritanceTest02 {
	public static void main(String[] args) {
		Child obj = new Child();
		obj.display();//1.�� �׽�Ʈ�ڵ�
		obj.test();
	}

}
