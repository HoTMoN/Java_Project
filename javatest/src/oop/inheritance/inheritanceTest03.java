package oop.inheritance;
/*
 *  << ��Ӱ��迡�� �������� Ư¡>>
 *  1. ��� Ŭ������ �����ڸ޼ҵ��� ù ��° ������ �θ�Ŭ������ �⺻�����ڸ� ȣ���ϴ� ���ɹ��� �����Ǿ� �ִ�.
 *  	=> �θ�Ŭ������ �����ڸ� ȣ���ϴ� ����� super()
 *  		super()�� �θ�Ŭ������ �⺻�����ڸ� �ǹ�
 *  		super(�Ű����� list....)�� �θ�Ŭ������ �Ű����� �ִ� Ŭ������ ȣ���ϴ� ���
 *  2. ��� Ŭ������ �ʻ��� Ŭ������ java.lang.ObjectŬ�����̴�.
 *		=> �ٸ� Ŭ������ ������� ���� Ŭ������ ��� ObjectŬ������ ����ϴ� ���ɹ��� �����Ǿ� �ִ�.
 *		=> �ڹٿ��� ���Ǵ� ��ü�� ���� ������ Ư¡�� ���ǵ� Ŭ������ java.lang.ObjectŬ����
 *		   �ڹٿ����� �� Ŭ������ �ֻ���Ŭ������ ���ǵ� �� �ֵ��� �ڹ��� �����Ϸ��� �ڵ����� �߰��Ѵ�.
 *		=> �ڹٰ�ü�� JVM���� ����ɶ� ���� ��� ������ Ư¡�� java.lang��Ű���� Object�� ������ ����
 *		   �����Ϸ��� ���� �ڵ����� ��ӹ޵��� �Ѵ�.
 *	3. �θ�Ŭ������ ���ǵǾ� �ִ� �Ű������� �ִ� �����ڸ� ȣ���� �� �ִ�.
 */
class SuperA{
	private String name;
	public SuperA() {
	}
	
	public SuperA(String name) {
		super(); //��Ŭ������ �ڵ��ϼ�������� �����ڸ� �߰��ϸ� super()�� �߰�
		this.name = name;	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
class SubA extends SuperA{  //1.SubA���� �⺻�����ڰ� �����Ǿ� �ִ�.
	int age;
	String addr;
	public SubA() { 	    //2.��� �������� ù ��° ���忡�� �⺻�������� ȣ�⹮�� �����Ǿ� �ִ�.
		super();				    //3.�θ�Ŭ���������� �Ű������� �ִ� �����ڰ� �̹� ���ǵǾ� �����Ƿ� �����Ϸ��� �⺻�����ڸ� �߰����� �ʴ´�.
	}					    //  =>�θ��� �⺻�����ڸ� ȣ���ϴµ� �θ�Ŭ�������� �⺻�����ڰ� �����Ƿ� ������ �߻�
						    //  =>�ذ���
							//	- �θ�Ŭ������ �⺻�����ڸ� �߰�.
							//  - �θ�Ŭ������ ���ǵ� �����ڸ� ȣ���ϵ��� ����
	SubA(String name,int age,String addr){//SubA�� name�� ���� ���� �ʴ��� name������ ���޹��� �� �ֵ��� �߰��ؾ� �Ѵ�.
		super(name); //�θ� ���ǵǾ� �ִ� String�Ű����� �� ���� �޴� �����ڸ� ã�Ƽ� ȣ���Ѵ�.
					// �̷���� �θ��� �⺻������ ȣ�⹮�� ���
		this.age = age;
		this.addr = addr;
	}
	public void display() {
		System.out.println("name="+getName()+",age="+age+",addr="+addr);
	}
}
public class inheritanceTest03 {
	public static void main(String[] args) {
		SubA obj = new SubA();
		//��Ӱ��谡 �ִ� Ŭ������ ����ϴ� ��� ���� ����ϴ� �������� ����Ŭ������ �����ؼ� ����Ѵ�.
		//���� ����ϴ� Ŭ������ ����Ŭ������� �ϴ��� ���� ����Ŭ������ �����ϴ� ��쵵 �ִ�.
		//���� ����Ŭ������ ����ϴ� ��� ����Ŭ������ ���������� ��������� ���� ���� �ʴٰ� �ϴ��� ��� ���� ����Ŭ�������� ��
		SubA obj2 = new SubA("�嵿��",20,"��õ");
		obj.display(); // obj��ü�� ����� ���� ���� �ƹ��͵� ���õǾ� ���� �����Ƿ� ��� ����� ��µ��� �ʴ´�.
		obj2.display();// name�� null�� ���
	}

}