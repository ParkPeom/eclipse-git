package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
	
	public static void main(String[] args) {
		
		List arr = new ArrayList<>(Arrays.asList("A","B"));
		Stream<ArrayList> stream= arr.stream();
		Iterator<ArrayList> s = stream.iterator();
		
		if(s.hasNext()) {
			System.out.println(s.next());
		}
	}		
}
