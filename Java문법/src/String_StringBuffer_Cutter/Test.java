package String_StringBuffer_Cutter;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String jumin = scanner.nextLine();
		String sex = "";
		// 940114-1
		if(jumin.charAt(7) == '1' ||
			 jumin.charAt(7) == '3' && jumin.length() == 13) {
				sex = "남자";
		} else if(jumin.charAt(7) == '2' 
				|| jumin.charAt(7) == '4' && jumin.length() == 13) {
				sex = "여자";
		} else {
			System.out.println("잘못입력함 ");
		}
	}
}
