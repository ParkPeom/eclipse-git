package OOP_10_29_reallization;

// �л� ���� ���α׷� 
public class JdbcApp {
	
	public static void main(String[] args) {
		
		/*
		JdbcMysql mysql = new JdbcMysql();
		mysql.insert();
		mysql.update();
		mysql.delete();
		mysql.select();
		*/
		
		// �ý��� ��ü�� ���� Ŭ���� ����� ���α׷��� ��κ��� ���� ó��
		// => Ŭ���� ���� ���յ� ���� ���������� ȿ���� ���� 
		
		JdbcOracle oracle = new JdbcOracle();
		
		oracle.add();
		oracle.modify();
		oracle.remove();
		oracle.search();
		
		// �������̽��� �̿��Ͽ� Ŭ������ �ۼ��� ��� �ý��� ��ü�� ���� Ŭ���� �����
		// ���α׷��� �Ϻκи� ���� ó�� ���� 
		// => Ŭ���� ���� ���յ� ���� ���������� ȿ���� ����
		
		jdbc jdbc = new JdbcMysql();
		
		jdbc.insert();
		jdbc.update();
		jdbc.delete();
		jdbc.select();
		
		jdbc jdbc2 = new JdbcOracle();
		
		
	}
}
