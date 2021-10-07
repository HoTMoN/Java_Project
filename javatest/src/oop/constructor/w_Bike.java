package oop.constructor;

public class w_Bike extends w_Wheeler{
	public w_Bike(String carName, int velocity, int wheelNumber) {
		super(carName, velocity, wheelNumber);
	}
	@Override
	public void speedUp(int speed) {
		this.velocity = velocity+speed;
		System.out.println("자전거의 현재 속도는 :"+this.velocity+" 입니다.");
		if(this.velocity>40) {
			this.velocity = 40;
		}
	}
	@Override
	public void speedDown(int speed) {
		this.velocity = velocity-speed;
		if(this.velocity<10) {
			this.velocity = 10;
			System.out.println("자전거의 최저속도위반으로 속도를 "+this.velocity+" 으로 올립니다.");
		}
	}
}

