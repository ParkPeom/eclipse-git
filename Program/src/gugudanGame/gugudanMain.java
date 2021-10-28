package gugudanGame;

import java.util.Scanner;

/*
	�������� �������� ���� ����ڰ� ���ߴ� ����
	2 x 4 >>
	
	5 x 7 >> 
	���� ������ ���ھ�� 10���� �ö󰡸� Ʋ���� -10�� �� ���δ�.
	���ھ� 100�� ä������ ������ ����ȴ�.	
*/
public class gugudanMain {
	Scanner sc;

	public gugudanMain() {
		sc = new Scanner(System.in);
		showMenu();
	}
	
	public void showMenu() {
		System.out.println("������ �����Ͻðڽ��ϱ�?, yes/no");
		String answer = sc.nextLine();
		if(answer.equals("yes")) {
			Quiz();
		} else if(answer.equals("no")) {
			System.exit(0);
		}
	}
	public void Quiz() {
		int dan = 2; 
		int su = 1;
		int answer = 0;  // ���
		int score = 0; 	 // ����
		int correct = 0; // ����
		String moonje = ""; // ����

		
	// ���� ���� ���� 
	exit : while(true) {
			dan = (int)(Math.random()*9)+2; 
			su =  (int)(Math.random()*9)+1; 
		  for(int i = 2; i <= 9; i++) {
			 for(int j = 1; j <= 9; j++) {
				 if(dan == i) 
					 if(su == j) {
						 moonje = i + " X " + j;
						 correct = i * j;
						 break;
	     			 }
			 	}
			}
			if(score == 100) {
				break exit;
			}

	// ���� ���� ���ߴ� ���� 	
			System.out.print(moonje + " > ");
			answer = sc.nextInt();
			if(answer == correct) {
				score = score + 10;
				System.out.println("���� ������ " + score);
			} else if(score == 100) {
				System.out.println("���� ���ھ�� 100�� �Դϴ�.");
				System.out.println("������ ���� �մϴ�.");
			} else {
				score = score - 10;
				System.out.println("���� ������ " + score);
			}
		}
	}	
	public static void main(String[] args) {
		new gugudanMain();		
	}
}
