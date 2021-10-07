package exception;

public class CG_ExceptionExam {
	public static void main(String[] args) {
		try {
			CG_BankCustomer customer = new CG_BankCustomer("홍길동", 100);
			System.out.println("현재 잔액 : " + customer.getCurrentMoney());			
			customer.withdraw(70);
			System.out.println("현재 잔액 : " + customer.getCurrentMoney());			
			customer.withdraw(50);
			System.out.println("현재 잔액 : " + customer.getCurrentMoney());
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
	//예외를 호출하는 곳에서 처리할 수 있도록 구현 - 호출하는 곳으로 예외를 던지기, 호출하는 곳으로 예외를 전달하기,
	//호출하는 곳으로 전달하기
	public void withdraw(int money) throws IllegalArgumentException{
		if(currentMoney<money) {
			//IllegalArgumentException예외를 발생시키기
			//예외상황이 아닌대 예외를 발생시킨다.
			throw new IllegalArgumentException("잔액이 부족하여 인출 할 수 없습니다.");
		}
		currentMoney = currentMoney - money;
		//currentMoney가 money보다 작으면 IllegalArgumentException을 발생시키고
		//예외를 호출하는 곳에서 처리할 수 있도록 구현
	}
}