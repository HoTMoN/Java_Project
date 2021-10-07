package jdbc.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeptInsertTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@192.168.0.27:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "insert into mydept values('200', 'ÀÎ»çÆÀ', '10Ãþ', 'hong')";
		String sql2 = "insert into mydept values('300', 'ÃÑ¹«ºÎ', '7Ãþ', 'hong')";
		Connection con = null;
		Statement stmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
			stmt.executeUpdate(sql2);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
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