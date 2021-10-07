package exception;

public class CG_ExceptionExam {
	public static void main(String[] args) {
		try {
			CG_BankCustomer customer = new CG_BankCustomer("ȫ�浿", 100);
			System.out.println("���� �ܾ� : " + customer.getCurrentMoney());			
			customer.withdraw(70);
			System.out.println("���� �ܾ� : " + customer.getCurrentMoney());			
			customer.withdraw(50);
			System.out.println("���� �ܾ� : " + customer.getCurrentMoney());
		} catch (IllegalArgumentException e) {
			System.out.println("??");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class CG_BankCustomer{
	private String name;
	private int currentMoney ;


	public CG_BankCustomer(String name,int currentMoney) {
		super();
		this.name = name;
		this.currentMoney = currentMoney;
	}
	public int getCurrentMoney() {
		return currentMoney;
	}
	//���ܸ� ȣ���ϴ� ������ ó���� �� �ֵ��� ���� - ȣ���ϴ� ������ ���ܸ� ������, ȣ���ϴ� ������ ���ܸ� �����ϱ�,
	//ȣ���ϴ� ������ �����ϱ�
	public void withdraw(int money) throws IllegalArgumentException{
		if(currentMoney<money) {
			//IllegalArgumentException���ܸ� �߻���Ű��
			//���ܻ�Ȳ�� �ƴѴ� ���ܸ� �߻���Ų��.
			throw new IllegalArgumentException("�ܾ��� �����Ͽ� ���� �� �� �����ϴ�.");
		}
		currentMoney = currentMoney - money;
		//currentMoney�� money���� ������ IllegalArgumentException�� �߻���Ű��
		//���ܸ� ȣ���ϴ� ������ ó���� �� �ֵ��� ����
	}
}