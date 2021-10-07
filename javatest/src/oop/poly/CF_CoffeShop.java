package oop.poly;


public class CF_CoffeShop {
	public static void main(String[] args) {
		System.out.println("****java nara CoffeeShop영업개시****");
		CF_Beverage[] beverage = new CF_Beverage[5];
		beverage[0] = new CF_Coffee("Cappuccino");
		beverage[1] = new CF_Coffee("CafeLatte");
		beverage[2] = new CF_Tea("ginsengTea");
		beverage[3] = new CF_Coffee("CafeLatte");
		beverage[4] = new CF_Tea("redginsengTea");
		getSalesInfo(beverage);
		System.out.println("총 판매 금액==>"+getTotalPrice(beverage));
		System.out.println("Coffe의 판매 개수=>"+CF_Coffee.amount+"잔");
		System.out.println("Tea의 판매 개수=>"+CF_Tea.amount+"잔");
	}
	//결과와 같이 가격을 구하고 판매정보를 출력할 수 있도록 getSalesInfo메소드를 작성하세요

	public static void getSalesInfo(CF_Beverage[] beverage) {
		for(int i = 0; i < beverage.length; i++) {
			System.out.print((i+1)+" 번째 판매 음료는 ");
			beverage[i].print();
		}
		
	}
	//결과와 같이 총 판매금액을 구할 수 있도록 getTotalPrice메소드를 작성하세요.
	public static int getTotalPrice(CF_Beverage[] beverage) {
		int result = 0;
		for(int i = 0; i < beverage.length; i++) {
			result = result + beverage[i].getPrice();
		}
		return result;
	}
}
