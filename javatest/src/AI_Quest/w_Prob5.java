package AI_Quest;

class w_Prob5 {
    public static void main(String args[]){
        int i = 10;
        int j = 20;
        
        MySum ms1 = new MySum(i, j);
        MySum ms2 = new MySum(i, j);

        System.out.println(ms1);

        if(ms1.equals(ms2))
            System.out.println("ms1�� ms2�� �հ�� �����մϴ�.");
    }
}

class MySum {
    int first;
    int second;
    
    MySum (int first, int second){
        this.first = first;
        this.second = second;
    }

    /* ���� ���� ����� String���� ��ȯ�ϵ���  toString �޼ҵ� �������̵��ϴ� �κ� */


    /* �Ű������� MySum ��ü�� �����ϰ� �� ��ü�� toString() ����� �����ϸ� true��, 
�������Ű������� MySum ��ü�� �ƴϰų� �Ǵ� ���� ��ü�� �Ű������� �����ϴ� ��ü�� 
������toString() �޼ҵ��� ����� �������� ������ false�� �����ϵ��� 
������equals �޼ҵ� �������̵��ϴ� �κ� */


}
