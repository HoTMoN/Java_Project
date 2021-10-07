package array;

public class ArgsExam {
	public static void main(String[] args) {
		//숫자를 5개 입력 받아 합과 평균을 구해서 출력하세요.
		// 100 150 200 250 300 넣음
		// - 설정하기
		// - for문으로 작업
		int sum = 0; 
		double avg = 0;
		for(int i = 0;i<args.length;i++) {
			sum = sum + Integer.parseInt(args[i]);
		}
		avg = sum/args.length;
		System.out.println("합: "+sum);
		System.out.println("평균 :"+avg);
	}
}
