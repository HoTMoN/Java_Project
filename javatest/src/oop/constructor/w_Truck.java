package oop.constructor;

public class w_Truck extends w_Wheeler{
	public w_Truck(String carName, int velocity, int wheelNumber) {
		super(carName, velocity, wheelNumber);
	}
	
	@Override //������̼� - �����Ϸ����� ���� �� �ȳ�
	public void speedUp(int speed) {
		this.velocity = velocity+5*speed;
		if(this.velocity>100) {
			this.velocity = 100;
		}
		System.out.println("Ʈ���� ���� �ӵ��� :"+this.velocity+" �Դϴ�.");
		
	}
	@Override
	public void speedDown(int speed) {
		this.velocity = velocity-5*speed;
		if(this.velocity<50) {
			this.velocity = 50;
			System.out.println("Ʈ���� �����ӵ��������� �ӵ��� "+this.velocity+" ���� �ø��ϴ�.");
		}
	}

}
