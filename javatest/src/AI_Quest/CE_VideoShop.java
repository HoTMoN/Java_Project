package AI_Quest;


public class CE_VideoShop {
	public static void main(String[] args) {
		CE_Content[] content = new CE_Content[3];
		content[0] = new CE_Video("��ȣ��","new");
		content[1] = new CE_Video("Ž��","comic");
		content[2] = new CE_Video("���ī��","child");
		content[3] = new CF_DDR5("����DDR5","LG");
		content[4] = new CF_DDR5("�� ���� DDR","SAMSUNG");
		//������ �� ����ǰ� �ִ� �ڵ带 ��¡
		for (int i = 0; i < content.length; i++) {
			content[i].totalPrice();
			content[i].show();
		}
		
	}
}
