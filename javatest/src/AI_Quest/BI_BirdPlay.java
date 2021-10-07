package AI_Quest;

public class BI_BirdPlay {
 	public static void main(String s[]){
		BI_Duck duck = new BI_Duck();
		duck.setName("²Ð²ÐÀÌ");
		duck.fly();
		duck.sing();
		System.out.println(duck.toString());
		
		Sparrow sparrow = new Sparrow();
		sparrow.setName("Â±Â±");
		sparrow.fly();
		sparrow.sing();
		System.out.println(sparrow.toString());
		
	}


}
