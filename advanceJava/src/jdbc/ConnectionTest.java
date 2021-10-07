package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@192.168.0.26:1521:xe";
		String user = "scott";
		String password = "tiger";
		try {
			//1. JDBC드라이버를 로딩 - 오라클
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버로딩성공!!");
			//2. DMBS 커넥션
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("커넥션성공!!" + con);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
