package String_replace;
/*
  Replace 함수는 자신이 바꾸고싶은 문자로 문자열을 치환시켜주는 기능
   주로 공백을 제거할때 많이 쓰인다.
    " " -> ""
    
    Replace는 특수문자로도 치환이 되는데 반하여 
    ReplaceAll은 특수문자로 치환이 어렵다
    
    
 */
public class ReplaceTest {
	
	public static void main(String[] args) {
		
		String str = " 문자열에 공백이 있습니다.";
		
		String str2 = str.replace(" ", "");
		System.out.println(str2);

		String a = "무궁화 . 삼천리 . 화려강산 . 대한사람";
		a = a.replace(".", "/");
		System.out.println(a);
		
		// replaceAll 은 문자열 전체가 치환되는 것을 확인함
		
		// ReplaceFirst 자신이 바꾸고싶은 
		// 문자열이 처음으로 해당
		// 할때만 치환시켜주는 기능을 합니다.
		
	}
}
