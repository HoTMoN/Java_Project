package AI_Quest;

public class BJ_Account {

	int save; // �Ա�
	int deposit; // ���
	int getBalance; // �ܰ�Ȯ��
	String getAccNo; // ���¹�ȣȮ��

	public void setAccNo(String str) {
		System.out.println(str + " ���°� �����Ǿ����ϴ�.");
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
		System.out.println(getAccNo+" ���¿� "+save+"������ �ԱݵǾ����ϴ�.");
	}
	public void deposit(int deposit) {
		this.deposit = deposit;
		System.out.println(getAccNo+" ���¿� "+deposit+"������ ��ݵǾ����ϴ�.");
	}
}