package dbtest;

import java.sql.*;

public class JDBCTest {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
			// 1. Driver 연결
			// ojdbc6.jar 라이브러리 추가 - oracle.jdbc.driver 패키지 - OracleDriver 클래스
			
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			System.out.println("jdbc driver 로딩 성공");
			
			// 2. 계정 연결
			// properties - Connection URL
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password);
			
			// 3. Query 준비
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM EMP";
			
			// 4. 실행 및 리턴
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2)
				+ " " + rs.getString(3) + " " + rs.getInt(4) + " "
				+ rs.getDate(5) + " " + rs.getInt(6) + " " + rs.getInt(7) + " " +
				rs.getInt(8));
			}
			
			// 5. DB 종료
			rs.close();
			stmt.close();
			con.close();
		}
	}

