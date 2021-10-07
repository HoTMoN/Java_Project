package oop.poly;


public class CF_TestShape {
	public static void main(String[] args) {
		CF_Shape [] shape = new CF_Shape[2];
		shape[ 0 ]  = new CF_Circle("원",10);
		shape[ 1 ] = new CF_Rectangular("직사각형",10,20);
		
		for (int i = 0; i < shape.length; i++) {
			shape[ i ].calculationArea();
			shape[ i ].print();
		}
	}
}