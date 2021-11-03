package String_Trim;

/*
 문자열을 입력 받거나 문자열을 합칠 경우 가끔 쓸데없는 
 공백이 따라 들어 오곤 합니다. 
 그럴떄 유용하게 사용되는 Trim함수 입니다. 
 왼쪽에 공백 오른쪽에 공백을 제거해줌
 
 가운대 공백은 replace() 함수를 써서 제거해주면 된다.
  
 */
public class TrimTest {

	public static void main(String[] args) {
		
		String str = "  문자열에 공백이 있습니다   ";
		System.out.println(str);
	
		str= str.trim(); 
		System.out.println(str);
		
	}
}
