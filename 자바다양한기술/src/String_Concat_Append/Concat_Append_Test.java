package String_Concat_Append;

/*
 Concat - 문자열을 합치는 기능
 Concat은 합친 문자열을 String으로 생성해준다
 
  + 연산자는 StringBuilder로 변환시킨 뒤에
  Append로 문자열을 더하고 다시 toString()함수로 문자열로 반환
  
 */
public class Concat_Append_Test {
	
	public static void main(String[] args) {
		
		// concat()
		// 합친 문자열은 또 다른 문자열로 생성해줘야한다는....
		// 두개의 문자열을 더할때는 Concat을 사용하는것이 좋다.
		String str = "ABCDE";
		String str2 = str.concat(str);
		System.out.println(str2);
		
		// append() 
		// 기존 문자열에 덧붙임 
		StringBuilder sb = new StringBuilder();
		sb.append("두번째 텍스트 입니다");
		sb.append("세번째 텍스트 입니다");
		System.out.println(sb.toString());
	}
}
