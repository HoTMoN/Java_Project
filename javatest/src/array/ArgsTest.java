package array;

public class ArgsTest {
	public static void main(String[] args) {
		System.out.println("�������Ű������� ����:"+args.length);
		System.out.println("�����ip:"+args[0]);
		System.out.println("�����port:"+args[1]);
		
		//������Ű������� �Էµ� ���� ��� String�̹Ƿ� ���� ��ȯ�� �� �ִ�.
		System.out.println(Integer.parseInt(args[2])
										+Integer.parseInt(args[3]));
	}
}