package oop.constructor;

public class w_Truck extends w_Wheeler{
	public w_Truck(String carName, int velocity, int wheelNumber) {
		super(carName, velocity, wheelNumber);
	}
	
	@Override //어노테이션 - 컴파일러에게 설명 및 안내
	public void speedUp(int speed) {
		this.velocity = velocity+5*speed;
		if(this.velocity>100) {
			this.velocity = 100;
		}
		System.out.println("트럭의 현재 속도는 :"+this.velocity+" 입니다.");
		
	}
	@Override
	public void speedDown(int speed) {
		this.velocity = velocity-5*speed;
		if(this.velocity<50) {
			this.velocity = 50;
			System.out.println("트럭의 최저속도위반으로 속도를 "+this.velocity+" 으로 올립니다.");
		}
	}

}
