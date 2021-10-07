package oop.poly;
public class CE_SMSSender extends CE_Sender {
	int length;
	public CE_SMSSender(String name,int length){
		super(name);
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void send() {
		System.out.println("SMS로 전송하기");
	}
	
}
