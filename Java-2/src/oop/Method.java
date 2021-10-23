package oop;

// 참조가 목적인 클래스 - 인스턴스(객체) 생성을 위한 클래스
public class Method {
	// 기본생성자가 이미 있다.
	
	// 클래스를 선언하면 클래스 내부에는 매개변수가 없는 기본 생성자(Default Constructor) 가 선언된 것으로 처리된다.
	// 선언된 것으로 처리
	
	// 메서드 선언
	void displayOne() {
		System.out.println("Method 클래스의 displayOne() 메서드 호출");
	}
	
	void displayTwo() {
		System.out.println("Method 클래스의 displayTwo() 메서드 호출");
	}
	
	void printOne() {
		int tot = 0;
		for(int i = 0; i <= 100; i++) {
			tot += i;
		}
		System.out.println(" 1 ~ 100 범위의 정수들의 합계 = " + tot);
	}
	
	// 메서드 호출시 매개변수의 값이 정상적으로 전달되어 저장되어야만 메서드의 명령 실행 
	// => 매개변수에 값이 저장되지 않을 경우 메서드 호출 불가능 - 에러 발생
	
	void printTwo(int num) {
		// 매개변수에 저장된 값에 대한 유효성 검사를 해줄수 있다.
		if(num <= 0 ) { // 비정상적인 값이 매개변수에 저장된 경우
			System.out.println("[에러]매개변수에는 0보다 큰 값이 저장되어야 합니다.");
			return ; // 메서드 강제 종료 
		}
		
		int tot = 0;
		for (int i = 0; i <= num; i++) {
			tot += i;
		}
		System.out.println("1~"+num+"범위의 합계 " + tot);
	}
	
	void printThree(int num1 , int num2) {
//		if(num1 > num2) { // 비정상적인 값이 매개변수에 저장된경우
//			System.out.println("[에러]매개변수에는 0보다 큰 값이 저장되어야 합니다.");
//			return;
//		}
		// 사용자를 위해 조금더 유도리 있게 처리해 준다. 
		if(num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		int tot = 0;
		for (int i = num1; i <= num2; i++) {
			tot += i;
		}
		// 메서드에서 입출력을 안하는게 좋다 . 
		// 출력 대신 반환형을 만들어주는게 좋다. 
		System.out.println(num1 + "~" + num2 + "범위의 정수들의 합계 = " + tot);
	}
	int returnTot(int num1 , int num2) {
		if(num1>num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		int tot= 0;
		for (int i = num1; i <= num2; i++) {
			tot +=i;
		}
		// 변수에 저장된 값을 메서드 종료시 반환
		// => 메서드의 반환형과 같은 자료형의 값을 반환
		return tot;
	}
}
