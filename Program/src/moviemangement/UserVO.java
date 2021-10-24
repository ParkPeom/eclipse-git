package moviemangement;

public class UserVO { 
	
	// �������� ĸ��ȭ 
	private String id;   	// ���̵�
	private String pwd;  	// ���
	private String name; 	// �̸�
	private int age; 	 	// ����
	private String jumin;   // �ֹι�ȣ
	private String gender;     // ����
	
	// ���� ���� ������ �ʱ�ȭ
	public UserVO(String id, String pwd, String name, int age , String jumin , String gender) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.age = age;
		this.jumin = jumin;
		this.gender = gender;
	}
	
	public UserVO(){}

	// getter setter ��ȿ�� �˻� 
	public String getId() {
		return id;
	}
	
	// ���̵� ��ȿ�� 
	public boolean setId(String id) {
		do {
		if( 5 <= id.length() && id.length() <= 10) {
			this.id = id;
			return true; // ��ȿ�� �Ϸ� 
		} else {
			System.out.println(" ��ȿ�� ������ Ȯ�� �� �ٽ� �Է��� �ֽÿ�.");
				return false;// ��ȿ�� ���� 
			} 
		} while(!(5 <= id.length() && id.length() <= 10)); 
		// false �̸� �ٽ� ���� �� 
	}
	
	public String getPwd() {
		return pwd;
	}

	// �н����� ��ȿ��
	public boolean setPwd(String pwd) {
		
		do {
		if(pwd.length() >= 10) {
			this.pwd = pwd;		
			return true;
		} else {
			System.out.println(" ��ȿ�� ������ Ȯ�� �� �ٽ� �Է��� �ֽÿ�.");
				return false;
			}
		} while(!(10 <= pwd.length()));
	}
	
	public String getName() {
		return name;
	}
	
	// �̸� ��ȿ�� 
	public boolean setName(String name) {
	
		do {
		if(name.length() >= 2) {
			this.name = name;			
			return true;
		} else {
			System.out.println(" ��ȿ�� ������ Ȯ�� �� �ٽ� �Է��� �ֽÿ�.");
				return false;
			}	 
		}while(!(2 <= name.length()));
	}

	public int getAge() {
		return age;
	}

	// ���� ��ȿ��
	public boolean setAge(int age) {
		
		do {
			if(1 <= age && age <= 100) {
				this.age = age;			
				return true;
			} else {
				System.out.println("�ٽ� �Է��� �ֽÿ�.");
					return false;
			}
		} while(!(1 <= age && age <= 100));
	}
	
	public String getJumin() {
		return jumin;
	}

	// �ֹι�ȣ ��ȿ�� 
	public boolean setJumin(String jumin) {
		// �ֹι�ȣ 940114 - 1 ? 2? 3? 4? �� ������ �;��� 
		// 1 , 3 = ����
		// 2 , 4 = ����
		// ��� 14�ڸ� 
		do {
			// �ֹι�ȣ ��ȿ�� �˻� 
			if((jumin.charAt(8) == '1' || jumin.charAt(8) == '3') && jumin.length() == 14 ) {
				this.jumin = jumin;
				return true;
			} 
			if((jumin.charAt(8) == '2' || jumin.charAt(8) == '4') && jumin.length() == 14 ) {
				this.jumin = jumin;
				return true;
			} else {
				return false;
				}
			} while(!(jumin.charAt(8) == '2' || jumin.charAt(8) == '4') && jumin.length() == 14);
		}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	// ���̵� ��й�ȣ ã�� 
	@Override
	public String toString() {
		String infoPrint = String.format("���̵� : %s �н����� %s �̸� %s ���� %d", 
				id , pwd , name , age);
		return infoPrint;
	}
}
