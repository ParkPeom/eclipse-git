package String_StringBuffer_Cutter;

/*
  
  StringPool : 기본타입으로 만들었을때 heap 영역에 있는 StringPool에
  literal 이 생성돼 값이 둥둥 떠다닌다.
  
  immutable : String 값 수정시 그 값 자체가 변경되는 것이 아니라
  새로운 값이 생성되고 그 값으로 참조를 바꿈
  
  String Concatenation : 어떠한 타입도 문자열을 만나면 문자열 타입으로 바꾼다.
  코드를 통해 String 타입의 사용법을 살펴보면 
  
 */

public class MTest {
	
	public static void main(String[] args) {
		
		String s = "Hello";
		// 정수 + 문자열 
		System.out.println(1 + 2 + s); // 3Hello
		System.out.println(s); // Hello
		
		// 문자열 + 정수
		s = s +  1 + 2; // "Hello12"
		System.out.println(s);
		// String concatenation
		
		// 1. str의 전체 길이 (출력)
		System.out.println(s.length()); // 7
		System.out.println("---------");
		
		// 2. str 전체 대문자로 바꿔서
		System.out.println(s.toUpperCase()); // HELLO12
		
		// 3. str 전체 소문자로 바꿔서
		System.out.println(s.toLowerCase()); // hello12
		
		// 4. str에서 첫번째로 나오는 c의 인덱스
		
		System.out.println(s.indexOf('c')); // 없으면 -1
		
		// 5. class -> java로 바꿔서
	
		System.out.println(s.replace("Hello12", "java"));
		
		String str2 = s.replace("Hello12", "javacharacter");
		System.out.println(str2);
		
		// 6. character 찾아서 대문자로 변환 후 변환된 내용으로 전체 출력
		
//		str2.replace("character", str2.substring(str2.indexOf("character"), str2.indexOf("character") + 9).toUpperCase());
		
		
		String target = "character";
		System.out.println(str2.indexOf(target));
		int start = str2.indexOf(target);
		int end = start + target.length();
		
		String upper = str2.substring(start,end).toUpperCase();
		System.out.println(str2.replace(target, upper));
		
		// 7. str을 char[] 로 출력하되 'c'만 출력 그리고 c의 갯수 구하기
		
		char[] c = str2.toCharArray();
		int count = 0;
		for(int i = 0; i < c.length; i++) {
			if(c[i] == 'c' || c[i] == 'C') {
				System.out.println(c[i]);
				count += 1;
			}
		}
		System.out.println("c의 갯수는 " + count);
		
		// 8 str을 char[]로 출력하되 대문자만 그리고 대문자의 갯수도
		target = "Ss2eoqOieQ";
		char[] c2 = target.toCharArray();
		count = 0;
		String s2 = "";
		for(int i = 0; i < c2.length; i++) {
			if('A' <= c2[i] && c2[i] <= 'Z') {
				s2 += c2[i];
				count += 1;
			}
		}
		System.out.println("대문자는 : " + s2 );
		System.out.println(String.format("%d 개수", count));	
		
		// 9. str 안에 모든 공백 제거 후 출력
		
		str2 = "love lo hoho ";	
		System.out.println(str2.replace(" ", ""));
		
		// 10. 전체 역순으로 출력
		// 전체길이 - 1 부터 0 까지 반대순으로 i-- 
		// charAt(i) 출력 
		for(int i = str2.length() - 1; i >= 0; i--) {
			System.out.print(str2.charAt(i) + " ");
		}
		System.out.println();
	
	// String Buffer
	/*
	 mutable : 값이 변한다 -> 수정해도 heap 영역에 새로운 값이 생성되는 것이 아니라
	 원본 그자체의 값이 변경된다. 
	 	
	 */
		StringBuffer sb = new StringBuffer("Hi ~");
		
		sb.append("안녕하세요"); 
		System.out.println(sb); 
		System.out.println(":hashcode : " + sb.hashCode());
		// 해시코드가 같으면 같은 주소값을 가리킨다.
		
		// 메서드 체인
		// method chaining -> 메서드.메서드.메서드 이런식으로 연결하는 걸 말한다.
		
		sb.append("저는").append("박범 입니다");
		System.out.println(sb);
		System.out.println(":hashCode -> " + sb.hashCode());
		
		// String = immutable : 불변 객체
		// -> 수정시 스트링 풀에 literal이 생성
		// -> 수정 후에 hashcode 주소값이 변함
		
		String ss = "안녕하세요";
		System.out.println(ss);
		System.out.println(ss.hashCode());
		
		ss += "가";
		System.out.println(ss.hashCode());
		
		System.out.println(ss);
		
		ss = ss.replace("안녕하세요가", "하이!");
		System.out.println(ss);
		
	}
}
