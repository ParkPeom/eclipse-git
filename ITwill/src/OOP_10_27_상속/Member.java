package OOP_10_27_상속;

// 회원정보를 저장하기 위한 클래스
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
		System.out.println("아이디 = " + id);
		System.out.println("이름 = " + name);
	}
}
