package api.lang;
//SystemŬ����
public class CH_SystemTest {
	public static void main(String[] args) {
		
		//long start = System.currentTimeMillis(); //����ð��� ���� milli (1/1000)
		long start = System.nanoTime(); // 1/100000000
		int sum = 0;
		for(int i = 0; i <= 10000; i++) {
			sum = sum + i;
		}
		long end = System.nanoTime();
		
		System.out.println("���α׷� ����ð�"+(end-start));
	}

}
