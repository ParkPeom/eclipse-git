package car_Ingeritance;


// ���� Ŭ����

/*
 �Ϲ� ī -
 �ӵ��� �ö󰩴ϴ�
 �ӵ��� �ö󰩴ϴ�
 ���� �ӵ��� 20�Դϴ�.
 �ӵ��� �پ��ϴ�.
 ���� �ӵ��� 10�Դϴ�.
 ������ϴ�.
 
 sportsCar -
 Truck -
 */

public class MTest {
	
	public void print() {
		System.out.println("===============");
	}
	
	public static void main(String[] args) {
		MTest m = new MTest();
		
		Car car1 = new Car();
		car1.accelPedal();
		car1.accelPedal();
		System.out.println(car1);
		car1.breakPedal();
		System.out.println(car1);
		car1.breakPedal();
		m.print();
		
		SportsCar car2 = new SportsCar("������");
		car2.accelPedal();
		car2.accelPedal();
		System.out.println(car2);
		car2.breakPedal();
		car2.breakPedal();
		m.print();
		
		Truck car3 = new Truck("�ٶ��̻�");
		car3.accelPedal();
		car3.accelPedal();
		System.out.println(car3);
		car3.breakPedal();
		car3.breakPedal();
		
	}
}
