package String��Split;


/*
       ���ڿ� = ����ڿ�.split("���ع���"); - ���ع��ڷ� ����� 
  		���� �����ͺ��̽� ���� ���� ������ #���� Split �ؼ� �����
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
		 
		//1. ��ǥ(,)�� ���ڿ� �߶� �迭�� �ֱ�
		
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
