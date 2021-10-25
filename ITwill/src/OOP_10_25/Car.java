package OOP_10_25;

// 자동차를 표현하기 위한 클래스
// 자동차를 추상화하여 표현한 클래스
// => 클래스를 선언할 때는 필드 또는 메서드에 접근 지정자를 선언하여 접근 유무 설정
// 접근 지정자(Access Modifier) : private , package , protected , public 
// => 클래스, 필드, 생성자, 메서드를 작성할 때 선언하여 접근 유무를 지정하는 키워드
// private : 클래스 내부에서만 접근 가능하며 , 외부에서는 접근 불가능하도록 설정하는 지정자
// => 필드 선언시 사용 : 인스턴스로 필드에 직접 접근하는걸 차단한다. - 은닉화(Data Hiding)
// public : 모든 패키지의 클래스에서 접근 가능 하도록 설정하는 지정자
// => 메서드 선언시 사용 : 메서드를 모든 클래스에서 접근하여 사용할 수 있도록 지정
// 

public class Car {
	//필드(Field) : 표현 대상에 대한 속성 구현 - 속성값 저장
	// => 클래스에 선언된 모든 메서드에서 필드에 접근하여 사용이 가능하다 
	
	// 은닉화 처리 
	// 필드 
	private String aliasName;// 이름(별칭) - 식별자 
	private boolean engineStatus;// 엔진상태(시동유무) - false : Off , true : On
	private int currentSpeed; // 현재속도
	
	// 인스턴스 변수 기본값
	// int -> 0 boolean -> false String -> null
    
	
	// 생성자 : 객체(인스턴스)를 생성하기 위한 특별한 메서드
	// => 생성자를 선언하지 않으면 매개변수가 없는 기본 생성자가 존재하는 것으로 처리
	
	// 메서드(method) : 표현 대상에 대한 행위 구현 
	// => 필드값을 이용하여 표현 대상에 대한 행위를 명령으로 작성하여 기능을 제공해준다.
	// 자동차 시동을 켜는 행위를 표현한 메서드
	
	public void startEngine() {
		this.engineStatus = true;
		System.out.println(this.aliasName +"의 시동을 켰습니다.");
	}
	// 자동차 시동을 끄는 행위를 표현한 메서드
	
	public void endEngine() {
		
		// 엔진은 속도가 0이여야지 끌수있다. 
		if(currentSpeed != 0) {
			currentSpeed = 0;
		}
//		this.engineStatus = false;
//		System.out.println(this.aliasName +"의 시동을 껏습니다.");
		
		// 클래스에 선언된 메서드는 서로 호출이 가능하다.
		// => 코드의 중복성 최소화 : 프로그램의 생산성 증가 및 유지보수의 효율성 증가 
		stopSpeed();
	}
	
	// 자동차 속도를 증가하는 행위를 표현한 메서드
	public void upSpeed(int speed) { // 증가 속도 
		// 엔진이 켜지있을동안 수행하게 함 
		if(!engineStatus) {
			System.out.println(this.aliasName+"의 시동이 꺼져있습니다.");
			return; // return; 메서드 종료 
		}
		// 매개변수에 비정상적인 값이 전달될 경우 최고 속도
		if(currentSpeed + speed > 150) { // 현재속도와 증가속도의 합이 최대속도 보다 큰 경우
			speed = 150 - currentSpeed; // 증가속도 변경  
		// 80 + 80 
		// 70 = 150 - 80
		}
		this.currentSpeed += speed;
		System.out.println(this.aliasName +"의 속도는 "+ speed +" 증가되었습니다. 현재속도는 " + this.currentSpeed);
	}
	
	// 자동차 속도를 감소하는 행위를 표현한 메서드 
	public void downSpeed(int speed) {
		if(!engineStatus) {
			System.out.println(this.aliasName+"의 시동이 꺼져있습니다.");
			return; // return; 메서드 종료 
		}
		if(currentSpeed < speed) { // 현재속도 보다 감소 속도가 크다면 ?
			speed = currentSpeed; // 현재 속도로 만들어줌 
		}
		
		this.currentSpeed -= speed;
		System.out.println(this.aliasName +"의 속도는 "+ speed +" 감소되었습니다. 현재속도는 " + this.currentSpeed);
	}
	
	// 자동차를 멈추는 행위를 표현한 메서드 	
	public void stopSpeed() {
		this.currentSpeed = 0;
		System.out.println(this.aliasName +"의 속도는 멈췄습니다. 현재속도는 " + this.currentSpeed);
	}
	public Car() {
		super();
	}
	
	// 은닉화 선언된 필드를 위해 필드값을 반환하는 getter 와 필드값을 변경하는 setter 메서드를 선언할 수 있다. >> 캡슐화 
	public String getAliasName() {// Getter 메서드 - 메서드명 : get필드명 
		return this.aliasName; // 필드값을 반환한다.
	}
	
	public void setAliasName(String aliasName) { // Setter 메서드 - 메서드명 : set필드명 
		// 매개변수에 전달되어 저장된 값에 대한 검증 처리
		this.aliasName = aliasName; // 매개변수에 저장된 값으로 필드값 변경
							   // this는 이 메서드를 호출한 객체를 this로 표현(나의것)
							   // 왜 매개변수를 필드랑 똑같이 준 이유는
							   // 매개변수가 어떠한 필드값을 변경해야하는지 명확히 알려주기 위해서
	}
	
//	public void setAliasName(String aliasName) { // Setter 메서드 - 메서드명 : set필드명 
//		aliasName = aliasName; // 둘다 매개변수로 봄 (같은지역에 있는 매개변수로 봄)
//	}
	// Getter & Setter 메서드를 생성하는 메서드를 생성하는 단축키 
	// [ALT] + [SHIFT] + [S] >> 팝업메뉴 >> [R] >> [ 필드선택 ] >> Generate 
	// VO 클래스를 만들때 엄청 자주 쓰인다. ( 값만 저장할 클래스 )  

	
	// 은닉화 선언된 필드의 자료형이 boolean 인 경우 Getter 메서드가 아닌 is 메서드로 선언 
	// is이름이 들어가면 boolean을 반환하는 메서드
	public boolean isEngineStatus() {
		return engineStatus;
	}

	public void setEngineStatus(boolean engineStatus) {
		this.engineStatus = engineStatus;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	
}
