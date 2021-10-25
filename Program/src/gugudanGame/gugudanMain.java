package gugudanGame;

import java.util.Scanner;

/*
	구구단이 랜덤으로 나와 사용자가 맞추는 게임
	2 x 4 >>
	
	5 x 7 >> 
	맞출 때마다 스코어는 10점씩 올라가며 틀리면 -10점 씩 깎인다.
	스코어 100이 채워지면 게임은 종료된다.	
*/
public class gugudanMain {
	Scanner sc;
	public gugudanMain() {
		sc = new Scanner(System.in);
	}
	
	public void showMenu() {
		System.out.println("게임을 시작하시겠습니까?, yes/no");
		Quiz();
	}

	public void Quiz() {
		int dan = 2; 
		int su = 1;
		int answer = 0;  // 대답
		int score = 0; 	 // 점수
		int correct = 0; // 정답
		String moonje = ""; // 문제
	
		// 랜덤 문제 생성 
		
		while(true) {
			dan = (int)(Math.random()*9)+2; 
			su =  (int)(Math.random()*9)+1; 
			for(int i = 2; i <= 9; i++) {
			 for(int j = 1; j <= 9; j++) {
				 if(dan == i) 
					 if(su == j) {
						 correct = i * j;
						 moonje = i + "*" + j;
	     			 }
			 	}
			}
		// 문제 내면 맞추는 행위 	
		
			System.out.print(moonje + " > ");
			answer = sc.nextInt();
			if(answer == correct) {
				score = score + 10;
				System.out.println("현재 점수는 " + score);
			} else if(score == 100) {
				System.out.println("현재 스코어는 100점 입니다.");
				System.out.println("게임을 종료 합니다.");
			} else {
				score = score - 10;
				System.out.println("현재 점수는 " + score);
			}
		}
	}	
	public static void main(String[] args) {
		new gugudanMain();
	}
}
