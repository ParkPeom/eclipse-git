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
		System.out.println("1. ��ȸ");
		System.out.println("2. ����");
		System.out.println("3. ����");
		System.out.println("4. ����");
		System.out.println("5. ����");
		System.out.println("----------");
		System.out.println("�Է� > ");
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
			System.out.println("�߰�~");
			return false;
		default :
			System.out.println("�߸��� �޴� ����");
		}
		printMenu();
	return true;
	}while(!(1 <= input && input <= 5));
}	
	private void dataDel()  {
		System.out.print("������ ��ȣ �Է� > ");
		int num = sc.nextInt();
		
		if(valid(num)) {
			list.remove(num);			
		} else {
			dataDel();
		}
		System.out.println("--���� �Ϸ�--");
	}
	private void dataEdit() {
		System.out.print("������ ��ȣ �Է� > ");
		int num = sc.nextInt();
		list.get(num).setName(sc.nextLine());
		System.out.print("���� �Է� > ");
	}
	
	private void dataSave() {
		Person p = new Person();
		sc.nextLine();
		System.out.print("�̸� �Է� > ");
		p.setName(sc.nextLine());
		System.out.print("���� �Է� > ");
		p.setAge(sc.nextLine());
		p.setNum(list.size());
		list.add(p);
		list.sort(Comparator.comparing(Person::getNum));	
	}
	private void dataRead() {
		System.out.println("��ȸ ����");
		for(Person p : list) {
			System.out.println(p.toString());
		}
		System.out.println("��ȸ ��");
	}
	
	private boolean valid(int num) {
		// �迭����
		if(list.size() <= num) {
			System.out.println("���� ��ȣ �Դϴ�.");
			return false;
		}
	return true;	
	}
	
	public static void main(String[] args) {
		new Menu();
	}
}
