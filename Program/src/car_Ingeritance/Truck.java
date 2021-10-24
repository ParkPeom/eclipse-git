package car_Ingeritance;

public class Truck extends Car{
/*
	자식에서는 getter , setter 으로 
	부모의 것을 super로 가져와서 자식것으로 재정의 할수있다.
 
 */
	
	public Truck() {}
	
	public Truck(String Color) {
		 super.setColor(Color);
		 super.setSpeed(0);
	}
	
	// 5씩 올라감
	public void accelPedal() {
		super.setSpeed(super.getSpeed() + 5); 
		System.out.println("속도가 올라갑니다.");
	}
	
	// 10씩 내려감
	public void breakPedal() { 
		
		System.out.println("속도가 줄어드립니다.");
		if(super.getSpeed() > 0) {
			super.setSpeed(super.getSpeed() - 10);			
		} else {
			System.out.println("멈췄습니다.");
		}
	
	}
	@Override
	public String toString() {
		return  "Truck 의 현재 속도는 " + getSpeed() + "입니다. ";
	}
}
