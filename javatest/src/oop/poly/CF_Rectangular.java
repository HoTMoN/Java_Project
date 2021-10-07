package oop.poly;

public class CF_Rectangular extends CF_Shape{
	private double width;
	private double hight;
	
	public CF_Rectangular() {
		
	}
	public CF_Rectangular(String name, double width, double hight) {
		super(name);
		this.width = width;
		this.hight = hight;
	}
	@Override
	public void calculationArea() {
		area = width*hight;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHight() {
		return hight;
	}
	public void setHight(double hight) {
		this.hight = hight;
	}
	
}
