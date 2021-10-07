package AI_Quest;

public class BJ_Account {

	int save; // 입금
	int deposit; // 출금
	int getBalance; // 잔고확인
	String getAccNo; // 계좌번호확인

	public void setAccNo(String str) {
		System.out.println(str + " 계좌가 개설되었습니다.");
		getAccNo = str;
	}
	public String getAccNo() {
		return getAccNo;
	}
	public int getBalance() {
		return + save - deposit;
	}
	public void save(int save) {
		this.save = save;
		System.out.println(getAccNo+" 계좌에 "+save+"만원이 입금되었습니다.");
	}
	public void deposit(int deposit) {
		this.deposit = deposit;
		System.out.println(getAccNo+" 계좌에 "+deposit+"만원이 출금되었습니다.");
	}
}