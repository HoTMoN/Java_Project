package statement;

import java.util.Random;

public class Ifexam02 {
	public static void main(String[] args) {
		//1. ������ �� �� �߻���Ű��
		//1) �����ڵ� - 1~4����
		//2) ���� - 1 ~ 100
		//2. ������ ���̸� ������ �Ǵ��ؼ� ��� ����ϱ�(��øif�� �̿�)
		//1) ���γ��� : �����ڵ� 1,3 ���� 20���̻�
		//2) ���ο��� : �����ڵ� 2,4 ���� 20���̻�
		//2) û�ҳⳲ�� : �����ڵ� 1,3 ���� 20���̸�
		//2) û�ҳ⿩�� : �����ڵ� 2,4 ���� 20���̸�
		//[�������] ���γ���(22,1)
		
		Random ran1 = new Random();//�����ڵ�
		Random ran2 = new Random();//����
		int result1 = ran1.nextInt(4)+1;
		int result2 = ran2.nextInt(100)+1;

		if(result1%2==0) {
			if(result2>=20) {
					System.out.println("���ο���"+"("+result2+","+result1+")");
				}else {
					System.out.println("û�ҳ⿩��"+"("+result2+","+result1+")");
				}
			}else {
				if(result2>=20){
					System.out.println("���γ���"+"("+result2+","+result1+")");
				}else{
					System.out.println("û�ҳⳲ��"+"("+result2+","+result1+")");}
				}
			}
		}
