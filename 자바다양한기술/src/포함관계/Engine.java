package Æ÷ÇÔ°ü°è;

public class Engine {

	private String gearType;
	private String displacement;

	// ½Ì±ÛÅæ
	private static Engine engine;
	
	private Engine() {

	}
	
	// ½Ì±ÛÅæ 
	static {
		engine = new Engine();
	}
	
	// ½Ì±ÛÅæ 
	public static Engine getInstance() {
		return engine;
	}
	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}



	public Engine(String gearType, String displacement) {
		super();
		this.gearType = gearType;
		this.displacement = displacement;
	}
	public String getGearType() {
		return gearType;
	}
	public void setGearType(String gearType) {
		this.gearType = gearType;
	}
	public String getDisplacement() {
		return displacement;
	}
	public void setDisplacement(String displacement) {
		this.displacement = displacement;
	}
	
	public void engineDisplay() {
		
		System.out.println("¿£Áø : " + gearType);
		System.out.println("¿£Áø¸ð½À : " + displacement);
	}
}
