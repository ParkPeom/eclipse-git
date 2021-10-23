package movemangement;

import java.util.ArrayList;
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
	// ���� �÷��������ӿ�ũ ���� �Һ� �迭 -> ���� �迭
	
	Scanner sc;
	int choice;
	String[] id; 	// ���̵�
	String[] pwd; 	// ��й�ȣ
	String[] name;	// �̸�
	int[] age;   	// ����
	String[] jumin; // �ֹι�ȣ
	String[] sex;   // ���� 
	ReserVationMain reser; // ����
	ArrayList arr;  // �÷��� ������ ��� 
	UserVO user; // User
	
	
	// ������ �ʱ�ȭ
	public Join() {
		reser = new ReserVationMain();
		sc = new Scanner(System.in);
		id = new String[10];
		pwd = new String[10];
		name = new String[10];
		age = new int[10];
		jumin = new String[10];
		sex = new String[10];
		user = new UserVO();
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
			
			line();
			do {
			System.out.println("���̵� �ټ����� ~ ������ �����ּ���.");	
			System.out.print("����Ͻ� ���̵� �Է��Ͻÿ� > ");
			id[i] = sc.nextLine();
				if(user.setId(id[i])) {
					user.setId(id[i]); // ���� ����
					break;
				} else {
					System.out.println("�ٽ� �Է����ֽÿ� ");
					continue;
				// ���� ������ ����
			}
		} while(true);
			line();
			do {
				System.out.println("�н����� 10���� �̻� �Է����ּ���.");
				System.out.print("����Ͻ� ��й�ȣ�� �Է��Ͻÿ� > ");
				pwd[i] = sc.nextLine();
				if(user.setPwd(pwd[i])) {
					user.setPwd(pwd[i]);
					break;
				} else {
					System.out.println("�ٽ� �Է����ֿ�");
					continue;
				}
			} while(true);
			
			do {
				System.out.println("�̸� �α��� �̻� ");
				System.out.print("�̸��� �Է����ּ���. > ");
				name[i] = sc.nextLine();
				if(user.setName(name[i])) {
					user.setName(name[i]);
					break;
				} else {
					System.out.println("�ٽ� �Է��� �ֽÿ�");
					continue;
				}
			} while(true);
			
			do {
				System.out.println("���� 1�� ~ 120�� ���� �Է��� �ֽÿ� ");
				System.out.print("���̸� �Է����ֽʽÿ� > ");
				age[i] = sc.nextInt();
					sc.nextLine();
				if(user.setAge(age[i])) {
					user.setAge(age[i]);
					break;
				} else {
					System.out.println("�ٽ� �Է��� �ּ���");
					continue;
				}
			} while(true);
			
			do {
				System.out.println(" �ֹι�ȣ�� �Է����ּ��� ex) 940114-1xxxxxx");
				// �ֹι�ȣ ���� true �̸� ���� 
				jumin[i] = sc.nextLine();
				if(user.setJumin(jumin[i])) {
					user.setJumin(jumin[i]);
						break;
					} else {
						// �����̸� 
					System.out.println("�ٽ� �Է����ּ���.");
					continue;
				}
			} while(true);
		break;
		}
	}
	
	// �α��� �� �ʱ�޴� 
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
			break;
		case 4:
			// ȸ�� ã��
			searchInfo();
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
	
	// �α׾ƿ� (�̿ϼ�)
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
				System.out.println("Ż�� �Ϸ� �Ͽ����ϴ�.");
			}
		}
	}
	
	// ���̵� ��� ���� ã�� (�̿ϼ�)
	public void searchInfo() {
		System.out.println("���� �Է� ");
		System.out.println("�ֹι�ȣ �Է� ");
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
		case 4:
			//���̵� ��� ���� �ٲٱ�

		}
	}
}
