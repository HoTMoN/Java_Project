package oop.constructor;

public class w_Bike extends w_Wheeler{
	public w_Bike(String carName, int velocity, int wheelNumber) {
		super(carName, velocity, wheelNumber);
	}
	@Override
	public void speedUp(int speed) {
		this.velocity = velocity+speed;
		System.out.println("�������� ���� �ӵ��� :"+this.velocity+" �Դϴ�.");
		if(this.velocity>40) {
			this.velocity = 40;
		}
	}
	@Override
	public void speedDown(int speed) {
		this.velocity = velocity-speed;
		if(this.velocity<10) {
			this.velocity = 10;
			System.out.println("�������� �����ӵ��������� �ӵ��� "+this.velocity+" ���� �ø��ϴ�.");
		}
	}
}

