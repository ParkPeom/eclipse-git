package OOP_10_28;

// �ڵ��� ���� (�����ڸ�,�𵨸�) �� �����ϱ� ���� Ŭ����
// �θ� Ŭ������ ���� ��� �⺻������ Object Ŭ������ ��ӹ޴´�. 
// => Java Ŭ������ �ݵ�� Object Ŭ������ ��� - ������ �θ� Ŭ������ 
// Object : ��� Java Ŭ������ �ּ��� Ŭ������  
// => Object Ŭ������ ���������� �����ϸ� ��� JavaŬ������ ������ �ν��Ͻ��� ���� ���� 

// Object�� �ʹ� ���� �ڼ��� ����.... �׷��� ���߿� ���׸����� ������ ��...
// ex) equals(Object object) <- ��� Ÿ�Ե� object�� �������ִ�.
//    �ʵ尪�� ���ϱ⵵ �Ѵ�. 


public class Car  /* extends Object */ {
	private String userName;
	private String modelName;
	
	public Car() {

	}

	public Car(String userName, String modelName) {
		super();
		this.userName = userName;
		this.modelName = modelName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	// �ν��Ͻ��� �ʵ尪�� ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼��� 
	// => �ν��Ͻ��� �ʵ尪�� Ȯ���ϱ� ���� �������� �������̵� ���� 
	@Override
	public String toString() {
		return "������ : " + userName + ", �𵨸� : " + modelName;
	}
}
