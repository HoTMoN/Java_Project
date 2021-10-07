package statement;
// 1부터 100까지의 합을 출력하세요.
// 총합:
// 짝수합:
// 홀수합:
public class HapExam_while {
	public static void main(String[] args) {
		int sum = 0; 
		int evenSum = 0; 
		int oddSum = 0; 
		int i = 1;
			while(i<= 100) {
			sum = sum+i;
			if(i%2==0) {
				evenSum = evenSum+i;
			}else {
				oddSum = oddSum + i;
			}
			i++;
		}
		System.out.println("총합:"+sum);
		System.out.println("짝수합"+evenSum);
		System.out.println("홀수합"+oddSum);
	}
}