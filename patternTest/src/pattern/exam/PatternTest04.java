package pattern.exam;

import java.util.regex.Pattern;

public class PatternTest04 {
	public static void main(String[] args) {
		System.out.println(Pattern.matches("[0-9]+", "12345java"));
		System.out.println(Pattern.matches("[0-9]+", "java"));
		System.out.println(Pattern.matches("[0-9]+", "12345"));
		System.out.println(Pattern.matches("[0-9]+", "1"));
		System.out.println(Pattern.matches("[0-9]+", ""));
		System.out.println("=======================================");
		System.out.println(Pattern.matches("[0-9]?", "12345java"));
		System.out.println(Pattern.matches("[0-9]?", "java"));
		System.out.println(Pattern.matches("[0-9]?", "12345"));
		System.out.println(Pattern.matches("[0-9]?", "1"));
		System.out.println(Pattern.matches("[0-9]?", ""));
		
		//String 클래스의 matches메소드 이용
		String str = "12345java";  //패턴을 검사할 문자열
		System.out.println(str.matches("[0-9]?")); 
	}
}
