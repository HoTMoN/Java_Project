package array;

import java.util.Random;

/* [�������] - Scanner
* �迭��ҿ� ����� �� :________
* �迭��ҿ� ����� �� :________
* �迭��ҿ� ����� �� :________
* �迭��ҿ� ����� �� :________
* �迭��ҿ� ����� �� :________
* �������� 25 ���� -> Ȧ��
* �������� 42 ���� -> ¦��
* �������� 33 ���� -> Ȧ��
* �������� 17 ���� -> Ȧ��
* �������� 8 ���� -> ¦��*/

public class ArrayHomeExam01 {
	public static void main(String[] args) {
		/* int�� �迭�� �����ϰ� �Ʒ��� ���� ������ ������ �� �ֵ��� �۾� [����] 
		 * 1. int�� ������ 5���� ������ �� �ֵ��� ����
		 * 2. Random��(1���� 50������ ��)�� �迭������ �� ��ҿ� �����ϱ�(Scanner�� �Է� �޾Ƽ� �����ص� ����)
		 * 3. �迭 ��ҿ� ����� ���� ¦������ Ȧ������ �Ǻ��Ͽ� ����ϱ�
		 * [�������] - Random
		 * �������� 25 ���� -> Ȧ��
		 * �������� 42 ���� -> ¦��
		 * �������� 33 ���� -> Ȧ��
		 * �������� 17 ���� -> Ȧ��
		 * �������� 8 ���� -> ¦�� */
		
		int [] myarr = new int[5];
		myarr[0] = (int) Math.floor(Math.random()*50);
		myarr[1] = (int) Math.floor(Math.random()*50);
		myarr[2] = (int) Math.floor(Math.random()*50);
		myarr[3] = (int) Math.floor(Math.random()*50);
		myarr[4] = (int) Math.floor(Math.random()*50);
			for(int i=0; i<5; i++) {
				if(myarr[i]%2==0) {
					System.out.println("�������� "+myarr[i]+" ���� -> "+"¦��");
				}else {
					System.out.println("�������� "+myarr[i]+" ���� -> "+"Ȧ��");
				}
		}
	}
}
/*
 * int[] myarr = new int[5];
 *  Random rand = new Random();
 *  public ArrayHomeExam01() * { 
 *  for(int i=0;i<myarr.length;i++) { 
 *  myarr[i] = rand.nextInt();
 * if(myarr[i]%2==0) {
 * System.out.println("�������� :"+myarr[i]+"���� -> ¦��");
 *  }else {
 * System.out.println("�������� :"+myarr[i]+"���� -> Ȧ��");
 */

