package oop.poly;
public class CE_BandSender extends CE_Sender {
	int length;
	public CE_BandSender(String name,int length){
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
		System.out.println("Band로 전송하기");
	}
	
}
