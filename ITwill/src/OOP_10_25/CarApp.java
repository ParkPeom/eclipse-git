package OOP_10_25;

import java.util.ArrayList;

// Car 클래스를 사용하여 작성된 프로그램 
public class CarApp { 
	
	public static void main(String[] args) {
		// Car 클래스를 인스턴스로 생성하여 참조변수에 저장 
		// 인스턴스를 생성하면 인스턴스 필드에는 기본값이 자동 저장된다.
		
		// 문제점)인스턴스로 필드에 직접적인 접근을 허용할 경우
		// 비정상적인 값이 필드에 저장 가능
		// => 필드에 비정상적인 값이 저장될 경우 비정상적인 결과가 발생 할 수 있다.
		// 해결법 ) 인스턴스로 필드에 직접적인 접근을 허용하지 않도록 필드를 은닉화(캡슐화) 처리한다.
		// => 은닉화 선언된 필드에 인스턴스로 직접 접근할 경우 
		// => Getter 메서드와 Setter 메서드를 호출하여 필드에 간접적으로 접근하여 관리 
		
			Car c1 =  new Car();
			ArrayList<Car> arr = new ArrayList<Car>();
	
			// 인스턴스의 필드값 변경 
			c1.setAliasName("페라리");
			c1.setEngineStatus(false);
			c1.setCurrentSpeed(0);
			c1.startEngine();
			c1.upSpeed(100);
			c1.downSpeed(60);
			c1.downSpeed(20);
			c1.downSpeed(10);
			c1.stopSpeed();
			c1.endEngine();
			
			arr.add(c1);
			c1 = null;
			System.out.println("=================================================");
			
			c1 = new Car();
			c1.setAliasName("람보르기니");
			c1.setEngineStatus(false);
			c1.setCurrentSpeed(0);
			c1.startEngine();
			c1.upSpeed(80); // 기본값 0 에 80이 추가된것을 알수 있다. 
			c1.upSpeed(20);
			c1.upSpeed(30);
			c1.downSpeed(50);
			c1.endEngine(); // 중간에 시동을 끄는 행위를 함 
			c1.downSpeed(10);
			c1.downSpeed(10);
			c1.stopSpeed();
			c1.endEngine();

			arr.add(c1);
			c1 = null;
				
			System.out.println("===============================================");
			for(Car c : arr) {
				System.out.println("가지고 있는 차는 " + c.getAliasName());
			}	
			// 참조변수를 이용하여 참조변수에 저장된 인스턴스(객체)의 요소에 접근하여 사용
			// => . 연산자를 이용하여 인스턴스(객체)의 요소(필드 또는 메서드) 접근
		}		
	}
