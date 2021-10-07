package array;

public class ArgsExam02 {
	public static void main(String[] args) {
		//명령형매개변수로 숫자 5개 입력받고 홀수인지 짝수인지 출력
		//출력형태
		//명령형매개변수1:100 -> 짝수
		//....
		int j = 0;
		for(int i = 0;i<args.length;i++) {
			j = i+1;
			if(Integer.parseInt(args[i])%2==0){
				System.out.println("명령형매개변수"+j+":"+args[i]+" -> 짝수");
			}else {
				System.out.println("명령형매개변수"+j+":"+args[i]+" -> 홀수");
			}
		}
	}
}
