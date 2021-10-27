package schoolManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student extends Teacher {
	
	Student() throws IOException {
		super();
		start();
	}
	
	public void start() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("����� �̸��� ���ÿ� > ");
		String name = br.readLine();
		System.out.println(super.getBan(name));
		System.out.println(super.getTeacher(name));

		// �л��� ��� ��� 
		String[] arr = super.getStudents(name);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) throws IOException {
		new Student();
		
	}
}
