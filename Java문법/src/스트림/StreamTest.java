package ��Ʈ��;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
	
	public static void main(String[] args) {
		
		// ���� ArrayList - Iterator �����..	
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("a","b"));
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {	
			String value = iterator.next();
			
				System.out.println("�� : " + value);
		}
		
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("a","b"));
		for(String value : list2) {
			System.out.println("�� :" + value);
		}
		
		ArrayList<String> list3 = new ArrayList<String>(Arrays.asList("a","b"));
		list3.stream().filter("b"::equals).forEach(System.out::println);
		
		// ��Ʈ�� ����
		// ���� ��Ʈ�� ��ü�� �����ؾ� �Ѵ�.
		// �÷��� ��ü���� stream() �޼��带 �����Ѵ�.
		// �÷��� ��ü���� stream() �޼��带 ȣ���ϸ� ��Ʈ�� ��ü ���� 
		List<String> list4 = new ArrayList<String>(Arrays.asList("a","b"));
		Stream<String> stream = list4.stream();
		
		// ��Ʈ�� ���� - �迭
		String[] array = {"a","b","c"};
		Stream<String> stream1 = Arrays.stream(array);
		Stream<String> stream2 = Arrays.stream(array,1,3); // �ε��� 1���� 3���� ("b","c")
		
		stream1.forEach(a -> System.out.print(a + " , "));
		System.out.println();
		
		
		// ��Ʈ�� ���� - ����
		// �迭�̳� �÷����� ���ؼ� �����ϴ°� �ƴ� ���� ���� �Է��ؼ� ��Ʈ�� ��ü�� �����ϴ� ���

		
		
	}
}
