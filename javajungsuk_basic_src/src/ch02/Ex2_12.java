package ch02;

public class Ex2_12 {
	
	public static void main(String[] args) {
		
		String str = "3";
		
		System.out.println(str.charAt(0) - '0'); // "3" -> 3
		System.out.println('3' - '0' + 1); // 3 + 1 = 4
		System.out.println(Integer.parseInt("3") + 1); // 4
		System.out.println("3" + 1); // "31"
		System.out.println(3 + '0'); // 3 + 48 = 51 
		
		// 정수보다 낮은 타입끼리 더하면 정수로 형변환되어 더해진다.
		
	}
}
