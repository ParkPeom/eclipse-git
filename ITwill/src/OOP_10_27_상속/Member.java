package OOP_10_27_���;

// ȸ�������� �����ϱ� ���� Ŭ����
public class Member {
	
	private String id;
	private String name;
	
	public Member() {

	}
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("���̵� = " + id);
		System.out.println("�̸� = " + name);
		
	}
}
