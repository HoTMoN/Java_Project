package oop.poly;

class Parent{
	String name = "�嵿��";
	public void display(){
		System.out.println("super�� display");
	}
}
class Child extends Parent{
	String name = "����";
	public void display() {//�������̵��� �޼ҵ�
		System.out.println("sub�� display");
	}
	public void show() {
		System.out.println("show");
	}
}

public class CE_RefTypeCastingTest {
	public static void main(String[] args) {
		System.out.println("1. SuperŸ���� ���������� Super��ü�� ������");
		Parent obj1 = new Parent();
		obj1.display();
		System.out.println(obj1.name);
		System.out.println("*******************************************************");	
	
		System.out.println("2. SubŸ���� ���������� Sub��ü�� ������");
		Child obj2 = new Child();
		obj2.display();
		System.out.println(obj2.name);
		System.out.println("*******************************************************");
		/*
		 *	��ü�� ����ȯ
		 *	Sub��ü�� �ڵ����� SuperŸ������ ��ȯ�ȴ�.
		 * 	=> �������� ����ȯ�� ��Ӱ��迡 �ִ� ��� ����Ÿ���� ������ ������ü�� �����ϴ� ��� �ڵ�����
		 * 	   ����ȯ�� �Ͼ��.
		 *     �θ�Ÿ�� ���� = new �ڽİ�ü()
		 *     
		 *     1) �������̵��� �޼ҵ尡 �ִ� ���� ������ �������̵��� �޼ҵ尡 ����ȴ�.
		 *     2) ������ ���ؼ� �������� �� �ִ� ����� ������ Ÿ������ ����
		 *     	  ������ �θ�Ÿ���̸� �θ��� ����� ������ �� �ִ�.
		 *     3) ������ �θ�Ÿ���̶�� �ϴ��� ���� �����ϴ� ��ü�� �ڽ�Ÿ���̸�
		 *     	  ������ �ڽ�Ÿ������ ĳ�����ؼ� ������ �� �ִ�.
		 */		
		System.out.println("3. SuperŸ���� ���������� Sub��ü�� ������");
		Parent obj3 = new Child();
		obj3.display();
		//obj3�� ParentŸ���̹Ƿ� Parent�� ����� ������ �� �� �ִ�.
		//�׷���... ���� Parent Ÿ���� ������ �����ϴ� ��ü�� Child Ÿ���̹Ƿ� casting(����ȯ)�� �ϸ� Child��ü�� ����� ������ �����ϴ�.
		//obj3�� ChildŸ������ ĳ����
		((Child)obj3).show();
		System.out.println(obj3.name);
		System.out.println("*******************************************************");
		
		System.out.println("4. SubŸ���� ���������� Super��ü�� ������--------X");
//		Child obj4 = new Parent();
//		obj4.display();
//		System.out.println(obj4.name);
		System.out.println("*******************************************************");
		
		//��������� ĳ������ �ؼ� �����Ϸ��� ���� �� ������(��, ��Ӱ��迡 �ִ� ��츸 ����)
		//obj1�� �����ϴ� ��ü�� Parent��ü�̹Ƿ� Child������ ��� ĳ������ �Ұ����ϴ�.
		//���� ������� Ŭ������(��Ӱ��谡 �ƴ�Ŭ����)�� ĳ�������� �� �� ����.
		//----------------------
		
//		String str = new String("java");
//		Random rand = new Random();
//		String str2 = (String)rand;
		
		System.out.println("5. SubŸ���� �������� = Super��ü�� �����ϴ� SuperŸ���� ����--------?");
//		Child obj5 = (Child)obj1;
//		obj5.display();
//		System.out.println(obj5.name);
		System.out.println("*******************************************************");
		
		System.out.println("6. SubŸ���� �������� = Sub��ü�� �����ϴ� SuperŸ���� ����4");
		Child obj6 = (Child)obj3;
		obj6.display();
		System.out.println(obj6.name);
		System.out.println("*******************************************************");
		
	}
}
