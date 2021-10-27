package OOP_10_26_�ٽø����;

public class SingleTon {

	private static SingleTon _instance;
	
	private SingleTon() {
		
	}
	
	// ������Ÿ�� Ŭ���� (�޸𸮸� �����Ѵ�)
	static {
		_instance = new SingleTon();
	}
	
	public SingleTon getInstance() {
		return _instance; // this 
	}
	
}

