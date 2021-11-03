package String의Split;


/*
       문자열 = 대상문자열.split("기준문자"); - 기준문자로 나뉘어서 
  		나중 데이터베이스 에서 값을 꺼낼때 #으로 Split 해서 사용함
 */
public class SplitTest {
	
	public static void main(String[] args) {
		
		String str = "";
		for(int i = 0 ; i < 5; i++) {
			str += i + "#";
		}
		
		String[] strarr = str.split("#");
		
		for(String a : strarr) {
			System.out.print(a + " " + "\n");
		}
		 
		//1. 쉼표(,)로 문자열 잘라서 배열에 넣기
		
		str = null;
		str = "A,B,C,D";
		
		String[] strarr1 = str.split(",");
		char[] charr = str.toCharArray();
		
		for(String s : strarr1) {
			System.out.print(s + " ");
		}
		System.out.println();
		for(char c : charr) {
			System.out.print(c + " ");
		}
	}
}
