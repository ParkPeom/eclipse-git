package car_Ingeritance;

public class Truck extends Car{
/*
	�ڽĿ����� getter , setter ���� 
	�θ��� ���� super�� �����ͼ� �ڽİ����� ������ �Ҽ��ִ�.
 
 */
	
	public Truck() {}
	
	public Truck(String Color) {
		 super.setColor(Color);
		 super.setSpeed(0);
	}
	
	// 5�� �ö�
	public void accelPedal() {
		super.setSpeed(super.getSpeed() + 5); 
		System.out.println("�ӵ��� �ö󰩴ϴ�.");
	}
	
	// 10�� ������
	public void breakPedal() { 
		
		System.out.println("�ӵ��� �پ�帳�ϴ�.");
		if(super.getSpeed() > 0) {
			super.setSpeed(super.getSpeed() - 10);			
		} else {
			System.out.println("������ϴ�.");
		}
	
	}
	@Override
	public String toString() {
		return  "Truck �� ���� �ӵ��� " + getSpeed() + "�Դϴ�. ";
	}
}
