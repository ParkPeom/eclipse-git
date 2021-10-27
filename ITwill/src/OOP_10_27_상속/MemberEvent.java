package OOP_10_27_상속;
// 이벤트 관련 회원정보(아이디,이름,이메일)를 저장하기 위한 클래스
// => 회원정보를 저장하는 Member 클래스를 상속받아 작성하는 것을 권장
// 자식 클래스 선언시 extends 키워드로 기존 클래스(부모 클래스) - Super Class를 상속받아 새로운 클래스(자식클래스) 작성
// (자식 클래스 - Sub Class)를 작성
// => 자식 클래스에서 부모 클래스의 필드 또는 메서드에 접근하여 사용 가능 - 상속성(Inheritance)
// => 단일 상속만 가능 - 부모 클래스를 하나만 설정 
// 

public class MemberEvent extends Member {
	
	// 부모 클래스(Member)를 상속받아 사용 가능하므로 필드 미선언 
	/*
	private String id;
	private String name;
	*/
	private String email;
	
	public MemberEvent(String id, String name, String email) {
		super();
		// 자식클래스에서 필드 또는 메서드 접근 순서 : 자식 클래스 참조 >> 부모 클래스 참조
		// => 부모 클래스의 은닉화 선언된 필드 또는 메서드는 접근이 불가능
		// this.id = id;
		this.setId(id); // 자식이 없으면 부모것을 참조한다.
//		this.name = name;
		setName(name);
//		this.email = email;
		this.email = email;
	}
	/*
	public MemberEvent() {
		
	}
	
	public String getId() {
		return super.id;
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
	*/
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void display() {
		System.out.println("아이디 = " + getId());
		System.out.println("이름 = " + super.getName());
		System.out.println("이메일 = " + email);
	}
}
