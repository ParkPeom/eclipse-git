package OOP_10_28;

// ����� ��� - �������(��ȣ,�̸�) �� ���� �ϱ� ���� Ŭ����  
// => �л� ���� ���� �� ���� �������� �Ӽ��� ������ �����ϱ� ���� Ŭ����
// => �ߺ��� �ڵ带 �ּ�ȭ �Ҽ��ִ�.(��������)
// => �ڵ��� �ߺ����� �ּ�ȭ �Ͽ� ���α׷��� ���꼺 �� ���������� ȿ���� ����
public class AcademyPerson {
	
	// �ڵ��� �ߺ��Ǵ°��� �����ش�. 
	private String num;
	private String name;

	public AcademyPerson() {
		// TODO Auto-generated constructor stub
	}

	public AcademyPerson(String num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("��ȣ" + num);
		System.out.println("�̸�" + name);
	}
}
