package example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	Scanner sc;
	int total = 0;
	List<Test> list;
	int[] arr;
	
	public Test() {
		new ArrayList<Test>();
		arr = new int[] {};
		sc = new Scanner(System.in);
	}
	
	public void arrInput(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			
		}
	}
	
	public void arrPrint(int[] arr) {
		
			for(int arrprint : arr) {
				System.out.println(arrprint);
		}
	}
	
	public void arrSum(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
	}
	
	public void arrReplace(int[] arr) {
		
	}
	
	public static void main(String[] args) {
		
		StudentVO stu = new StudentVO();
		ArrayList<StudentVO> std = new ArrayList<StudentVO>();
		
		stu.setName("�ڹ�");
		stu.setAge(18);
		std.add(stu);
		
		stu = null;
		stu.setName("������");
		stu.setAge(28);
		
		
		
	}
}
