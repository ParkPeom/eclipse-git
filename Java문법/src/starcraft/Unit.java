package starcraft;

// 추상 클래스 - Unit
public abstract class Unit {
	
	// 필드
	int x;
	int y;
	String str;
	
	// 추상 메서드 - move
	public abstract void move(int x, int y);
	
	public void stop(String str, int x, int y) {
		
		this.str = str;
		this.x = x;
		this.y = y;
		System.out.println("현재위치: "+ this.x + "," + this.y +"," + "예"
		+ this.str + "가/이 멈춥니다.");	
	}
	
	
	
}
