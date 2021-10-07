package AI_Quest;


public class CE_VideoShop {
	public static void main(String[] args) {
		CE_Content[] content = new CE_Content[3];
		content[0] = new CE_Video("변호인","new");
		content[1] = new CE_Video("탐정","comic");
		content[2] = new CE_Video("헬로카봇","child");
		content[3] = new CF_DDR5("좋은DDR5","LG");
		content[4] = new CF_DDR5("더 좋은 DDR","SAMSUNG");
		//기존의 잘 실행되고 있는 코드를 상징
		for (int i = 0; i < content.length; i++) {
			content[i].totalPrice();
			content[i].show();
		}
		
	}
}
