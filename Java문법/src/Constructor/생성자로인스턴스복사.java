package Constructor;

class Car {
	
	String color;
	String gear;
	String door;
	
	Car(Car c) {
		this.color = c.color;
		this.gear = c.gear;
		this.door = c.door;
	}
	
	Car(String color , String gear , String door) {
		this.color = color;
		this.gear = gear;
		this.door = door;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", gear=" + gear + ", door=" + door + "]";
	}
	
}
public class �����ڷ��ν��Ͻ����� {
	
	public static void main(String[] args) {
		
		Car c1 = new Car("������","���","4");
		
		// �����ڸ� �̿��� �ν��Ͻ� ���� 
		Car c2 = new Car(c1);
		System.out.println(c2);
		
		
	}
}
