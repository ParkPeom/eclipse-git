package OOP_10_27_����;

// �ڵ��� ����(�𵨸�,����⵵,����)�� �����ϱ� ���� Ŭ����

public class Car {

	private String ModelName;
	private int productionYear;
	
	// ����(��������)���� - directAssociation
	private CarEngine carEngine; // ���� ������ �����ϱ� ���� �����ʵ�
							  // ���� �ν��Ͻ��� ������ 
	
	// => ���԰��谡 �����Ǳ� ���ؼ��� ������ �Ǵ� Setter �޼��带 �̿��Ͽ� �ʵ忡 �ν��Ͻ� ����
	public Car() {
		carEngine = new CarEngine();
	
	}
	public Car(String modelName, int productionYear, CarEngine carEngine) {
		super();
		ModelName = modelName;
		this.productionYear = productionYear;
		this.carEngine = carEngine;
	}
	public String getModelName() {
		return ModelName;
	}
	public void setModelName(String modelName) {
		ModelName = modelName;
	}
	public int getProductionYear() {
		return productionYear;
	}
	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}
	
	//-------------------�� ��----------------------
	public CarEngine getCarEngine() {
		return carEngine;
	}
	public void setCarEngine(CarEngine carEngine) {
		this.carEngine = carEngine;
	}

	// Car Ŭ�������� Engine Ŭ������ ���������� ���� getter/setter�� �����ͼ� �����ִ�.
	// => �����ʵ忡 �ν��Ͻ��� ����Ǿ����� ���� ���¿��� �޼��带 ȣ���� ��� NullPointerException �� �߻��Ѵ�.
	// NullPointerException : ���������� Null�� ����� ���¿��� �޼��带 ȣ���� ��� �߻��Ǵ� ���ܴ�.
	public void carDisplay() {
		System.out.println("�𵨸� = " + ModelName );
		System.out.println("����⵵ = " + productionYear );
		System.out.println("���� Ÿ�� = " + 
						carEngine.getDisplacement() +"\n"
				+ "��ⷮ = " +  carEngine.getFualType());
	}
	
}
