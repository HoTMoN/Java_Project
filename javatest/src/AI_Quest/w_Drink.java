package AI_Quest;
public class w_Drink {
	String name;
	int price;
	int count;
	public w_Drink(){
		
	}
	public w_Drink(String name, int price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
	}
	public int getTotalPrice(){
		return price*count;
	}
	public static void printTitle(){
		System.out.println("��ǰ��\t�ܰ�\t����\t�ݾ�");
	}
	public void printData(){
		System.out.println(name+"\t"+price+"\t"+count+"\t"
				+getTotalPrice());
	}
}







