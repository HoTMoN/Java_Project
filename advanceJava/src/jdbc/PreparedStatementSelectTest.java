package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementSelectTest {
	public static void main(String[] args) {
		/* PreparedStatementSelectTest obj = new PreparedStatementSelectTest(); */
		MemberDAO dao = new MemberDAO();
		dao.Select();
	}
	
	public void Select() {
		String url = "jdbc:oracle:thin:@192.168.0.27:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "select * from member";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.print(rs.getInt(5)+"\t");
				System.out.println(rs.getString(6));
			}
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
