package oop.constructor;

public class w_Account extends w_TestAccount{
	private String accId;
	private long balance;
	private String ownerName;
	
	public String getAccId() {
		return accId;
	}
	public void setAccId(String accId) {
		this.accId = accId;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void w_Account() {
	}
	public w_Account(String accId, long balance, String ownerName) {
		this.accId = accId;
		this.balance = balance;
		this.ownerName = ownerName;
	}
	void deposit(long amount) {
		this.balance = this.balance + amount;
	}
	void withdraw(long amount) {
		this.balance = this.balance - amount;
	}
}

