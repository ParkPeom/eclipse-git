package example;

import java.util.Scanner;

//Ű����� �������� �Է¹޾� 1~9 ������ �������� ���� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
//��,Ű����� �Էµ� �������� 2~9 ������ �������� ����ϸ� ������ ��� �������� �Է��� ���
//���� �޼��� ��� �� ���Է��ϵ��� ���α׷� �ۼ�
//ex) �� �Է�[2~9] >> 7
//  7 * 1 = 7
//  ...
//  7 * 9 = 63
public class GuGuExample {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int dan;
		
		while(true) {
			System.out.println("ex) �� �Է� [2 ~ 9] >> ");
			dan = sc.nextInt();
			
			if(2 <= dan && dan <= 9) { // ��ȿ�� ���̸� ������. 
				break;
			} else {
				System.out.println("[����]2~9 ������ �������� �Է� �����մϴ�.");
			}
		}
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan +"*"+i+"="+dan*i);
		}
	}
}
