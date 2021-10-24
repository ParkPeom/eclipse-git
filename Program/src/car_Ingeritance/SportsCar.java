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
	
	// 15씩 올라감
	public void accelPedal() {
		 super.setSpeed(super.getSpeed() + 15);
		 System.out.println("속도가 빠르게 올라갑니다.");
	}
	
	// 30씩 내려감 
	public void breakPedal() { 
	super.setSpeed(super.getSpeed() - 15);
		if(super.getSpeed() > 0) {
			System.out.println("속도가 빠르게 내려갑니다.");			
		} else {
			System.out.println("속도가 멈췄습니다.");
			super.setSpeed(0);
		}
	}
	
	@Override
	public String toString() {
		return  "SportsCar 의 현재 속도는 " + getSpeed() + "입니다. ";
	}

}
