package AI_Quest;

public class CA_Prob2 {
	public static void main(String[] args) {
		CA_Book[] booklist = new CA_Book[5];
		CA_Book book1 = new CA_Book("Java Program", 25000);
		CA_Book book2 = new CA_Book("JSP Program", 15000);
		CA_Book book3 = new CA_Book("SQL Fundamentals", 30000);
		CA_Book book4 = new CA_Book("JDBC Program", 28000);
		CA_Book book5 = new CA_Book();
		book5.setTitle("EJB Program");
		book5.setPrice(34000);
		book5.print();
		booklist[0] = book1;
		booklist[1] = book2;
		booklist[2] = book3;
		booklist[3] = book4;
		booklist[4] = book5;
		CA_BookMgr mgr = new CA_BookMgr(booklist);
		System.out.println("=== 책 목록 ===");
		mgr.printBooklist();
		System.out.println("");
		System.out.println("=== 책 가격의 총합 ===");
		mgr.printTotalPrice();
	}
}
