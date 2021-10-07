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
	//이메일로 전송하기
	public void send() {
		System.out.println("Email로 전송하기");
	}
}

