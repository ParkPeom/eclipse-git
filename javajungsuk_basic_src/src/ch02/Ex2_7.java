package ch02;

public class Ex2_7 {
	
	public static void main(String[] args) {
		
		String name = "Ja" + "Va"; // ���ڿ� + ���ڿ� 
		String str = name + 8.0; // ���ڿ� + �Ǽ� = ���ڿ�
		
		System.out.println(name); // "JaVa"
		System.out.println(str); // "Java8.0"
		System.out.println(7 + " "); // "7"
		System.out.println("" + 7); // "7"
		System.out.println("" + ""); // ""
		System.out.println(7 + 7 + ""); // "14"
		System.out.println("" + 7 + 7); // "77"
	}
}
