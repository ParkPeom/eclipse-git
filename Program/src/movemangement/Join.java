package movemangement;

import java.util.Scanner;

/*
	영화관 사이트 회원가입
	<< cinema Join >>
	1. 로그인
	2. 회원 가입
	3. 종료하기  
	
	========회원가입========
	Z. 돌아가기
	아이디입력
	비밀번호 입력
	이름 입력
	나이 입력
	가입완료!
*/
public class Join {
	Scanner sc;
	int choice;
	String[] id; 	// 아이디
	String[] pwd; 	// 비밀번호
	String[] name;	// 이름
	int[] age;   // 나이
	ReserVationMain reser; // 메인 
	// 생성자 초기화
	public Join() {
		reser = new ReserVationMain();
		sc = new Scanner(System.in);
		id = new String[10];
		pwd = new String[10];
		name = new String[10];
		age = new int[10];
		showMenu();
	}
	// 라인 
	public void line() {
		System.out.println("=================");
	}
	
	// 로그인 정보
	public void loginInfo() {
		for(int i = 0; i < id.length; i++) {
			if(id[i] != null) {
				System.out.println(id[i] + pwd[i] + name[i] + age[i]);
			}
		}
	}
	
	// 로그인 페이지
	public void login() {
		line();
		for(int i = 0; i < id.length; i++) {
			sc.nextLine();
			System.out.print("아이디 > ");
			String idCheck = sc.nextLine();
			if(idCheck.equals(id[i])) {
				System.out.print("비밀번호 입력 > ");
					String pwdCheck = sc.nextLine();
				if(pwdCheck.equals(pwd[i])) {
					System.out.println("접속되셨습니다.");
					// 아이디 넘겨줌 
					longAfterMenu(id[i]);
					break;
				} else {
					System.out.println("비밀번호가 틀립니다.");
					break;
				}
			} else {
				System.out.println("아이디가 존재하지 않습니다.");
				break;
			}
		}
	}
	// 가입 페이지
	public void join() {
		line();
		for(int i = 0; i < id.length; i++) {
			line();
			sc.nextLine();
			System.out.print("<회원 가입 페이지 입니다.>\n");
			System.out.print("사용하실 아이디를 입력하시오 > ");
			id[i] = sc.nextLine();		
			System.out.print("사용하실 비밀번호를 입력하시오 > ");
			pwd[i] = sc.nextLine();
			System.out.print("이름을 입력해주세요. > ");
			name[i] = sc.next();
			String name = sc.nextLine();
			System.out.print("나이를 입력해주십시오 > ");
			age[i] = sc.nextInt();
			break;
		}
	}
	// 프로그램 종료하기
	public void exit() {
		System.exit(0);
	}
	// 초기메뉴 
	public void showMenu() {
		line();
		do {
		System.out.println("<< Cinema Join >>");
		System.out.println("1. 로그인");
		System.out.println("2. 회원 가입");
		System.out.println("3. 되돌아가기");
		choice = sc.nextInt();
		choiceMenu(choice);
		line();
		} while(!( 1 > choice && choice > 3));
	}	
	
	// 선택 메뉴
	public void choiceMenu(int choice) {
		line();
		switch(choice) {
		case 1:
			// 로그인 
			login();
			break;
		case 2:
			// 회원가입
			join();
			break;
		case 3:
			// 되돌아가기
			reser.showMenu(); 
			}
		}
	
	// 로그인 후 콘솔 
	public void longAfterMenu(String id) {
		line();
		System.out.println("<< Cinema Hello >>");
		System.out.println("1. 로그인 정보");
		System.out.println("2. 로그 아웃");
		System.out.println("3. 회원 탈퇴");
		int choice = sc.nextInt();
		choiceloginMenu(choice);
		
	}
	
	// 로그아웃
	public void loginOut() {
		
		line();
	}
	
	// 회원탈퇴 로그인다시 입력 
	public void joinCancel() {
		line();
		for(int i = 0; i < id.length; i++) {
			// 로그인 아이디 , 패스워드 다시 확인
			sc.nextLine();
			System.out.print("아이디 > ");
			String idCheck = sc.nextLine();
			if(idCheck.equals(id[i])) {
				System.out.print("비밀번호 입력 > ");
					String pwdCheck = sc.nextLine();
				if(pwdCheck.equals(pwd[i])) {
					System.out.println("접속되셨습니다.");
					
					// 회원탈퇴 진행 
					Confirmation(id);
					break;
				} else {
					System.out.println("비밀번호가 틀립니다.");
					break;
				}
			} else {
				System.out.println("아이디가 존재하지 않습니다.");
				break;
			}
		}
	}
	
	// 회원탈퇴 확정 페이지 
	public void Confirmation(String[] id) {
		for(int i = 0; i < id.length; i++) {
			if(id[i] != null) {
				id[i] = null; // 회원 탈퇴 진행 완료
			}
		}
	}
	
	// 로그인 후 메뉴 
	public void choiceloginMenu(int choice) {
		line();
		switch(choice) {
		case 1:
			loginInfo();
			break;
		case 2:
			loginOut();
			// 로그아웃
			break;
		case 3:
			joinCancel();
			// 회원탈퇴
			break;
		}
	}
}
