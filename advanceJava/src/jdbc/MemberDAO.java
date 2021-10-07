package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//member���̺��� �������ϴ� ����� ���� �ִ� Ŭ����
//=> member���̺��� ���ؼ� �����ؾ� �ϴ� ��� ����� �޼ҵ�� ����
public class MemberDAO {
	//�Ű������� ����ڰ� �Է��� ���� ǥ���� DTO��ü�� �޵��� �ۼ�
	public void insert(MemberDTO user) {
		System.out.println("���������� ����ڰ� �Է��� ������:"+user);//user.toString()ȣ���� �Ͱ� ����
		String sql = "insert into member values(?,?,?,?,1000,?)";
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, user.getId());
			stmt.setString(2, user.getPass());
			stmt.setString(3, user.getName());
			stmt.setString(4, user.getAddr());
			stmt.setString(5, user.getDeptno());
			int result = stmt.executeUpdate();
			System.out.println(result+ "�� �� ���Լ���<DAO>");
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt, con);
		}
	}
	//member���̺� insert�ϱ� - ȸ�����Ա��
	public void insert(String id, String pass, String name, String addr, String deptno) {	
		String sql = "insert into member values(?,?,?,?,1000,?)";
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setString(2, pass);
			stmt.setString(3, name);
			stmt.setString(4, addr);
			stmt.setString(5, deptno);
			int result = stmt.executeUpdate();
			System.out.println(result+ "�� �� ���Լ���<DAO>");
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt, con);
		}
	} 
	//member���̺��� �����͸� update�޼ҵ� - �ּҸ� ����
	public void update(String id, String addr) {
		String sql = "update member set addr = ? where id = ?";
		Connection con = null;
		PreparedStatement stmt = null;		
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, addr);
			stmt.setString(2, id);
			int result = stmt.executeUpdate();
			System.out.println(result+ "�� �� ���漺��<DAO>");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtil.close(null, stmt, con);
		}
	}
	//member���̺��� �����͸� �����ϴ� �޼ҵ� - ȸ��Ż����
	public void Delete(String id) {
		String sql = "delete member where id = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			int result = stmt.executeUpdate();
			System.out.println(result+ "�� �� ��������<DAO>");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtil.close(null, stmt, con);
		}
	}
	//member���̺��� ��ü ���ڵ带 ��ȸ�ϴ� �޼ҵ� - ȸ�������ȸ
	public void Select() {
		String sql = "select * from member";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;		
		try {
			con =DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString("pass")+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.print(rs.getInt(5)+"\t");
				System.out.println(rs.getString(6));
			}
			System.out.println("��ȸ���<DAO>");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtil.close(rs, stmt, con);
		}
	}
}
