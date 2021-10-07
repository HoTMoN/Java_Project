package AI_Quest;

public class w_MyBase extends w_Base{
	public void service(String state) {
		if(state.equals("낮")) {
			System.out.println(state+"에는 열심히 일하자!");
		}else if(state.equals("오후")) {
			System.out.println(state+"도 낮과 마찬가지로 일해야 합니다.");
		}else {
			night();
		}
	}
	
	
}
