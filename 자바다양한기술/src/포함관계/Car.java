package ���԰���;

public class Car {
	
	private String modelName;
	private String productYear;
	
	private Engine engine;
	
	
	public Car() {
//		engine = new Engine();
	}

	public Car(String modelName, String productYear, Engine engine) {
		super();
		this.modelName = modelName;
		this.productYear = productYear;
		this.engine = engine;
	}

	
	
	
	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getProductYear() {
		return productYear;
	}

	public void setProductYear(String productYear) {
		this.productYear = productYear;
	}

	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void display() {
		System.out.println("�� �̸� : " + modelName);
		System.out.println("�� ��� : " + productYear);
		engine.engineDisplay();
	}
}
