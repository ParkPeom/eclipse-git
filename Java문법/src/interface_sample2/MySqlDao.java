package interface_sample2;

public class MySqlDao implements DataAccessObject {

	@Override
	public void search() {
		System.out.println("MySQL DB���� �˻�");

	}
	@Override
	public void insert() {
		System.out.println("MySQL DB���� ����");
	}
		

	@Override
	public void update() {
		System.out.println("MySQL DB���� ����");
	}

	@Override
	public void delete() {
		System.out.println("MySQL DB���� ����");
	}
}
