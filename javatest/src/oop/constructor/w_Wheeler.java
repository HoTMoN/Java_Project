package oop.constructor;

public class w_Wheeler {
	protected int velocity;
	protected String carName;
	protected int wheelNumber;

	public w_Wheeler(String carName, int velocity, int wheelNumber) {
		super();
		this.velocity = velocity;
		this.carName = carName;
		this.wheelNumber = wheelNumber;
	}

	public void speedUp(int speed) {
	}
	public void speedDown(int speed) {
	}

	public void stop() {
		velocity = 0;
		System.out.println("정지상태로 속도를 0으로 초기화합니다.");
	}
}