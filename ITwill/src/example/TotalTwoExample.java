package example;

import java.util.Scanner;

//Ű����� �������� ��� �Է¹޾� �հ踦 ����Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
//��, �Էµ� �������� 0�� ��� �Է��� �����ϰ� �հ� ���
//ex) ������ �Է�[0:����] >> 10
//  ������ �Է�[0:����] >> 20
//  ������ �Է�[0:����] >> 30
//  ������ �Է�[0:����] >> 0
//  [���]�հ� = 60
public class TotalTwoExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		int jungsu = 0;
		int sum = 0;
		
		while(true) {
			System.out.print("������ �Է�[0:����] >> ");
			jungsu = scanner.nextInt();
			
			if(jungsu == 0) break;
			sum += jungsu;
		}
		System.out.println("[���]�հ� = " + sum);
		scanner.close();
	}
}
