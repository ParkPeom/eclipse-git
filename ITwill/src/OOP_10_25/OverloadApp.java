package OOP_10_25;

public class OverloadApp {
	
	public static void main(String[] args) {
		
		Overload overload = new Overload();
		overload.displayInt(100);
		// 메서드 호출시 매개변수에 비정상적인 값이 전달될 경우 에러 발생 
		// overload.displayInt(false);
		overload.displayBoolean(false);
		overload.displayString("홍길동");
		
		System.out.println("========================================================");
		// 오버로드 선언된 메서드는 매개변수에 전달되는 값에 의해 메서드를 선택 호출
		// => 메서드 오버로딩에 의한 다형성 
		// 다형성 : 인스턴스가 다르면 똑같은 메서드를 호출해도 결과가 다르게 제공한다.
		// 다형성(polymorphism) : 여기서의 다형성은 같은이름의 메서드를 호출해도 상태에 따라 메서드가 선택호출되는 기능이다. 
		// => 다형성은 메서드 오버로드 , 메서드 오버라이 에 의해서 만들어 질수 있다.
		// 오버로드 = 값에 의해서 선택 호출 , 상속을 배운후 오버라이드에 의한 다형성을 배울것이다. 
		overload.display(200);
		overload.display(true);
		overload.display("임꺽정");
		// 전달받은 값에 대한 자료형의 매개변수가 없는 경우 에러 발생 
		System.out.println("========================================================");
	}
}
