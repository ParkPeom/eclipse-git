package ch02;

public class Ex2_8 {
	
	public static void main(String[] args) {
		
		int x = 10 , y = 5; // int x = 10 ; int y = 5 �� ���ٷ�
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		// ġȯ�˰��� 
		int tmp = x; 
		x = y;
		y = tmp;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
