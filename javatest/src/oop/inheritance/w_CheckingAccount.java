package oop.inheritance;

public class w_CheckingAccount extends w_Account{
	private String cardNo;
	public w_CheckingAccount() {
	}

	public w_CheckingAccount(String accId, String ownerName, long balance, String cardNo) {
		super(accId, balance, cardNo);
		this.cardNo = cardNo;
	}
	public void pay(String cardNo, long amount) {
		if(this.cardNo .equals(cardNo) & amount<getBalance()) {
			withdraw(amount);
		}else {
			System.out.println("지불이 불가능합니다.");
		}
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
}
