package statement;

public class GuGu_while {
	public static void main(String[] args){
		for(int i=2;i<=9;i++) {
			if(i==5) {
				continue;
			}
			for(int r=1;r<=9;r++) {
				if(r==5) {
					continue;
				}
			System.out.print(i+"*"+r+"="+(r*i)+"\t");
			}
			System.out.println();
		}
	}
}
