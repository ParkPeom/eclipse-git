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
public class 생성자로인스턴스복사 {
	
	public static void main(String[] args) {
		
		Car c1 = new Car("빨간색","기어","4");
		
		// 생성자를 이용한 인스턴스 복사 
		Car c2 = new Car(c1);
		System.out.println(c2);
		
		
	}
}
