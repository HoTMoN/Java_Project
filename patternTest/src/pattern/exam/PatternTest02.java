package pattern.exam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest02 {
	public static void main(String[] args) {
		// 패턴을 적용할 문자열
		//String str = "java programming";
		String str = "ja111kr11a45Cva --@@----@에라이@@@@ 한글 -6649pea나oj오ei긴of하ji내oasejfFJHFH";
		
		//String patternStr = "a|m|g"; 1. |기호는 or을 의미 => a or m or g
		//String patternStr = "[amg]"; 2. 1번과 동일
		//String patternStr = "[amg][ma]"; 3. 두 글자에 대해서 2번의 조건을 적용해서 확인 => 첫 글자가 a,m,g 이거나 두 번째 글자가 m,a인 문자
		//String patternStr = "[c-j]"; 4. c-j 사이에 해당하는 문자 확인 //c, d, e, f, g, h, i, j (소문자) [C-J]=> (대문자)
		//String patternStr = "[C-Jc-j]"; 5. 대문자 C-J 까지 소문자 c-j까지 확인
		//String patternStr = "[4-8]"; 6. 숫자 4~8까지
		//String patternStr = "[^4-8]"; 7. ^가 []안에서 사용되면 부정의 의미 => 숫자 4, 5, 6, 7, 8이 아닌 모든 문자\
		// 9 => String patternStr = "[^c-j]";
		// 10 => String patternStr = "[A-Za-z0-9]";
		// 11 => String patternStr = "[^A-Za-z0-9]";
		// 12 => String patternStr =  "[가-힣]";
		String patternStr =  ".*";
		equalsPattern(str, patternStr);
	}

	// 패턴을 적용해서 처리할 메소드
	public static void equalsPattern(String str, String patternStr) {
		Pattern pattern = Pattern.compile(patternStr, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(str); // 패턴을 적용할 문자열
		while (matcher.find()) {
			System.out.println(matcher.group());
			System.out.println(matcher.start() + ":" + (matcher.end() - 1));

		}
	}
}
