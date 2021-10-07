package oop.poly;

public class CE_KaKaoSender extends CE_Sender {
	int length;
	public CE_KaKaoSender(String name,int length){
		super(name);
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	@Override
	public void send() {
		System.out.println("KaKaotalk으로 전송");

	}

}
