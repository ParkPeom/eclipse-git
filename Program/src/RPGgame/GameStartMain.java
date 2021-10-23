package RPGgame;

/*
 	10/24
	유저 LV 10 되면  직업선택 - 전사 , 궁수 , 마법사 
	
	캐릭터 생성 : 아이디,성별  -> 생성 
	
	몬스터 - 초보자 던전,2차 던전,대마왕 던전  
	초보자 - 사과던지기,고속이동 
	전사 - 칼배기,스트라이크, 
	궁수 - 불화살,바람의화살
	마법사 - 폭풍눈물,썬더볼트 
	
	상점 - HP포션,MP포션

*/
public class GameStartMain {

	GameStartMain() {
		Menu m = new Menu();
		m.showMenu();
	}
	static {
		System.out.println("Maple Story 월드에 오신걸 환영 합니다.");
	}
	{ 
		
	}
	
	public static void main(String[] args) {
		// 게임 시작
		new GameStartMain();
	}
}
