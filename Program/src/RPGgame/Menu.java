package RPGgame;

import java.util.Scanner;

public class Menu {
	
	Scanner sc = new Scanner(System.in);
	
	public void showMenu() {
		
		do {
			System.out.println("1. ĳ���� ����");
			System.out.println("2. ���� ���");
			System.out.println("3. ���� ����");
			
			String choices = sc.nextLine();
			int choice = Integer.parseInt(choices);
			
			switch(choice) {
				
			case 1:
				// 1.ĳ���� ����
				break;
			case 2:
				// 2.���ӹ��
				break;
			case 3:
				// 3.��������
				break;
			default:
				// �׿� �Է� �̸� �ٽ� �Է�
			}
			
		}while(true);
		
		
	}
	
	
}
