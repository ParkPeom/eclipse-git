package RPGgame;

import java.util.Scanner;

public class Menu {
	
	Scanner sc = new Scanner(System.in);
	
	public void showMenu() {
		
		do {
			System.out.println("1. 캐릭터 생성");
			System.out.println("2. 게임 방법");
			System.out.println("3. 게임 종료");
			
			String choices = sc.nextLine();
			int choice = Integer.parseInt(choices);
			
			switch(choice) {
				
			case 1:
				// 1.캐릭터 생성
				break;
			case 2:
				// 2.게임방법
				break;
			case 3:
				// 3.게임종료
				break;
			default:
				// 그외 입력 이면 다시 입력
			}
			
		}while(true);
		
		
	}
	
	
}
