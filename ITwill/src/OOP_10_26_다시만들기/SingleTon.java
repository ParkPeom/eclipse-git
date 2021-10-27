package OOP_10_26_다시만들기;

public class SingleTon {

	private static SingleTon love;
	
	private SingleTon() {

	}
	
	static {
		love = new SingleTon();
	}
	
	public static SingleTon getInstance() {

		return love;
	}
	
	public void display() {
		System.out.println("Singleton 클래스의 display() 메서드 호출");
	}
}
