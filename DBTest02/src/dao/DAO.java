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


// DAO - DB와 연결을 통한 Select / Inset / Update / Delete 작업을 수행
public class DAO extends JDBCTemplate {
	
	// 전체 출력
	public List<DTO> selectList() throws SQLException, ClassNotFoundException {
		List<DTO> list = new ArrayList<DTO>();
		String driver = "oracle.jdbc.driver.OracleDriver";
		Class.forName(driver);
		System.out.println("jdbc driver 로딩 성공");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		

		// 1. driver 연결
		
		
		// 2. 계정 연결
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = null;
		ResultSet rs = null;
		String sql = " SELECT NO, NAME, NICKNAME FROM MYTEST ";

		try {
			// 3. query 준비
			stmt = con.createStatement();
			// 4. 실행 및 리턴
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
			// 5. db 종료
			rs.close();
			stmt.close();
			con.close();
		}

		return list;
	}

	// 선택 출력
	public DTO selectOne(int no) throws SQLException, ClassNotFoundException {
		DTO dto = new DTO();

		// 1. driver 연결
		// 2. 계정 연결
		
		
		List<DTO> list = new ArrayList<DTO>();
		String driver = "oracle.jdbc.driver.OracleDriver";
		Class.forName(driver);
		System.out.println("jdbc driver 로딩 성공");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		

		// 1. driver 연결
		
		
		// 2. 계정 연결
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = null;
		ResultSet rs = null;
		String sql = " SELECT NO, NAME, NICKNAME FROM MYTEST " + " WHERE NO = " + no;

		try {
			// 3. query 준비
			stmt = con.createStatement();
			// 4. 실행 및 리턴
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				dto.setNO(rs.getInt("NO"));
				dto.setNAME(rs.getString("NAME"));
				dto.setNICKNAME(rs.getString("NICKNAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 5. db 종료
			rs.close();
			stmt.close();
			con.close();
		}
		return dto;
	}

	// 추가
//	public int insert(DTO dto) {
//		// 1. driver 연결
//		// 2. 계정 연결
//		
//		List<DTO> list = new ArrayList<DTO>();
//		String driver = "oracle.jdbc.driver.OracleDriver";
//		Class.forName(driver);
//		System.out.println("jdbc driver 로딩 성공");
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String user = "scott";
//		String password = "tiger";
//		
//
//		// 1. driver 연결
//		
//		
//		// 2. 계정 연결
//		Connection con = DriverManager.getConnection(url, user, password);
//
//		PreparedStatement pstmt = null;
//		int res = 0;
//
//		String sql = " INSERT INTO MYTEST VALUES(SEQ_MYTEST_NO.NEXTVAL,?,?)";
//
//		try {
//			// 3. query 준비
//			pstmt = con.prepareStatement(sql);
//			pstmt.setString(1, dto.getNAME());
//			pstmt.setString(2, dto.getNICKNAME());
//
//			// 4. 실행 및 리턴
//			res = pstmt.executeUpdate();
////			if (res > 0)
////				commit(con);
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			// 5. db 종료
////			rs.close();
////			stmt.close();
////			con.close();
//		}
//
//		return res;
//	}

	// 수정
//	public int update(DTO dto) {
//		// 1. driver 연결
//		// 2. 계정 연결
//		List<DTO> list = new ArrayList<DTO>();
//		String driver = "oracle.jdbc.driver.OracleDriver";
//		Class.forName(driver);
//		System.out.println("jdbc driver 로딩 성공");
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String user = "scott";
//		String password = "tiger";
//		
//
//		// 1. driver 연결
//		
//		
//		// 2. 계정 연결
//		Connection con = DriverManager.getConnection(url, user, password);
//		PreparedStatement pstmt = null;
//		int res = 0;
//
//		String sql = " UPDATE MYTEST " + " SET NAME = ?, NICKNAME = ? " + " WHERE NO = ?";
//
//		try {
//			// 3. query 준비
//			pstmt = con.prepareStatement(sql);
//			// 4. 실행 및 리턴
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
//			// 5. db 종료
//			close(pstmt);
//			close(con);
//		}
//
//		return res;
//	}

	// 삭제
//	public int delete(int no) {
//		// 1. driver 연결
//		// 2. 계정 연결
//		List<DTO> list = new ArrayList<DTO>();
//		String driver = "oracle.jdbc.driver.OracleDriver";
//		Class.forName(driver);
//		System.out.println("jdbc driver 로딩 성공");
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
//			// 3. query 준비
//			pstmt = con.prepareStatement(sql);
//			// 4. 실행 및 리턴
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
//			// 5. db 종료
//			close(pstmt);
//			close(con);
//		}
//
//		return res;
//	}
}
	
	
	
	
	
	
	
	
	