package OOP_10_27_����;

public class CarApp {
	
	public static void main(String[] args) {
		CarEngine engine = new CarEngine();
		Car carOne = new Car();
	
		carOne.carDisplay(); // �⺻���� ��µ�
		carOne.setModelName("���");
		carOne.setProductionYear(2018);

		engine.setFualType("����");
		engine.setDisplacement(2000);
		
		// �ڵ����� ���� ���� - Setter �޼��带 ȣ���Ͽ� ���� ���� ����
		// ���� ���踦 �����ǰ� ����� �Ѵ�.
		carOne.setCarEngine(engine);
		carOne.carDisplay();
		
		System.out.println("====================================");
		// �����ڸ� �̿���
		// �ڵ��� ���� - ������ ���� - �����ڸ� ȣ���Ͽ� ���� ���� ���� 
		Car carTwo = new Car("��Ÿ��",2021,new CarEngine("�ֹ���",3000));
		carTwo.carDisplay();
		
		System.out.println("====================================");
	
		System.out.println(carOne.getModelName() +"�� ���� ���� >> ");
		engine.engineDisplay();
		
		System.out.println("====================================");
		System.out.println(carTwo.getModelName() +"�� ���� ���� >> ");
		carTwo.getCarEngine().engineDisplay();
		// ��Ÿ���.. ���������� �������� �ʾƼ�.. 
		// return carEngine;  + carEngine.engineDisplay(); �� ȣ���Ŵ
	}
}
