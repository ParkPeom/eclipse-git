package OOP_10_26;

import java.util.ArrayList;
import java.util.List;

// this : 메서드에 숨겨져 있는 매개변수(키워드) - 
// => this 매개변수의 자료형은 메서드가 선언된 클래스 
// => 메서드를 호출한 인스턴스의 정보(해쉬코드)를 저장하기 위한 참조변수
// => 인스턴스가 메서드를 호출한 경우 호출 인스턴스의 정보를 자동으로 전달받아 저장한다.
// => this가 있어야 하는 이유는 메서드에서 인스턴스필드 또는 메서드에 접근하기 위해 this를 사용한다.
// => this를 표현하지 않아도 자동으로 인스턴스 필드 또는 메서드에 접근 할수 있다.

// 회원정보(아이디,이름,이메일)를 저장하기 위한 클래스
// 값만 저장하는 클래스 = VO클래스(Value Object) 클래스


public class MemberVO {
	
	// 필드(Filed) 선언
	// => 인스턴스 생성시 필드에 기본값이 초기값으로 자동 저장된다.
	// 숫자형:0,논리형:false,참조형:null
	private String id; 
	private String name;
	private String email;
	List<MemberVO> arr;
	
	// 생성자(Constructor) 선언
	// => 생성자를 선언하지 않으면 기본생성자가 자동 제공
	// => 생성자 작성 규칙 : 반환형이 없으며 메서드명은 (반드시 클래스명과 동일) 하게 작성
	// => 오버로딩 선언 가능 : 매개변수가 다른 생성자를 여러개 선언가능
	// => 초기화 작업 구현 : 생성자를 이용하여 인스턴스 생성시 필드에 원하는 초기값이 저장되게 한다.
	
	// 매개변수가 없는 기본 생성자 
	// => 일반적으로 초기화 작업 미구현 - 인스턴스 생성시 필드에 기본값을 초기값으로 저장
	// => 선언하지 않을 경우 상속 관련 문제가 발생할 수 있으므로 선언하는 것을 권장 한다.
	// 매개변수가 없는 생성자 자동 완성 : ctrl + space >> 생성자 선택
	public MemberVO(){
		super();
		arr = new ArrayList<MemberVO>();
	}
	
	// => 생성자를 선언하면 기본생성자가 제공되지 않는다.
	
	// 매개변수가 있는 생성자 
	// => 매개변수에 전달된 값을 이용하여 필드의 초기값으로 설정해준다.
	// => 인스턴스 생성시 필드에 원하는 값이 초기값으로 저장되도록 생성자를 작성한다.
	// 매개변수가 있는 생성자 자동 완성 : Alt + Shift + S >> 팝업메뉴 >> [O] >> 필드 선택 >> Generate 완성 
	
	public MemberVO(String id) {
		this.id = id;
	}
	
	public MemberVO(String email, String name) {
		super();
		this.email = email;
		this.name = name;
	}

	public MemberVO(String id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	// 메서드(Method) 선언 - setter , getter 만 만든다. 
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	// 필드값을 출력하는 메서드 >> 필드값을 확인
	// 코드의 중복성을 최소화 한다.
	public void display() {
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.email);
	}
	
	public void display(List<MemberVO> arr) { // 참조변수 안써도 메서드에 직접 접근이 가능
		for(MemberVO s : arr) {
			System.out.println(s);
		}
	}
}
