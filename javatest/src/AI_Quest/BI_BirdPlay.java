package AI_Quest;

public class BI_BirdPlay {
 	public static void main(String s[]){
		BI_Duck duck = new BI_Duck();
		duck.setName("�в���");
		duck.fly();
		duck.sing();
		System.out.println(duck.toString());
		
		Sparrow sparrow = new Sparrow();
		sparrow.setName("±±");
		sparrow.fly();
		sparrow.sing();
		System.out.println(sparrow.toString());
		
	}


}
