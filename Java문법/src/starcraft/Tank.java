package starcraft;

public class Tank extends Unit {
	
	public Tank() {}

	
	@Override
	public void move(int x, int y) {
		System.out.println("��ũ�� ��ġ: " + x +"," + y + " �� �̵���");
	}
	// Tank�� ���� �޼���
	public void sizeMode() {
		System.out.println("���� ��� : ������ ����");
	}
	
}
