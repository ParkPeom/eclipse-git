package example;

import java.util.Scanner;

public class MenuApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("<<�л� ���� ���α׷� >>");
			// �޴� ��� ���
			System.out.println("1. �л� ���� ����");
			System.out.println("2. �л� ���� ����");
			System.out.println("3. �л� ���� ����");
			System.out.println("4. �л� ���� �˻�");
			System.out.println("5. �л� ���� ����");
			
			// �޴� ���� �Է�
			System.out.print("�޴� ���� [1 ~ 5] >> ");
			int choice = scanner.nextInt();
			
			// ���� �޴��� ���� ��ȿ�� �˻�
			if(choice < 1 || choice > 5) {
				System.out.println("[����] ���õ� �޴��� �������� �ʽ��ϴ�.");
				continue;
			}			
			// ���ø޴��� ���� ��� ����
			if(choice == 5) {
				break;
			}
			switch(choice) { // switch ������ �Ǽ��� �������Ѵ�. 
			case 1: // ������ �ü�����. 
				System.out.println("[���] �л������� ����");
				break; // switch���� ����������. 
			case 2:
				System.out.println("[���] �л������� ����");
				break;
			case 3:
				System.out.println("[���] �л������� ����");
				break;
			case 4:	
				System.out.println("[���] �л������� �˻�");
				break;
			}
			System.out.println();
		}
		System.out.println("[�޼���]�л� ���� ���α׷��� �����մϴ�.");
		scanner.close();
	}

}
