package oop;

// 실행이 목적인 클래스 - 어플리케이션(Application)
// => 데스크탑 어플리케이션은 반드시 main 메서드 선언
public class MethodApp {

	public static void main(String[] args) {
		// 클래스로(자료형)로 인스턴스(Instance - 객체)를 생성하여 참조변수에 저장
		// 형식) 클래스명 참조변수=new 클래스()
		// => 같은 패키지에 클래스는 패키지 표현 없이 클래스명을 이용하여 표현이 가능하다.
		// new 클래스명() : new 연산자로 클래스의 생성자(Constructor) 를 호출 하여 인스턴스를 생성할수 있다
		// => 클래스명 참조변수 : 클래스로 생성된 인스턴스에 해쉬코드를 저장하기 위한 참조 변수 
		// => 참조변수를 이용하여 저장된 인스턴스의 필드 또는 메서드에 접근하여 사용 할수 있다.
		
		Method method = new Method();
		System.out.println("method  = " + method);
		System.out.println("===========================================");
			
		// 메서드 호출 - 형식 인스턴스.메서드명(값,값,값); 
		// => 참조변수에 저장된 인스턴스(객체)의 메서드 호출
		// => 메서드는 메서드명과 매개변수에 전달된 값에 의해 호출된다.
		// => 매개변수에 값이 정상적으로 전달되지 않은 경우 메서드 호출 불가능 - 에러 발생
		// 메서드를 호출하면 스레드(프로그램 흐름)가 해당 메서드로 이동하여 메서드의 명령을 실행하고
		// 메서드가 종료되면 다시 되돌아와서 메서드 호출 하단의 명령을 계속 실행 한다.
		
		// 메서드는 기능이 필요할떄 마다 쓰인다.
		method.displayOne();
		method.displayTwo();
		
		method.printOne();
		method.printOne();
		method.printOne();
		
		// 메서드의 매개변수에 필요한 값을 전달하여 메서드 호출
		method.printTwo(100);
		method.printTwo(80);
		
		method.printTwo(-30);
		System.out.println("===========================================");
		method.printThree(38, 80);
		method.printThree(64, 61);
		
		// 메서드를 호출하여 반환되는 값은 변수에 저장 시킨다. 
		// => 메서드 반환값을 지속적으로 사용하고자 할 경우 변수에 저장 
		
		int total = method.returnTot(35, 79);
		// 입력과 출력 명령은 프로그램에서 작성 - 메서드 에서는 입력과 출력 명령을 작성하지 않는다.
		System.out.println("합계 (메서드 호출 결과) = " + total);
		
		// 반환값을 일시적으로 사용할 경우 변수에 미저장 
		System.out.println("합계 = " + method.returnTot(40, 80));
		System.out.println("=============================");
	}
}
