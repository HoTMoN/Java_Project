package oop.inheritance;

public class StaticDemoTest2 {
	public static void main(String[] args) {
		StaticDemo2 obj = new StaticDemo2();
		obj.display(); //�ܺο��� �����ϴ� ��� non-static�޼ҵ�� ���������� ���� �׼���
		StaticDemo2.show(); // �ܺο��� �����ϴ� ��� static�޼ҵ�� Ŭ�������� �̿��ؼ� �׼���		
	
		//main�޼ҵ尡 static�޼ҵ��̹Ƿ� �����ϰ� ����
		test();

		StaticDemoTest2 obj2 = new StaticDemoTest2();
		obj2.show();
	}
	public static void test() {
		
	}
	public void show() {
		
	}
}
