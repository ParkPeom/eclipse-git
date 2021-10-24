package car_Ingeritance;

/*
 객체지향의 상속성을 이용해 Car , SportCar , Truck
 세 가지 클래스를 만들고 악셀,브레이크 메서드를 구현
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

	// 악셀 10씩 오름 
	public void accelPedal() {
		this.speed += 10;	
		System.out.println("속도가 올라갑니다.");
	}
	
	// 브레이크 
	public void breakPedal() {
		this.speed -= 10;
		if(this.speed > 0) {
			System.out.println("속도가 줄어듭니다.");			
		} else {
			System.out.println("멈췄습니다.");
			this.speed = 0;
		}
	}
	@Override
	public String toString() {
		return  getSpeed() + "입니다. ";
	}
}
