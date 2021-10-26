package starcraft;

public class UnitEx {
	
	public static void main(String[] args) {
		
		// Unit unit = new Unit(); // 예외 발생 이유
		// Unit은 추상클래스이기 때문에 인스턴스를 생성할 수 없어서 예외가 발생합니다.

		System.out.println("---------------------------------");
		Tank tank = new Tank();
		tank.move(300, 	500);
		
		tank.sizeMode();
		tank.stop("탱크", 500, 600);
		
		System.out.println("----------------------");
		
		Marine marine = new Marine();
		marine.move(200, 500);
		marine.stimpack();
		
		DropShip dropship = new DropShip();
		dropship.move(300, 300);
		dropship.load();
		dropship.unload();
	}
}
