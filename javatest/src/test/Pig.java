package test;

public class Pig extends Animal{

	public Pig() {
	}
	
	public Pig(int speed) {
		super(speed);
	}
	@Override
	public void run(int hour) {
		distance = (double)speed*(double)hour/2 + distance;
		
	}

}