package movemangement;

import java.util.Scanner;

/*
	��ȭ�� ����Ʈ ȸ������
	<< cinema Join >>
	1. �α���
	2. ȸ�� ����
	3. �����ϱ�  
	
	========ȸ������========
	Z. ���ư���
	���̵��Է�
	��й�ȣ �Է�
	�̸� �Է�
	���� �Է�
	���ԿϷ�!
*/
public class Join {
	Scanner sc;
	int choice;
	String[] id; 	// ���̵�
	String[] pwd; 	// ��й�ȣ
	String[] name;	// �̸�
	int[] age;   // ����
	ReserVationMain reser; // ���� 
	// ������ �ʱ�ȭ
	public Join() {
		reser = new ReserVationMain();
		sc = new Scanner(System.in);
		id = new String[10];
		pwd = new String[10];
		name = new String[10];
		age = new int[10];
		showMenu();
	}
	// ���� 
	public void line() {
		System.out.println("=================");
	}
	
	// �α��� ����
	public void loginInfo() {
		for(int i = 0; i < id.length; i++) {
			if(id[i] != null) {
				System.out.println(id[i] + pwd[i] + name[i] + age[i]);
			}
		}
	}
	
	// �α��� ������
	public void login() {
		line();
		for(int i = 0; i < id.length; i++) {
			sc.nextLine();
			System.out.print("���̵� > ");
			String idCheck = sc.nextLine();
			if(idCheck.equals(id[i])) {
				System.out.print("��й�ȣ �Է� > ");
					String pwdCheck = sc.nextLine();
				if(pwdCheck.equals(pwd[i])) {
					System.out.println("���ӵǼ̽��ϴ�.");
					// ���̵� �Ѱ��� 
					longAfterMenu(id[i]);
					break;
				} else {
					System.out.println("��й�ȣ�� Ʋ���ϴ�.");
					break;
				}
			} else {
				System.out.println("���̵� �������� �ʽ��ϴ�.");
				break;
			}
		}
	}
	// ���� ������
	public void join() {
		line();
		for(int i = 0; i < id.length; i++) {
			line();
			sc.nextLine();
			System.out.print("<ȸ�� ���� ������ �Դϴ�.>\n");
			System.out.print("����Ͻ� ���̵� �Է��Ͻÿ� > ");
			id[i] = sc.nextLine();		
			System.out.print("����Ͻ� ��й�ȣ�� �Է��Ͻÿ� > ");
			pwd[i] = sc.nextLine();
			System.out.print("�̸��� �Է����ּ���. > ");
			name[i] = sc.next();
			String name = sc.nextLine();
			System.out.print("���̸� �Է����ֽʽÿ� > ");
			age[i] = sc.nextInt();
			break;
		}
	}
	// ���α׷� �����ϱ�
	public void exit() {
		System.exit(0);
	}
	// �ʱ�޴� 
	public void showMenu() {
		line();
		do {
		System.out.println("<< Cinema Join >>");
		System.out.println("1. �α���");
		System.out.println("2. ȸ�� ����");
		System.out.println("3. �ǵ��ư���");
		choice = sc.nextInt();
		choiceMenu(choice);
		line();
		} while(!( 1 > choice && choice > 3));
	}	
	
	// ���� �޴�
	public void choiceMenu(int choice) {
		line();
		switch(choice) {
		case 1:
			// �α��� 
			login();
			break;
		case 2:
			// ȸ������
			join();
			break;
		case 3:
			// �ǵ��ư���
			reser.showMenu(); 
			}
		}
	
	// �α��� �� �ܼ� 
	public void longAfterMenu(String id) {
		line();
		System.out.println("<< Cinema Hello >>");
		System.out.println("1. �α��� ����");
		System.out.println("2. �α� �ƿ�");
		System.out.println("3. ȸ�� Ż��");
		int choice = sc.nextInt();
		choiceloginMenu(choice);
		
	}
	
	// �α׾ƿ�
	public void loginOut() {
		
		line();
	}
	
	// ȸ��Ż�� �α��δٽ� �Է� 
	public void joinCancel() {
		line();
		for(int i = 0; i < id.length; i++) {
			// �α��� ���̵� , �н����� �ٽ� Ȯ��
			sc.nextLine();
			System.out.print("���̵� > ");
			String idCheck = sc.nextLine();
			if(idCheck.equals(id[i])) {
				System.out.print("��й�ȣ �Է� > ");
					String pwdCheck = sc.nextLine();
				if(pwdCheck.equals(pwd[i])) {
					System.out.println("���ӵǼ̽��ϴ�.");
					
					// ȸ��Ż�� ���� 
					Confirmation(id);
					break;
				} else {
					System.out.println("��й�ȣ�� Ʋ���ϴ�.");
					break;
				}
			} else {
				System.out.println("���̵� �������� �ʽ��ϴ�.");
				break;
			}
		}
	}
	
	// ȸ��Ż�� Ȯ�� ������ 
	public void Confirmation(String[] id) {
		for(int i = 0; i < id.length; i++) {
			if(id[i] != null) {
				id[i] = null; // ȸ�� Ż�� ���� �Ϸ�
			}
		}
	}
	
	// �α��� �� �޴� 
	public void choiceloginMenu(int choice) {
		line();
		switch(choice) {
		case 1:
			loginInfo();
			break;
		case 2:
			loginOut();
			// �α׾ƿ�
			break;
		case 3:
			joinCancel();
			// ȸ��Ż��
			break;
		}
	}
}
