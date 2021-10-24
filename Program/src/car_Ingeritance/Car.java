package car_Ingeritance;

/*
 ��ü������ ��Ӽ��� �̿��� Car , SportCar , Truck
 �� ���� Ŭ������ ����� �Ǽ�,�극��ũ �޼��带 ����
*/
public class Car {
	private String color;
	private int  speed;
	
	public Car() {}
	
	public Car(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// �Ǽ� 10�� ���� 
	public void accelPedal() {
		this.speed += 10;	
		System.out.println("�ӵ��� �ö󰩴ϴ�.");
	}
	
	// �극��ũ 
	public void breakPedal() {
		this.speed -= 10;
		if(this.speed > 0) {
			System.out.println("�ӵ��� �پ��ϴ�.");			
		} else {
			System.out.println("������ϴ�.");
			this.speed = 0;
		}
	}
	@Override
	public String toString() {
		return  getSpeed() + "�Դϴ�. ";
	}
}
