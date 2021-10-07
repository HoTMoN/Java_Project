package AI_Quest;

public class CA_BookMgr {
	CA_Book[] booklist;
	
	public CA_BookMgr(CA_Book[] booklist) {
		this.booklist = booklist;
	}
	
	public void printBooklist(){
		for(int i=0; i<booklist.length; i++) {
			System.out.println(booklist[i].getTitle());
		}
	}
	int sum = 0;
	public void printTotalPrice(){
		for(int i=0; i<booklist.length; i++) {
			sum = sum+booklist[i].getPrice();
		}
		System.out.print(sum);
	}
	public CA_Book[] getBooklist() {
		return booklist;
	}
	public void setBooklist(CA_Book[] booklist) {
		this.booklist = booklist;
	}
	
}
