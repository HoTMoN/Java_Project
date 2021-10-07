package exception;

public class CG_Prob2 {
	public static void main(String[] args) {
		try {
			BankCustomer customer = new BankCustomer("ȫ�浿", 100);
			System.out.println("���� �ܾ� : " + customer.getCurrentMoney());			
			customer.withdraw(70);
			System.out.println("���� �ܾ� : " + customer.getCurrentMoney());			
			customer.withdraw(50);
			System.out.println("���� �ܾ� : " + customer.getCurrentMoney());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class BankCustomer{
	private String name;
	private int currentMoney;


	public BankCustomer(String name,int currentMoney) {
		this.name = name;
		this.currentMoney = currentMoney;
	}
	public int getCurrentMoney() {
		return currentMoney;
	}
	public void withdraw(int money) {
		if(money<currentMoney){
			currentMoney = currentMoney - money;
		}else {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �����ϴ�.");
			currentMoney = money/0;	
		}
	}
	// ������ �� �а� �����ϼ���.
}