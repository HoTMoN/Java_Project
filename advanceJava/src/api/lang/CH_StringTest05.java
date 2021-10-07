package api.lang;
//String클래스의 데이터 변환과 관련된 메소드
public class CH_StringTest05 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("java jdbc sevlet jsp spring");
		
		//1.String -> byte[]
		byte[] test = new byte[str1.length()];
		for(int i = 0 ; i < str1.length() ; i++) {
			test[i] = (byte)str1.charAt(i);
		}
		
		byte[] data1 = str1.getBytes();
		
		//출력
		for(int i = 0 ; i < data1.length ; i++) {
			System.out.print(data1[i]+"\t");
//			System.out.print(test[i]+"\t");
		}
		System.out.println();
		//2.String -> char[]
		char[] data2 = str1.toCharArray();
		//출력
		for(int i = 0 ; i < data2.length ; i++) {
			System.out.print(data2[i]+"\t");
		}
		
		//3.String -> String[]
		//=> 특정문자로 문자열을 분리하기
		//  -----------
		//   구분문자 : spacebar, 콤마, 콜론.....
		//   분리된 단어를 String배열로 관리하고 이런 단어를 token이라 한다.
		String[] data3 = str2.split(" ");
		for(int i = 0 ; i < data3.length ; i++) {
			System.out.print(data3[i]+"\t");
		}
		//4.기본형 -> String
		int i = 1000;
		double d = 10.5;
		test(String.valueOf(i));
		test(String.valueOf(d));
		
		test(i+""); //반 문자열
		test(d+"");
	}
	
	public static void test(String data) {
		System.out.println("변환된 데이터");
	}
}
