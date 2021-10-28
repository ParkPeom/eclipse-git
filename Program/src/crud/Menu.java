package crud;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Menu {
	
	BufferedReader br;
	private List<Person> list;
	Scanner sc;
	
	public Menu() {
		list = new ArrayList<Person>();
		sc = new Scanner(System.in);
		printMenu();
	}
	
	public void printMenu() {
		System.out.println("---menu---");
		System.out.println("1. 조회");
		System.out.println("2. 저장");
		System.out.println("3. 수정");
		System.out.println("4. 삭제");
		System.out.println("5. 종료");
		System.out.println("----------");
		System.out.println("입력 > ");
		int input = sc.nextInt();
		menuChoose(input);
	}
	
	public boolean menuChoose(int input) {		
	do {
		switch(input) {
		case 1:
			dataRead();
			break;
		case 2:
			dataSave();
			break;
		case 3:
			dataEdit();
			break;
		case 4:
			dataDel();
			break;
		case 5:
			System.out.println("잘가~");
			return false;
		default :
			System.out.println("잘못된 메뉴 선택");
		}
		printMenu();
	return true;
	}while(!(1 <= input && input <= 5));
}	
	private void dataDel()  {
		System.out.print("삭제할 번호 입력 > ");
		int num = sc.nextInt();
		
		if(valid(num)) {
			list.remove(num);			
		} else {
			dataDel();
		}
		System.out.println("--삭제 완료--");
	}
	private void dataEdit() {
		System.out.print("선택할 번호 입력 > ");
		int num = sc.nextInt();
		list.get(num).setName(sc.nextLine());
		System.out.print("나이 입력 > ");
	}
	
	private void dataSave() {
		Person p = new Person();
		sc.nextLine();
		System.out.print("이름 입력 > ");
		p.setName(sc.nextLine());
		System.out.print("나이 입력 > ");
		p.setAge(sc.nextLine());
		p.setNum(list.size());
		list.add(p);
		list.sort(Comparator.comparing(Person::getNum));	
	}
	private void dataRead() {
		System.out.println("조회 시작");
		for(Person p : list) {
			System.out.println(p.toString());
		}
		System.out.println("조회 끝");
	}
	
	private boolean valid(int num) {
		// 배열범위
		if(list.size() <= num) {
			System.out.println("없는 번호 입니다.");
			return false;
		}
	return true;	
	}
	
	public static void main(String[] args) {
		new Menu();
	}
}
