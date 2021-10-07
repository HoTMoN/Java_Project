package oop.inheritance;

public class StaticDemoTest2 {
	public static void main(String[] args) {
		StaticDemo2 obj = new StaticDemo2();
		obj.display(); //외부에서 접근하는 경우 non-static메소드는 참조변수를 통해 액세스
		StaticDemo2.show(); // 외부에서 접근하는 경우 static메소드는 클래스명을 이용해서 액세스		
	
		//main메소드가 static메소드이므로 동일하게 동작
		test();

		StaticDemoTest2 obj2 = new StaticDemoTest2();
		obj2.show();
	}
	public static void test() {
		
	}
	public void show() {
		
	}
}
