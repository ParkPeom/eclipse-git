package ch02;

import java.util.Scanner;

public class Ex2_10 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두자리 정수를 하나 입력해주세요 > ");
		
		String jungsu = scanner.nextLine();
		int num = Integer.parseInt(jungsu);
		
		System.out.println("입력내용:" + jungsu);
		System.out.printf("num=%d%n",num);
	}
}
