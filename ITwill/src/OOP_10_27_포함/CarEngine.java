package OOP_10_27_����;

// ��������(����Ÿ��,��ⷮ)�� �����ϱ� ���� Ŭ���� 
public class CarEngine { // ALT + SHIFT + R Ŭ������ �̸��� �Ѳ����� �ٲ۴�. 
	
	private String fualType;
	private int displacement;
	
	public CarEngine() {

	}
	
	public CarEngine(String fualType, int displacement) {
		super();
		this.fualType = fualType;
		this.displacement = displacement;
	}
	
	public String getFualType() {
		return fualType;
	}
	
	public void setFualType(String fualType) {
		this.fualType = fualType;
	}
	
	public int getDisplacement() {
		return displacement;
	}
	
	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
	
	// ��� 
	public void engineDisplay() {
		System.out.println("����Ÿ�� = " + fualType);
		System.out.println("��ⷮ = " + displacement);
	}
}
