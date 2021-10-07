package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementUpdateTest {
	public static void main(String[] args) {
		/* PreparedStatementUpdateTest obj = new PreparedStatementUpdateTest(); */
		MemberDAO dao = new MemberDAO();
		Scanner key = new Scanner(System.in);
		System.out.print("사용자아이디:");
		String id = key.next();
		System.out.print("주소:");
		String addr = key.next();
		dao.update(id, addr);
	}
	
	public void update(String id, String addr) {
		String url = "jdbc:oracle:thin:@192.168.0.27:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "update member set addr = ? where id = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			stmt = con.prepareStatement(sql);
			stmt.setString(1, addr);
			stmt.setString(2, id);
			int result = stmt.executeUpdate();
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
