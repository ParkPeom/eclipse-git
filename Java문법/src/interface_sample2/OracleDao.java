package interface_sample2;

public class OracleDao implements DataAccessObject {

	@Override
	public void search() {
		System.out.println("Oracle DB���� �˻�");
	}

	@Override
	public void insert() {
		System.out.println("Oracle DB���� ����");
		
	}

	@Override
	public void update() {
		System.out.println("Oracle DB���� ����");
		
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB���� ����");
		
	}
	
}
