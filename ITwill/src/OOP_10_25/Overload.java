package OOP_10_25;

public class Overload {
	
	public void displayInt(int param) {
		System.out.println("정수값 = " + param);
	}
	
	public void displayBoolean(boolean param) {
		System.out.println("논리값 = " + param); 
	}
	
	public void displayString(String param) {
		System.out.println("문자열 = " + param);
	}
	
	//*************메서드 오버로드*****************
	// 오버로딩 - 반환타입은 상관없다 이름이 똑같이 선언됬는데 
	// 매개변수 타입이 다르거나 순서가 달라야 한다.
	// 메서드 이름이 같아도 매개변수로 인해 다르게 처리한다.
	// 하나의 클래스에 동일한 기능을 제공하는 메서드가 매개변수에 의해 여러개 선언해야될 경우 메서드 명을 같게 선언하는 방법이다.
	// => 매개변수의 자료형 또는 갯수가 같지 않도록 선언 해야 한다.
	// => 접근지정자 와 반환형은 오버로드와 무관하다.
	//*************메서드 오버로드*****************
	public void display(int param) {
		System.out.println("정수값 = " + param);
	}
	
	public void display(boolean param) {
		System.out.println("불리언 값 = " + param);
	}
	
	public void display(String param) {
		System.out.println("문자열 값 = " + param);
		
	}
	
}
