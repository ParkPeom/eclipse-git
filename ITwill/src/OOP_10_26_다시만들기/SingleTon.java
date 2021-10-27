package OOP_10_26_다시만들기;

public class SingleTon {

	private static SingleTon _instance;
	
	private SingleTon() {
		
	}
	
	// 프로토타입 클래스 (메모리를 절약한다)
	static {
		_instance = new SingleTon();
	}
	
	public SingleTon getInstance() {
		return _instance; // this 
	}
	
}

