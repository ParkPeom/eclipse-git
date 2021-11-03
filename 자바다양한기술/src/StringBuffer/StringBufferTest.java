package StringBuffer;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class StringBufferTest {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("a");
		sb.append("b");
		sb.append("c");
	
		System.out.println(sb);
		sb.deleteCharAt(0); // 해당 문자열을 제거함 
		for(int i = 0; i < sb.length(); i++) {
			System.out.print(sb.charAt(i));
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	}
}

