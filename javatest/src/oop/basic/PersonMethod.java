package oop.basic;

public class PersonMethod {
	//�ɹ����� or �ʵ�
	public String name;
	private int age;
	public String addr;
	
	//name ������ private���� �ܺο��� ���ٺҰ��� �����Ǿ��� ������ public�޼ҵ带 ���� ���� �����ϰ� ���� ������ �� �ֵ��� �����Ѵ�.
	//name ������ ���� �����ϴ� �޼ҵ� - setter�޼ҵ�
	//setter�� getter�޼ҵ���� �ۼ��ϴ� ���
	//set(get) + ���������(��������� ù ���ڸ� �빮�ڷ� ����)
	//ex) name������ setter�޼ҵ�
	//	setName, getName
	//	=> �⺻ �ڹٿ����� setter/getter�޼ҵ��� �̸��� ����Ҷ� ����� ��Ű�� �ʾƵ� ������ ���� �ʴ´�.
	//		�׷��� �������̳� ���� ����Ҷ� �� ��Ģ�� ��Ű�� ������ ������ �߻��� �� �ִ�.
	public void setName(String name) {
		this.name = name;//���� ����� ������ ���� �νĵȴ�.
					//��������� �Ű��������� ������ ��� �Ű����� = �Ű������� �νĵǹǷ�
					//= ������ ������ ��ü�� �������� ��Ÿ���� �Ѵ�. �̶� ����ϴ� Ű���尡 this
					//this�� ���� �۾� ���� ��ü�� �ǹ�
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddr(String Addr) {
		this.addr = Addr;
	}
	//name ������ ����� ���� ���� �� �ִ� �޼ҵ�(�о ȣ���ϴ� ������ ������ �� �ִ� �޼ҵ�) - getter�޼ҵ�
	//=> ��������� ���� ȣ���ϴ� ������ ������.
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getAddr() {
		return this.addr;
	}
}