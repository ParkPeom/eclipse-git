package dao;

import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dto.DTO;

import common.JDBCTemplate;


// DAO - DB�� ������ ���� Select / Inset / Update / Delete �۾��� ����
public class DAO extends JDBCTemplate {
	
	// ��ü ���
	public List<DTO> selectList() throws SQLException, ClassNotFoundException {
		List<DTO> list = new ArrayList<DTO>();
		String driver = "oracle.jdbc.driver.OracleDriver";
		Class.forName(driver);
		System.out.println("jdbc driver �ε� ����");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		

		// 1. driver ����
		
		
		// 2. ���� ����
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = null;
		ResultSet rs = null;
		String sql = " SELECT NO, NAME, NICKNAME FROM MYTEST ";

		try {
			// 3. query �غ�
			stmt = con.createStatement();
			// 4. ���� �� ����
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				DTO dto = new DTO();

				dto.setNO(rs.getInt("NO"));
				dto.setNAME(rs.getString("NAME"));
				dto.setNICKNAME(rs.getString("NICKNAME"));

				list.add(dto);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			// 5. db ����
			rs.close();
			stmt.close();
			con.close();
		}

		return list;
	}

	// ���� ���
	public DTO selectOne(int no) throws SQLException, ClassNotFoundException {
		DTO dto = new DTO();

		// 1. driver ����
		// 2. ���� ����
		
		
		List<DTO> list = new ArrayList<DTO>();
		String driver = "oracle.jdbc.driver.OracleDriver";
		Class.forName(driver);
		System.out.println("jdbc driver �ε� ����");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		

		// 1. driver ����
		
		
		// 2. ���� ����
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = null;
		ResultSet rs = null;
		String sql = " SELECT NO, NAME, NICKNAME FROM MYTEST " + " WHERE NO = " + no;

		try {
			// 3. query �غ�
			stmt = con.createStatement();
			// 4. ���� �� ����
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				dto.setNO(rs.getInt("NO"));
				dto.setNAME(rs.getString("NAME"));
				dto.setNICKNAME(rs.getString("NICKNAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 5. db ����
			rs.close();
			stmt.close();
			con.close();
		}
		return dto;
	}

	// �߰�
//	public int insert(DTO dto) {
//		// 1. driver ����
//		// 2. ���� ����
//		
//		List<DTO> list = new ArrayList<DTO>();
//		String driver = "oracle.jdbc.driver.OracleDriver";
//		Class.forName(driver);
//		System.out.println("jdbc driver �ε� ����");
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String user = "scott";
//		String password = "tiger";
//		
//
//		// 1. driver ����
//		
//		
//		// 2. ���� ����
//		Connection con = DriverManager.getConnection(url, user, password);
//
//		PreparedStatement pstmt = null;
//		int res = 0;
//
//		String sql = " INSERT INTO MYTEST VALUES(SEQ_MYTEST_NO.NEXTVAL,?,?)";
//
//		try {
//			// 3. query �غ�
//			pstmt = con.prepareStatement(sql);
//			pstmt.setString(1, dto.getNAME());
//			pstmt.setString(2, dto.getNICKNAME());
//
//			// 4. ���� �� ����
//			res = pstmt.executeUpdate();
////			if (res > 0)
////				commit(con);
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			// 5. db ����
////			rs.close();
////			stmt.close();
////			con.close();
//		}
//
//		return res;
//	}

	// ����
//	public int update(DTO dto) {
//		// 1. driver ����
//		// 2. ���� ����
//		List<DTO> list = new ArrayList<DTO>();
//		String driver = "oracle.jdbc.driver.OracleDriver";
//		Class.forName(driver);
//		System.out.println("jdbc driver �ε� ����");
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String user = "scott";
//		String password = "tiger";
//		
//
//		// 1. driver ����
//		
//		
//		// 2. ���� ����
//		Connection con = DriverManager.getConnection(url, user, password);
//		PreparedStatement pstmt = null;
//		int res = 0;
//
//		String sql = " UPDATE MYTEST " + " SET NAME = ?, NICKNAME = ? " + " WHERE NO = ?";
//
//		try {
//			// 3. query �غ�
//			pstmt = con.prepareStatement(sql);
//			// 4. ���� �� ����
//			pstmt.setString(1, dto.getNAME());
//			pstmt.setString(2, dto.getNICKNAME());
//			pstmt.setInt(3, dto.getNO());
//
//			res = pstmt.executeUpdate();
//
//			if (res > 0)
//				commit(con);
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			// 5. db ����
//			close(pstmt);
//			close(con);
//		}
//
//		return res;
//	}

	// ����
//	public int delete(int no) {
//		// 1. driver ����
//		// 2. ���� ����
//		List<DTO> list = new ArrayList<DTO>();
//		String driver = "oracle.jdbc.driver.OracleDriver";
//		Class.forName(driver);
//		System.out.println("jdbc driver �ε� ����");
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String user = "scott";
//		String password = "tiger";
//
//		Connection con = DriverManager.getConnection(url, user, password);
//
//		PreparedStatement pstmt = null;
//		int res = 0;
//
//		String sql = " DELETE FROM MYTEST WHERE NO = ?";
//
//		try {
//			// 3. query �غ�
//			pstmt = con.prepareStatement(sql);
//			// 4. ���� �� ����
//			pstmt.setInt(1, no);
//
//			res = pstmt.executeUpdate();
//
//			if (res > 0)
//				commit(con);
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			// 5. db ����
//			close(pstmt);
//			close(con);
//		}
//
//		return res;
//	}
}
	
	
	
	
	
	
	
	
	