package car_Ingeritance;


// 실행 클래스

/*
 일반 카 -
 속도가 올라갑니다
 속도가 올라갑니다
 현재 속도는 20입니다.
 속도가 줄어듭니다.
 현재 속도는 10입니다.
 멈췄습니다.
 
 sportsCar -
 Truck -
 */

public class MTest {
	
	public void print() {
		System.out.println("===============");
	}
	
	public static void main(String[] args) {
		MTest m = new MTest();
		
		Car car1 = new Car();
		car1.accelPedal();
		car1.accelPedal();
		System.out.println(car1);
		car1.breakPedal();
		System.out.println(car1);
		car1.breakPedal();
		m.print();
		
		SportsCar car2 = new SportsCar("빨간색");
		car2.accelPedal();
		car2.accelPedal();
		System.out.println(car2);
		car2.breakPedal();
		car2.breakPedal();
		m.print();
		
		Truck car3 = new Truck("다라이색");
		car3.accelPedal();
		car3.accelPedal();
		System.out.println(car3);
		car3.breakPedal();
		car3.breakPedal();
		
	}
}
