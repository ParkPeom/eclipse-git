package OOP_10_29_reallization;

// ��Ŭ������ �̿��Ͽ� Ŭ������ �������̽��� �����Ͽ� �����ϴ� ���
// Ŭ���� >> Refactor >> Extract Interface >> ����â >> �������̽��� �Է� �� �޼��� ���� >> OK

// �л����� ����� �����ϴ� Ŭ���� - mysql
public class JdbcMysql implements jdbc {

	public void insert() {
		System.out.println("[Mysql] �л� ������ ���� �Ͽ����ϴ�.");
	}
	
	public void update() {
		System.out.println("[Mysql] �л������� ���� �Ͽ����ϴ�.");
	}
	
	public void delete() {
		System.out.println("[Mysql] �л������� ���� �Ͽ����ϴ�.");
	}
	
	public void select() {
		System.out.println("[Mysql] �л� ������ �˻��Ͽ����ϴ�.");
	}
}
