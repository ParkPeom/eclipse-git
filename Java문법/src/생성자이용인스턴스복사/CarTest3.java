package 생성자이용인스턴스복사;

public class CarTest3 {
	
	public static void main(String[] args) {
		Car3 carOne = new Car3();
		// 생성자를 이용한 인스턴스값 복사 
		Car3 carTwo = new Car3(carOne);
		System.out.println(carOne);
		System.out.println(carTwo);

	}
}
class Car3 {
	String color;
	String gearType;
	int door;
	
	Car3() {
		this("white","auto",4);
	}
	
	// 생성자를 이용한 인스턴스값 복사 
	Car3(Car3 car3) {
		this.color = car3.color;
		this.gearType = car3.gearType;
		this.door = car3.door;
	}
	
	Car3(String color) {
		this.color = color;
	}
	
	Car3(String color,String gearType,int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGearType() {
		return gearType;
	}

	public void setGearType(String gearType) {
		this.gearType = gearType;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	@Override
	public String toString() {
		return "Car3 [color=" + color + ", gearType=" + gearType + ", door=" + door + "]";
	}
}