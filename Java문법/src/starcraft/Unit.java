package starcraft;

// �߻� Ŭ���� - Unit
public abstract class Unit {
	
	// �ʵ�
	int x;
	int y;
	String str;
	
	// �߻� �޼��� - move
	public abstract void move(int x, int y);
	
	public void stop(String str, int x, int y) {
		
		this.str = str;
		this.x = x;
		this.y = y;
		System.out.println("������ġ: "+ this.x + "," + this.y +"," + "��"
		+ this.str + "��/�� ����ϴ�.");	
	}
	
	
	
}
