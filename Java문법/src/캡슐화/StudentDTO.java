package ĸ��ȭ;

import java.util.ArrayList;

public class StudentDTO {
	
	
	public static void main(String[] args) {
		StudentVO stu1 = new StudentVO("��ö��","101102","����");
		
		ArrayList<StudentVO> arr = new ArrayList<StudentVO>();
	
		arr.add(stu1);
		
		stu1 = null;
		stu1 = new StudentVO("������","205202","����");
		arr.add(stu1);
		
		stu1 = null;
		stu1 = new StudentVO("��ö��","136402","����");
		arr.add(stu1);
		
		
		for(StudentVO s : arr) {
			System.out.println(s +"");
		}
		
		
		
	}
}
