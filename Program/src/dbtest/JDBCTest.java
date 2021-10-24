package dbtest;

import java.sql.*;

public class JDBCTest {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
			// 1. Driver ����
			// ojdbc6.jar ���̺귯�� �߰� - oracle.jdbc.driver ��Ű�� - OracleDriver Ŭ����
			
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			System.out.println("jdbc driver �ε� ����");
			
			// 2. ���� ����
			// properties - Connection URL
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password);
			
			// 3. Query �غ�
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM EMP";
			
			// 4. ���� �� ����
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2)
				+ " " + rs.getString(3) + " " + rs.getInt(4) + " "
				+ rs.getDate(5) + " " + rs.getInt(6) + " " + rs.getInt(7) + " " +
				rs.getInt(8));
			}
			
			// 5. DB ����
			rs.close();
			stmt.close();
			con.close();
		}
	}

