package example;

import java.util.Scanner;

// ���������� ���� ���α׷��� �ۼ� �ϼ��� 
// => ��ǻ��(����)�� �����(Ű����) �� ���������� ���
// => ����ڰ� �̱� ��� ��� �ݺ� �����ϸ� �� ��� ���� ����
// => ���� ���� �� ������� �¸� Ƚ�� ��� 

//��ǻ�Ϳ� ������� ���и� �Ǵ��Ͽ� ��� ���
		// => ����ڰ� �̱� ��� ���� Ƚ���� 1 ���� ��Ų��. >> ��� ����� �ݺ��Ҽ� �ֵ��� �Ѵ�.
		// => ����ڰ� ���� ��� �ݺ����� ���� �Ѵ�. 	
public class RpaGameApp {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// ������� ���� Ƚ���� �����ϱ� ���� ����
		int count = 0;
		// ���������� ��� - �ݺ� ó��
		int user;
		while(true) {
			// ��ǻ�Ϳ��� ���������� �� �ϳ��� �����޾� ���� >> ���� : 1 ~ 3 
			// => 1 : ���� , 2 : ���� , 3 : �� 
			// 1 ~ 3 ������ �������� ������ �����޾� ���� 
			int computer = (int)(Math.random() * 3) + 1; // random()*10)%3+1
			// ����ڿ��� ����,����,�� �� �ϳ��� �Է� �޾� ���� 
			// => �Է°��� 1 ~ 3 ������ �������� �ƴ� ��� ���� �޼��� ��� �� ���Է�
			while(true) { // �̹ݺ����� �ùٸ� ���� �Է��� ��� ���� ������.
				System.out.println("���������� [ 1. ����, 2. ���� , 3. ��] >> ");
				user = scanner.nextInt();
				if(user >= 1 && user <= 3) break;
				System.out.println("[����] ����,����,�� �� �ϳ��� ���� �����մϴ�.");
			}	
			// ��ǻ�Ϳ� ����ڰ� ������ ������������ ��� 
			System.out.print("[�Է�] ��ǻ�� = ");
			if(computer == 1) {
				System.out.println("����");
			} else if (computer == 2) {
				System.out.println("����");
			} else {
				System.out.println("��");
			}
			System.out.print("����� = ");
			if(user == 1) {
				System.out.println("����");
			} else if (user == 2) {
				System.out.println("����");
			} else { 
				System.out.println("��");
			}	
			if(computer == user) {
				System.out.println("[���] ����ڿ� ��ǻ�Ͱ� �����ϴ�.");
				// ����ڰ� �̱� ��� 
			} else if(computer==1 && user==2 || (computer==2 && user==3) || (computer==3 && user==1)) {
				System.out.println("[���] ����ڰ� ��ǻ�Ϳ��� �̰���ϴ�.");
				count++; // ����ڰ� �̱�� ����Ƚ�� ����
			} else {
				System.out.println("[���] ����ڰ� ��ǻ�Ϳ��� �����ϴ�.");
				break; // �ݺ��� ���� - ��� ���� 
			} 
		} 	
		// ���� ��� ��� 	
		System.out.println();
		if(count == 0) {
			System.out.println("����ڰ� ��ǻ�Ϳ��� �ѹ��� �̱��� ���߽��ϴ�.");
		} else {
			System.out.println("����ڰ� ��ǻ�Ϳ��� " + count + "�� �����ؼ� �̰���ϴ�.");
		}
		scanner.close();
	}
}
