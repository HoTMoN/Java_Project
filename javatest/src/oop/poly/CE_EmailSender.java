package oop.poly;
public class CE_EmailSender extends CE_Sender {
	int length;
	public CE_EmailSender(String name,int length){
		super(name);
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	//�̸��Ϸ� �����ϱ�
	public void send() {
		System.out.println("Email�� �����ϱ�");
	}
}

