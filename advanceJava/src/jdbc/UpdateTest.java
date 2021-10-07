package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@192.168.0.27:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "update member ";
		sql = sql + "set addr = '力林' ";
		sql = sql + "where id = 'jang'";
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			System.out.println(con + "??");
			stmt = con.createStatement();
			System.out.println(stmt + "???");
			int result = stmt.executeUpdate(sql);
			System.out.println(result+ "俺 青 火涝己傍!!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
