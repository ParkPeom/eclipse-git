package starcraft;

public class Marine extends Unit {

	@Override
	public void move(int x, int y) {
		System.out.println("마린의 위치:" + x + "," + y +"로 이동함");
	}
	
	public void stimpack() {
		System.out.println("공격 모드 ! 스팀팩 장전");
	}
}
