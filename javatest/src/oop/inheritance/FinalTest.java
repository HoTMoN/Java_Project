package oop.inheritance;
//����Ŭ����
final class SuperB{//����� �Ұ����� Ŭ����
	//�������(��������)�� final�� �߰��ϸ� ����� �ǹ� - ���� ���Ҵ��� �� ����.
	// => �ڹٿ����� ����� ������ �����ϱ� ���� ����� �빮�ڷ� �����ϱ�� ���
	final int NUM = 100;
	public void display() {//���� Ŭ�������� �������� �� ���� �޼ҵ�
		System.out.println("�θ��� display()");
	}
}
class SubB extends SuperB{
	public void test() {
		super.num = 1000;
		System.out.println(NUM);
	}
	public void display() {
		System.out.println("�ڽ��� display()");
	}
}
public class FinalTest {
	public static void main(String[] args) {
		SubB obj = new SubB();
		obj.test();
	}

}
