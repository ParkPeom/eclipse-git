package interface_sample2;

public class DaoExample {
	
	// �������̽��� �Ű������� �޾Ƽ�
	// ����� �ڽĵ��� ����Ѵ�.
	
	public static void dbWork(DataAccessObject obj) {
		obj.search();
		obj.insert();
		obj.delete();
		obj.update();
		
	}
	
	public static void main(String[] args) {
		// ��ü�� �Ű������� �� 
		// static �̸� �ٷ� ���� ���� 
		dbWork(new MySqlDao());
		dbWork(new OracleDao());
	
	}
}
