package oop.poly;

public class CF_Circle extends CF_Shape{
	private double radius;
	
	public CF_Circle() {
	}

	public CF_Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}
	@Override
	public void calculationArea() {
		area = Math.PI*Math.pow(radius,2);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
