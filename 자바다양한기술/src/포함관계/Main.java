package ���԰���;

public class Main {
	
	public static void main(String[] args) {
		
		Engine engine = new Engine(null, null); // ���ʿ���°� �ʱ�ȭ�ι���
		engine.setGearType("����");
		engine.setDisplacement("2000");

		Car car1 = new Car("�Ÿ", "2021",engine);
		Car car2 = new Car("����","2022",new Engine("�ֹ���","3000"));
		
		car1.display();
		
		// �̱����� ����ؼ� ȣ�� 
		Engine engine3  = Engine.getInstance();
		engine3.setDisplacement("�ֹ���");
		engine3.setGearType("3000");
		engine3.engineDisplay();
		
	}
}
