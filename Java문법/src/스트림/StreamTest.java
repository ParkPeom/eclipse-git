package 스트림;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
	
	public static void main(String[] args) {
		
		// 기존 ArrayList - Iterator 사용함..	
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("a","b"));
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {	
			String value = iterator.next();
			
				System.out.println("값 : " + value);
		}
		
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("a","b"));
		for(String value : list2) {
			System.out.println("값 :" + value);
		}
		
		ArrayList<String> list3 = new ArrayList<String>(Arrays.asList("a","b"));
		list3.stream().filter("b"::equals).forEach(System.out::println);
		
		// 스트림 사용법
		// 먼저 스트림 객체를 생성해야 한다.
		// 컬렉션 객체들은 stream() 메서드를 지원한다.
		// 컬렉션 객체에서 stream() 메서드를 호출하면 스트림 객체 만듬 
		List<String> list4 = new ArrayList<String>(Arrays.asList("a","b"));
		Stream<String> stream = list4.stream();
		
		// 스트림 생성 - 배열
		String[] array = {"a","b","c"};
		Stream<String> stream1 = Arrays.stream(array);
		Stream<String> stream2 = Arrays.stream(array,1,3); // 인덱스 1포함 3제외 ("b","c")
		
		stream1.forEach(a -> System.out.print(a + " , "));
		System.out.println();
		
		
		// 스트림 생성 - 빌더
		// 배열이나 컬렉션을 통해서 생성하는게 아닌 직접 값을 입력해서 스트림 객체를 생성하는 방법

		
		
	}
}
