package OOP_10_27_���;

// ȸ�������� �����ϱ� ���� Ŭ����
public class Member {
	
	private String id;
	private String name;
	private static Member Instance;
	
	public Member() {
		
	}
	
	static {
		Instance =  new Member();
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
	
	public static Member getInstance() {
		return Instance;
	}
	
	
	public static void setInstance(Member instance) {
		Instance = instance;
	}

	public void display() {
		System.out.println("���̵� = " + id);
		System.out.println("�̸� = " + name);
	}
}
