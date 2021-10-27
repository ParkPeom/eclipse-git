package schoolManagement2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentApp extends StudentVO {

	
	StudentApp() throws IOException {
		start();
	}
	
	public void start() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("학생 이름을 입력 하시오 . >> ");
		String name = br.readLine();
		line();
		super.setStuName(name);
		System.out.println(super.getStuName());
		
	}
	
	public void line() {
		System.out.println("=========================");
	}
	
	public static void main(String[] args) throws IOException {
		new StudentApp();
	}
}
