package array;

public class ArgsExam02 {
	public static void main(String[] args) {
		//������Ű������� ���� 5�� �Է¹ް� Ȧ������ ¦������ ���
		//�������
		//������Ű�����1:100 -> ¦��
		//....
		int j = 0;
		for(int i = 0;i<args.length;i++) {
			j = i+1;
			if(Integer.parseInt(args[i])%2==0){
				System.out.println("������Ű�����"+j+":"+args[i]+" -> ¦��");
			}else {
				System.out.println("������Ű�����"+j+":"+args[i]+" -> Ȧ��");
			}
		}
	}
}
