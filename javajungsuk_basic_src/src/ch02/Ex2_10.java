package ch02;

import java.util.Scanner;

public class Ex2_10 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���ڸ� ������ �ϳ� �Է����ּ��� > ");
		
		String jungsu = scanner.nextLine();
		int num = Integer.parseInt(jungsu);
		
		System.out.println("�Է³���:" + jungsu);
		System.out.printf("num=%d%n",num);
	}
}
