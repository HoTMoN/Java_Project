package oop.poly;


public class CF_CoffeShop {
	public static void main(String[] args) {
		System.out.println("****java nara CoffeeShop��������****");
		CF_Beverage[] beverage = new CF_Beverage[5];
		beverage[0] = new CF_Coffee("Cappuccino");
		beverage[1] = new CF_Coffee("CafeLatte");
		beverage[2] = new CF_Tea("ginsengTea");
		beverage[3] = new CF_Coffee("CafeLatte");
		beverage[4] = new CF_Tea("redginsengTea");
		getSalesInfo(beverage);
		System.out.println("�� �Ǹ� �ݾ�==>"+getTotalPrice(beverage));
		System.out.println("Coffe�� �Ǹ� ����=>"+CF_Coffee.amount+"��");
		System.out.println("Tea�� �Ǹ� ����=>"+CF_Tea.amount+"��");
	}
	//����� ���� ������ ���ϰ� �Ǹ������� ����� �� �ֵ��� getSalesInfo�޼ҵ带 �ۼ��ϼ���

	public static void getSalesInfo(CF_Beverage[] beverage) {
		for(int i = 0; i < beverage.length; i++) {
			System.out.print((i+1)+" ��° �Ǹ� ����� ");
			beverage[i].print();
		}
		
	}
	//����� ���� �� �Ǹűݾ��� ���� �� �ֵ��� getTotalPrice�޼ҵ带 �ۼ��ϼ���.
	public static int getTotalPrice(CF_Beverage[] beverage) {
		int result = 0;
		for(int i = 0; i < beverage.length; i++) {
			result = result + beverage[i].getPrice();
		}
		return result;
	}
}
