package starcraft;

public class Marine extends Unit {

	@Override
	public void move(int x, int y) {
		System.out.println("������ ��ġ:" + x + "," + y +"�� �̵���");
	}
	
	public void stimpack() {
		System.out.println("���� ��� ! ������ ����");
	}
}
