package api.lang;

public class CH_StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java programming");
		System.out.println("원본=> "+sb);
		
		sb.append("재밌다."); // 맨 뒤에 추가
		System.out.println("원본=> "+sb);
		
		sb.insert(2, "자바"); // 전달한 index번째 문자열이 삽입
		System.out.println("원본=> "+sb);

		sb.delete(2, 6); // start ~ end-1 위치의 문자열 삭제
		System.out.println("원본=> "+sb);
		
		sb.reverse();
		System.out.println("원본=> "+sb);

	}

}
