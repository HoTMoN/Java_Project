package AI_Quest;

public class BI_Duck {
	String name;
	int leg;
	int length;
	
	public void setName(String name) {
		this.name = name;
	}
	public void fly() {
		System.out.println("����"+"("+name+")�� ���� �ʽ��ϴ�.");
	}
	public void sing() {
		System.out.println("����"+"("+name+")�� �Ҹ����� ��ϴ�.");
	}
	public String toString() {
		return ("������ �̸��� "+name+" �Դϴ�.");
	}
}
