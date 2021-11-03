package �̱�������;

public class CarClass {

    private static CarClass carclass;
	
	private CarClass() {
		
	}
	static {
		carclass = new CarClass();
	}
	// �ܺο��� ����� ����� carclass�� �����ü��ִ� method�� ����� �ȴ�. 
	public static CarClass getInstance() {
		return carclass;
	}
	
	private static boolean isUse = false;
	
	// �� ��� ����
	public static void drive() {
		isUse = true;
		System.out.println("start driving");
	}
	
	// �� ��� ���� 
	public static void parking() {
		isUse = false;
		System.out.println("parking");
	}
	
	public static boolean isEnableUseCar() {
		return !isUse;
	}
}
