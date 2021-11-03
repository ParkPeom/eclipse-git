package 싱글톤패턴;

public class CarClass {

    private static CarClass carclass;
	
	private CarClass() {
		
	}
	static {
		carclass = new CarClass();
	}
	// 외부에서 멤버로 선언된 carclass를 가져올수있는 method를 만들면 된다. 
	public static CarClass getInstance() {
		return carclass;
	}
	
	private static boolean isUse = false;
	
	// 차 사용 시작
	public static void drive() {
		isUse = true;
		System.out.println("start driving");
	}
	
	// 차 사용 종료 
	public static void parking() {
		isUse = false;
		System.out.println("parking");
	}
	
	public static boolean isEnableUseCar() {
		return !isUse;
	}
}
