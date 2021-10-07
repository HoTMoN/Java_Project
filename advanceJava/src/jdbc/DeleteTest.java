package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@192.168.0.28:1521:xe";
		String user = "scott";
		String password = "tiger";
		StringBuffer sql = new StringBuffer();
		sql.append("delete member ");
		sql.append("where id = 'id' ");
		Connection con = null;
		Statement stmt = null;
		
		//String sql = "delete member where id = 'lee'";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			stmt = con.createStatement();
			// -toString�޼ҵ带 ȣ���ؼ� StringBuffer�� String���� ��ȯ
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result+ "�� �� ��������!!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
