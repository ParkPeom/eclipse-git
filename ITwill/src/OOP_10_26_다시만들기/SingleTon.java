package OOP_10_26_�ٽø����;

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
		System.out.println("Singleton Ŭ������ display() �޼��� ȣ��");
	}
}
