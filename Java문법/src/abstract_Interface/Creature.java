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
	
	// 생명체라면 나이를 먹고 x좌표상으로 이동 할 수 있는 부분이 공통 적인 기능 이기 때문에
	// 하위 클래스에서 상속 할수 있도록 일반 메서드로 구현
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
	
	// 추상메서드로는 공격하는 기능과 정보를 출력하는 기능을 선언했습니다.
	// 모든 생명체에 필요한 기능이지만 각각 생명체에 따라 다른 기능으로 구현을 해야 하기때문에
	// 위 두 메서드는 추상메서드로 선언하여 하위클래스에서 처리 하도록 한 것이다.
	public abstract void attack();
	public abstract void printInfo();

	@Override
	public String toString() {
		return " x=" + x + ", y=" + y + ", age=" + age;
	}
}
