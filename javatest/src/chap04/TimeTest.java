package chap04;
/*
TimeTest.java�ۼ��ϱ�
�Ʒ��� ������ �����ϰ�, ������ ���� ������ �����ϵ��� �۾��ϼ���
time�� �� ��������
int time = 8000;

[�������]
_____��______��_____��

*/
public class TimeTest{
	public static void main(String[] args){
		int time = 8000;
		int hour = 3600;
		int minute = 60;
		int second = 1;
		int result1 = time/hour;
		int result2 = (time-hour*result1)/minute;
		int result3 = (time - result1*hour - result2*minute)/second;
		System.out.println(result1+"��"+result2+"��"+result3+"��");
	}
}