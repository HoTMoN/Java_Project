package api.lang;
//StringŬ������ ������ ��ȯ�� ���õ� �޼ҵ�
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
		
		//���
		for(int i = 0 ; i < data1.length ; i++) {
			System.out.print(data1[i]+"\t");
//			System.out.print(test[i]+"\t");
		}
		System.out.println();
		//2.String -> char[]
		char[] data2 = str1.toCharArray();
		//���
		for(int i = 0 ; i < data2.length ; i++) {
			System.out.print(data2[i]+"\t");
		}
		
		//3.String -> String[]
		//=> Ư�����ڷ� ���ڿ��� �и��ϱ�
		//  -----------
		//   ���й��� : spacebar, �޸�, �ݷ�.....
		//   �и��� �ܾ String�迭�� �����ϰ� �̷� �ܾ token�̶� �Ѵ�.
		String[] data3 = str2.split(" ");
		for(int i = 0 ; i < data3.length ; i++) {
			System.out.print(data3[i]+"\t");
		}
		//4.�⺻�� -> String
		int i = 1000;
		double d = 10.5;
		test(String.valueOf(i));
		test(String.valueOf(d));
		
		test(i+""); //�� ���ڿ�
		test(d+"");
	}
	
	public static void test(String data) {
		System.out.println("��ȯ�� ������");
	}
}
