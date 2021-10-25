package abstract_Interface;

public abstract class Creature {
	private int x;
	private int y;
	private int age;
	
	public Creature(int x, int y, int age) {
		super();
		this.x = x;
		this.y = y;
		this.age = age;
	}
	
	public void age() {
		age++;
	}
	
	// ����ü��� ���̸� �԰� x��ǥ������ �̵� �� �� �ִ� �κ��� ���� ���� ��� �̱� ������
	// ���� Ŭ�������� ��� �Ҽ� �ֵ��� �Ϲ� �޼���� ����
	public void move(int xDistance) {
		x += xDistance;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	// �߻�޼���δ� �����ϴ� ��ɰ� ������ ����ϴ� ����� �����߽��ϴ�.
	// ��� ����ü�� �ʿ��� ��������� ���� ����ü�� ���� �ٸ� ������� ������ �ؾ� �ϱ⶧����
	// �� �� �޼���� �߻�޼���� �����Ͽ� ����Ŭ�������� ó�� �ϵ��� �� ���̴�.
	public abstract void attack();
	public abstract void printInfo();

	@Override
	public String toString() {
		return " x=" + x + ", y=" + y + ", age=" + age;
	}
}
