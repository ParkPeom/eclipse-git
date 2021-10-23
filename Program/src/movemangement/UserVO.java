package movemangement;

public class UserVO {
	
	// 유저정보 캡슐화 
	private String id;
	private String pwd;
	private String name;
	private int age;
	
	// 유저 정보 생성자 초기화
	public UserVO(String id, String pwd, String name, int age) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.age = age;
	}

	// getter setter 유효성 검사 
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		System.out.println("ID 다섯글자를 입력해주시오.");
		if(id.length() >= 5) {
			this.id = id;			
		} else {
			System.out.println("다시 입력해 주시오.");
		}
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		System.out.println("패스워드 10글자 이상 입력해주세요.");
		if(pwd.length() >= 10) {
			this.pwd = pwd;			
		} else {
			System.out.println("다시 입력해 주시오.");
		}
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("이름 두글자 이상 ");
		if(name.length() >= 2) {
			this.name = name;			
		} else {
			System.out.println("다시 입력해 주시오.");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("나이 1살 ~ 120살 사이 입력해 주시오 ");
		if(1 <= age && age <= 100) {
			this.age = age;			
		} else {
			System.out.println("다시 입력해 주시오.");
		}
	}

	@Override
	public String toString() {
		String infoPrint = String.format("아이디 : %s 패스워드 %s 이름 %s 나이 %d", 
				id , pwd , name , age);
	
		return infoPrint;
	}
}
