package starcraft;

public class DropShip extends Unit {

	@Override
	public void move(int x, int y) {
		System.out.println("������� ��ġ:" + x + "," + y +"�� �̵���");
	}
	
	//DropShip�� ���� �޼���
	public void load() {
		System.out.println("ž�� ��� : ���� ž��");
	}
	public void unload() {
		System.out.println("ž�� ��� : ���� �ϰ�!");
	}
	
}
