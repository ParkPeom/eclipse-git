package starcraft;

public class UnitEx {
	
	public static void main(String[] args) {
		
		// Unit unit = new Unit(); // ���� �߻� ����
		// Unit�� �߻�Ŭ�����̱� ������ �ν��Ͻ��� ������ �� ��� ���ܰ� �߻��մϴ�.

		System.out.println("---------------------------------");
		Tank tank = new Tank();
		tank.move(300, 	500);
		
		tank.sizeMode();
		tank.stop("��ũ", 500, 600);
		
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
