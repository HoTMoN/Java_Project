package AI_Quest;

public class w_MyBase extends w_Base{
	public void service(String state) {
		if(state.equals("��")) {
			System.out.println(state+"���� ������ ������!");
		}else if(state.equals("����")) {
			System.out.println(state+"�� ���� ���������� ���ؾ� �մϴ�.");
		}else {
			night();
		}
	}
	
	
}
