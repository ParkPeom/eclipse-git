package movemangement;

public class UserVO {
	
	// �������� ĸ��ȭ 
	private String id;
	private String pwd;
	private String name;
	private int age;
	
	// ���� ���� ������ �ʱ�ȭ
	public UserVO(String id, String pwd, String name, int age) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.age = age;
	}

	// getter setter ��ȿ�� �˻� 
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		System.out.println("ID �ټ����ڸ� �Է����ֽÿ�.");
		if(id.length() >= 5) {
			this.id = id;			
		} else {
			System.out.println("�ٽ� �Է��� �ֽÿ�.");
		}
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		System.out.println("�н����� 10���� �̻� �Է����ּ���.");
		if(pwd.length() >= 10) {
			this.pwd = pwd;			
		} else {
			System.out.println("�ٽ� �Է��� �ֽÿ�.");
		}
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("�̸� �α��� �̻� ");
		if(name.length() >= 2) {
			this.name = name;			
		} else {
			System.out.println("�ٽ� �Է��� �ֽÿ�.");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("���� 1�� ~ 120�� ���� �Է��� �ֽÿ� ");
		if(1 <= age && age <= 100) {
			this.age = age;			
		} else {
			System.out.println("�ٽ� �Է��� �ֽÿ�.");
		}
	}

	@Override
	public String toString() {
		String infoPrint = String.format("���̵� : %s �н����� %s �̸� %s ���� %d", 
				id , pwd , name , age);
	
		return infoPrint;
	}
}
