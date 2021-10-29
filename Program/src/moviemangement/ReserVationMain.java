package moviemangement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
	��ȭ ���� 
	�¼� [0-0] [0-1] [0-2] [0-3]
	    [1-0] [1-1] [1-2] [1-3]
	    [2-0] [2-1] [2-2] [2-3]
	    [3-0] [3-1] [3-2] [3-3]
	<< ITWill CIneMa >>    
	1. �¼�����    
	2. �¼�����
	3. ���ų�����ȸ
	4. ��������ϱ�
	
*/

// ���� ���� Ŭ���� 
public class ReserVationMain { 
	 
	static ReserVationMain reser = new ReserVationMain(); // ����
	static String[][] seat;	// �¼�
	static int[][] reservedNumber; // ���Ź�ȣ
	Scanner sc; // �Է�
	List<UserVO> user; // �������� 
	
	static Join j; 
	
	
	// ������ �ʱ�ȭ �̱��� 
	ReserVationMain() {
		seat = new String[4][4];
		reservedNumber = new int[4][4];
		sc = new Scanner(System.in);
		user = new ArrayList<UserVO>();
	 }
	
	// ���α׷� ���� �� �¼� �ʱ�ȭ
	
	public void setInfo() {
		for(int i = 0; i < seat.length; i++) {
			for(int j = 0; j < seat[i].length; j++) {
				seat[i][j] = i + "-" + j;
			}
		}
	}
	
	// ���� 
		public void line() {
			System.out.println("=================");
		}
	
	// 1. �¼� ����
	public String[][] showSeat(String[][] seat) {
		line();
		for(int i = 0; i < seat.length; i++) {
			for(int j = 0; j < seat[i].length; j++) {
				System.out.print(seat[i][j]+" ");
			}
			System.out.println();
		}
		line();
		return seat;
	}
	
	// 2. �¼� �����ϱ�
	public String[][] seatReserVation(String[][] seat) {
		System.out.print("�¼� ��ȣ�� �������ּ���. ��) 1-1> ");
		String seatNo = sc.nextLine();
		for(int i = 0; i < seat.length; i++) {
			for(int j = 0; j < seat[i].length; j++) {
				if(seatNo.equals(seat[i][j])) {
					seat[i][j] = "����";
					reservedNumber[i][j] = (int)(Math.random()*100000);
					System.out.println("���Ű� �Ϸ� �Ǿ����ϴ�.");
					reser.showSeat(seat);
					System.out.println(String.format("���� �¼��� [%s-%s]�ο��� ���Ź�ȣ�� %d �Դϴ�.",i,j,reservedNumber[i][j] ));
					break;
				} else if(seatNo.equals("����")) {
					System.out.println("���ŵ�");
				}
				if(seatNo.equals("����") && reservedNumber[i][j] == 0) {
					System.out.println("���ŵ�");
				}
			}
		}
		if(seatNo == null) {
			System.out.println("���������ʽ��ϴ�.");
		}
		return seat;
	}
	
	// 3. ���� ���� ��ȸ�ϱ�
	public void reservedConfirm(String[][] seat) {
		line();
		System.out.print(" �� ���ű� ��ȣ�� �Է����ּ��� �� ");
		line();
		int number = sc.nextInt();
		for(int i = 0; i < reservedNumber.length; i++) {
			for(int j = 0; j < reservedNumber[i].length; j++) {
				if(number == reservedNumber[i][j]) {
					line();
					System.out.println(String.format("��ȸ�� ������ �¼��� [%s-%s] �Դϴ�", i , j));
					line();
				} 
			}
		}
	}
	
	// 4. ���� ����ϱ�
	public void cancelSeat(String[][] seat) {
		System.out.println("�� ���ű� ��ȣ�� �Է����ּ��� �� ");
		int number = sc.nextInt();
		for(int i = 0; i < reservedNumber.length; i++) {
			for(int j = 0; j < reservedNumber[i].length; j++) {
				if(number == reservedNumber[i][j]) {
					seat[i][j] = i+"-"+j;
					reservedNumber[i][j] = 0;
					line();
					System.out.println("���Ű� ��ҵǾ����ϴ�.");
					line();
					break;
				}
			}
		}
	}	
	
	// ���α׷� �����ϱ�
	public static void exit() {
		System.exit(0);
	}
	
	// �޴� 
	public static void showMenu() {
		int menu = 0;
		do {
			System.out.println("<< ITWill CineMa >>");
			System.out.println("�޴��� �������ּ���.");
			System.out.println("1. ��ȭ�� �¼� ����");
			System.out.println("2. ��ȭ �¼� ����");
			System.out.println("3. ���� ���� ��ȸ");
			System.out.println("4. ���� ��� ");
			System.out.println("5. ȸ�� ���� �������� �̵��ϱ� ");
			System.out.println("6. ���� �ϱ�");
			
			Scanner sc = new Scanner(System.in);
			String choice = sc.nextLine();
			menu = Integer.parseInt(choice);
			
			switch(menu) {		
			case 1:
				reser.showSeat(seat);		 // �¼����� 
				break;
			case 2:
				reser.seatReserVation(seat); // �¼������ϱ�
				break;
			case 3:
				reser.reservedConfirm(seat); // ���ų��� ��ȸ�ϱ�
				break;
			case 4:
				reser.cancelSeat(seat);		 // ���ų��� ����ϱ� 
				break;
			case 5:
				Join j = new Join();
				j.showMenu(); 			     // ȸ�� ���� �������� �̵� 
				break;
			case 6:
				System.out.println("����Ǿ����ϴ�.");
				exit();
			default :
				System.out.println("�ٽ� �Է� �ϼ���.");
			}
		} while(!(1 > menu || menu >= 5));
	}
	
	public static void main(String[] args) {		
		reser.setInfo(); // �¼��ʱ�ȭ
		reser.showMenu(); // �޴������ֱ� 	
	}
}
