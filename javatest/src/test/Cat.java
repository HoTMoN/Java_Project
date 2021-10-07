package test;

public class Cat extends Animal {

	public Cat() {
	}
	
	public Cat(int speed) {
		super(speed);
	}
	@Override
	public void run(int hour) {
		distance = (double)hour*(double)speed + distance;
	}

}
