package car_Ingeritance;

public class SportsCar extends Car {
	
	public SportsCar() {
		super.setSpeed(0);
		super.setColor("black");
	}
	
	public SportsCar(String Color) {
		 super.setSpeed(0);
		 super.setColor(Color);
	}
	
	// 15�� �ö�
	public void accelPedal() {
		 super.setSpeed(super.getSpeed() + 15);
		 System.out.println("�ӵ��� ������ �ö󰩴ϴ�.");
	}
	
	// 30�� ������ 
	public void breakPedal() { 
	super.setSpeed(super.getSpeed() - 15);
		if(super.getSpeed() > 0) {
			System.out.println("�ӵ��� ������ �������ϴ�.");			
		} else {
			System.out.println("�ӵ��� ������ϴ�.");
			super.setSpeed(0);
		}
	}
	
	@Override
	public String toString() {
		return  "SportsCar �� ���� �ӵ��� " + getSpeed() + "�Դϴ�. ";
	}

}
