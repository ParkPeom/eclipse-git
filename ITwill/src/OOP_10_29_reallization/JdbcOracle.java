package OOP_10_29_reallization;

// �л� ���� ����� �����ϴ� Ŭ���� - oracle
public class JdbcOracle implements jdbc {
	
	public void add() {
		System.out.println("�л� ���� ����");
	}
	
	public void modify() {
		System.out.println("�л� ���� ����");
	}
	
	public void remove() {
		System.out.println("�л� ���� ����");
		
	}
	
	public void search() {
		System.out.println("�л� ���� �˻�");
	}

	// �������̽��� ��ӹ����� �������̵� �� ����� �Ѵ�.
	
	@Override
	public void insert() {
		
	}

	@Override
	public void update() {
		
	}

	@Override
	public void delete() {
		
	}

	@Override
	public void select() {
		
	}
}
