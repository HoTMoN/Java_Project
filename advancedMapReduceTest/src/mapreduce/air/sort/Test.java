package mapreduce.air.sort;

public class Test {

	public static void main(String[] args) {
		// 문자열비교 - compareTo
		/*
		 * compareTo의 결과 ASCII코드값 기준으로 처리 (차이값만큼 나온다.) 양수 : 기준문자열 > 매개변수 문자열 음수 : 기준문자열
		 * < 매개변수 문자열 0 : 기준문자열 = 매개변수 문자열
		 */
		String data1 = "b";
		String data2 = "a";
		System.out.println((int) 'a'); // 97
		System.out.println((int) 'b'); // 98
		System.out.println(data1.compareTo(data2));

		// hashcode
		// 해시코드란 객체를 구분할 수 있는 정수값
		// => 정수값은 객체가 할당된 주소를 가지고 내부에서 생성된다.
		// => hashcode메소드를 이용하면 이 정수값이 리턴된다.
		CustomKey key1 = new CustomKey();
		CustomKey key2 = new CustomKey();
		CustomKey key3 = new CustomKey();
		CustomKey key4 = new CustomKey();
		System.out.println(key1);
		System.out.println(key2);
		System.out.println(key1.hashCode());
		System.out.println(key2.hashCode());

		key1.setYear("asneufeuiaf");
		key2.setYear("ael;fjlejfile");
		key3.setYear("aeldwod;fjlejfile");
		key4.setYear("ael;fjlwdlwpdejfile");

		// 문자열에서 호출하는 해시코드는 Object클래스의 hashcode메소드가 오버라이딩되어
		// 주소를 가지고 해시코드값을 계산하지 않고 문자열을 이용해서 정수값을 만든다.
		// 따라서 문자열이 같으면 해시코드값이 같다.

		System.out.println("===========Customkey객체의 year데이터의 해시코드==========");
		System.out.println(key1.getYear().hashCode());
		System.out.println(key2.getYear().hashCode());
		System.out.println(key3.getYear().hashCode());
		System.out.println(key4.getYear().hashCode());
		
		System.out.println(key1.getYear().hashCode()%3);
		System.out.println(key2.getYear().hashCode()%3);
		System.out.println(key3.getYear().hashCode()%3);
		System.out.println(key4.getYear().hashCode()%3);
	}

}
