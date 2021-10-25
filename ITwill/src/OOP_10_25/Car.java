package OOP_10_25;

// �ڵ����� ǥ���ϱ� ���� Ŭ����
// �ڵ����� �߻�ȭ�Ͽ� ǥ���� Ŭ����
// => Ŭ������ ������ ���� �ʵ� �Ǵ� �޼��忡 ���� �����ڸ� �����Ͽ� ���� ���� ����
// ���� ������(Access Modifier) : private , package , protected , public 
// => Ŭ����, �ʵ�, ������, �޼��带 �ۼ��� �� �����Ͽ� ���� ������ �����ϴ� Ű����
// private : Ŭ���� ���ο����� ���� �����ϸ� , �ܺο����� ���� �Ұ����ϵ��� �����ϴ� ������
// => �ʵ� ����� ��� : �ν��Ͻ��� �ʵ忡 ���� �����ϴ°� �����Ѵ�. - ����ȭ(Data Hiding)
// public : ��� ��Ű���� Ŭ�������� ���� ���� �ϵ��� �����ϴ� ������
// => �޼��� ����� ��� : �޼��带 ��� Ŭ�������� �����Ͽ� ����� �� �ֵ��� ����
// 

public class Car {
	//�ʵ�(Field) : ǥ�� ��� ���� �Ӽ� ���� - �Ӽ��� ����
	// => Ŭ������ ����� ��� �޼��忡�� �ʵ忡 �����Ͽ� ����� �����ϴ� 
	
	// ����ȭ ó�� 
	// �ʵ� 
	private String aliasName;// �̸�(��Ī) - �ĺ��� 
	private boolean engineStatus;// ��������(�õ�����) - false : Off , true : On
	private int currentSpeed; // ����ӵ�
	
	// �ν��Ͻ� ���� �⺻��
	// int -> 0 boolean -> false String -> null
    
	
	// ������ : ��ü(�ν��Ͻ�)�� �����ϱ� ���� Ư���� �޼���
	// => �����ڸ� �������� ������ �Ű������� ���� �⺻ �����ڰ� �����ϴ� ������ ó��
	
	// �޼���(method) : ǥ�� ��� ���� ���� ���� 
	// => �ʵ尪�� �̿��Ͽ� ǥ�� ��� ���� ������ ������� �ۼ��Ͽ� ����� �������ش�.
	// �ڵ��� �õ��� �Ѵ� ������ ǥ���� �޼���
	
	public void startEngine() {
		this.engineStatus = true;
		System.out.println(this.aliasName +"�� �õ��� �׽��ϴ�.");
	}
	// �ڵ��� �õ��� ���� ������ ǥ���� �޼���
	
	public void endEngine() {
		
		// ������ �ӵ��� 0�̿����� �����ִ�. 
		if(currentSpeed != 0) {
			currentSpeed = 0;
		}
//		this.engineStatus = false;
//		System.out.println(this.aliasName +"�� �õ��� �����ϴ�.");
		
		// Ŭ������ ����� �޼���� ���� ȣ���� �����ϴ�.
		// => �ڵ��� �ߺ��� �ּ�ȭ : ���α׷��� ���꼺 ���� �� ���������� ȿ���� ���� 
		stopSpeed();
	}
	
	// �ڵ��� �ӵ��� �����ϴ� ������ ǥ���� �޼���
	public void upSpeed(int speed) { // ���� �ӵ� 
		// ������ ������������ �����ϰ� �� 
		if(!engineStatus) {
			System.out.println(this.aliasName+"�� �õ��� �����ֽ��ϴ�.");
			return; // return; �޼��� ���� 
		}
		// �Ű������� ���������� ���� ���޵� ��� �ְ� �ӵ�
		if(currentSpeed + speed > 150) { // ����ӵ��� �����ӵ��� ���� �ִ�ӵ� ���� ū ���
			speed = 150 - currentSpeed; // �����ӵ� ����  
		// 80 + 80 
		// 70 = 150 - 80
		}
		this.currentSpeed += speed;
		System.out.println(this.aliasName +"�� �ӵ��� "+ speed +" �����Ǿ����ϴ�. ����ӵ��� " + this.currentSpeed);
	}
	
	// �ڵ��� �ӵ��� �����ϴ� ������ ǥ���� �޼��� 
	public void downSpeed(int speed) {
		if(!engineStatus) {
			System.out.println(this.aliasName+"�� �õ��� �����ֽ��ϴ�.");
			return; // return; �޼��� ���� 
		}
		if(currentSpeed < speed) { // ����ӵ� ���� ���� �ӵ��� ũ�ٸ� ?
			speed = currentSpeed; // ���� �ӵ��� ������� 
		}
		
		this.currentSpeed -= speed;
		System.out.println(this.aliasName +"�� �ӵ��� "+ speed +" ���ҵǾ����ϴ�. ����ӵ��� " + this.currentSpeed);
	}
	
	// �ڵ����� ���ߴ� ������ ǥ���� �޼��� 	
	public void stopSpeed() {
		this.currentSpeed = 0;
		System.out.println(this.aliasName +"�� �ӵ��� ������ϴ�. ����ӵ��� " + this.currentSpeed);
	}
	public Car() {
		super();
	}
	
	// ����ȭ ����� �ʵ带 ���� �ʵ尪�� ��ȯ�ϴ� getter �� �ʵ尪�� �����ϴ� setter �޼��带 ������ �� �ִ�. >> ĸ��ȭ 
	public String getAliasName() {// Getter �޼��� - �޼���� : get�ʵ�� 
		return this.aliasName; // �ʵ尪�� ��ȯ�Ѵ�.
	}
	
	public void setAliasName(String aliasName) { // Setter �޼��� - �޼���� : set�ʵ�� 
		// �Ű������� ���޵Ǿ� ����� ���� ���� ���� ó��
		this.aliasName = aliasName; // �Ű������� ����� ������ �ʵ尪 ����
							   // this�� �� �޼��带 ȣ���� ��ü�� this�� ǥ��(���ǰ�)
							   // �� �Ű������� �ʵ�� �Ȱ��� �� ������
							   // �Ű������� ��� �ʵ尪�� �����ؾ��ϴ��� ��Ȯ�� �˷��ֱ� ���ؼ�
	}
	
//	public void setAliasName(String aliasName) { // Setter �޼��� - �޼���� : set�ʵ�� 
//		aliasName = aliasName; // �Ѵ� �Ű������� �� (���������� �ִ� �Ű������� ��)
//	}
	// Getter & Setter �޼��带 �����ϴ� �޼��带 �����ϴ� ����Ű 
	// [ALT] + [SHIFT] + [S] >> �˾��޴� >> [R] >> [ �ʵ弱�� ] >> Generate 
	// VO Ŭ������ ���鶧 ��û ���� ���δ�. ( ���� ������ Ŭ���� )  

	
	// ����ȭ ����� �ʵ��� �ڷ����� boolean �� ��� Getter �޼��尡 �ƴ� is �޼���� ���� 
	// is�̸��� ���� boolean�� ��ȯ�ϴ� �޼���
	public boolean isEngineStatus() {
		return engineStatus;
	}

	public void setEngineStatus(boolean engineStatus) {
		this.engineStatus = engineStatus;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	
}
