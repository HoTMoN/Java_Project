package test;

public abstract class Animal {
	int speed;
	double distance;
	
	public Animal() {
		
	}
	
	public Animal(int speed) {
		this.speed = speed;
	}
		
	public double getDistance() {
		return distance;
	}
	
	public abstract void run(int hour);
	}
