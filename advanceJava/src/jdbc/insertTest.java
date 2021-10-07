package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//CRUD (CLRUD)
//C - insert, R - select, U - update, D - Delete
//C - insert, L - select(��ü�����ȸ), R - select(���ǿ� �����ϴ� ���� ��ȸ), U - update, D - delete
//��� DB���� �۾��� ������ DB������ Ŀ�ؼ��� ���� �ؾ� �Ѵ�.
public class insertTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@192.168.0.26:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "insert into member values('rank','1234','�̹�ȣ','��','1000','100')";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//1. ����̹��ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹��ε�����!!");
			//2. DB������ Ŀ�ؼ�
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Ŀ�ؼǼ���!!" + con);
			//3. SQL�� �����ϴ� ����� ���� �ִ� ��ü Statement����
			//	 => java.sql.Statement���� ���������� ���εǴ� ��ü�� *oracle�����翡�� ���� Ŭ���� Ÿ�� 
			//														*oracle.jdbc.driver.OracleStatementWrapper	
			stmt = con.createStatement();
			System.out.println("Statement��ü ���� �Ϸ�" + stmt);
			//4. SQL����
			int result = stmt.executeUpdate(sql);
			System.out.println(result+ "�� �� ���Լ���!!");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
