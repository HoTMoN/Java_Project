package AI_Quest;

import java.lang.Exception;

// 사용자 정의 Exception : 수정하지 말고 그대로 사용하세요.
public class CG_PayException extends Exception {
	
	public CG_PayException(String message){
	    super(message);
	}
}