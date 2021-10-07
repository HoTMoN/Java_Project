package jdbc.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MyDeptDAO {
	//insert
	public void insert(MyDeptDTO user) {
		String sql = "insert into mydept values(?,?,?,?)";
		Connection con = null;
		PreparedStatement stmt = null;
		try{
			con = MyDeptDBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, user.getDeptno());
			stmt.setString(2, user.getDeptname());
			stmt.setString(3, user.getLoc());
			stmt.setString(4, user.getMgr());
			stmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			MyDeptDBUtil.close(null, stmt, con);
		}
	}
	
	//update
	public void update(String deptno, String loc) {
		String sql = "update mydept set loc = ? where deptno = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = MyDeptDBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, loc);
			stmt.setString(2, deptno);
			stmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			MyDeptDBUtil.close(null, stmt, con);
		}	
	}
	//delete
	public void delete(String deptno) {
		String sql = "delete mydept where id = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = MyDeptDBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, deptno);
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			MyDeptDBUtil.close(null, stmt, con);	
		}
	}
	//select
	public void select() {
		String sql = "select * from mydept";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = MyDeptDBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t");
				System.out.println(rs.getString(2)+"\t");
				System.out.println(rs.getString(3)+"\t");
				System.out.println(rs.getString(4)+"\t");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			MyDeptDBUtil.close(rs, stmt, con);
		}
	}
}
