package OOP_10_28;

// 자동차 정보 (소유자명,모델명) 를 저장하기 위한 클래스
// 부모 클래스가 없는 경우 기본적으로 Object 클래스를 상속받는다. 
// => Java 클래스는 반드시 Object 클래스를 상속 - 무조건 부모 클래스다 
// Object : 모든 Java 클래스의 최선조 클래스다  
// => Object 클래스로 참조변수를 생성하면 모든 Java클래스로 생성된 인스턴스를 저장 가능 

// Object는 너무 많은 자손이 많다.... 그래서 나중에 제네릭으로 조건을 검...
// ex) equals(Object object) <- 어떠한 타입도 object에 넣을수있다.
//    필드값을 비교하기도 한다. 


public class Car  /* extends Object */ {
	private String userName;
	private String modelName;
	
	public Car() {

	}

	public Car(String userName, String modelName) {
		super();
		this.userName = userName;
		this.modelName = modelName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	// 인스턴스의 필드값을 문자열로 반환하여 반환하는 메서드 
	// => 인스턴스의 필드값을 확인하기 위한 목적으로 오버라이드 선언 
	@Override
	public String toString() {
		return "소유주 : " + userName + ", 모델명 : " + modelName;
	}
}
