package 포함관계;

public class Main {
	
	public static void main(String[] args) {
		
		Engine engine = new Engine(null, null); // 쓸필요없는건 초기화로받음
		engine.setGearType("경유");
		engine.setDisplacement("2000");

		Car car1 = new Car("쏘나타", "2021",engine);
		Car car2 = new Car("벤츠","2022",new Engine("휘발유","3000"));
		
		car1.display();
		
		// 싱글톤을 사용해서 호출 
		Engine engine3  = Engine.getInstance();
		engine3.setDisplacement("휘발유");
		engine3.setGearType("3000");
		engine3.engineDisplay();
		
	}
}
