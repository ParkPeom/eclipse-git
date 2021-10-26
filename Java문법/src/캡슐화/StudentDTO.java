package Ä¸½¶È­;

import java.util.ArrayList;

public class StudentDTO {
	
	
	public static void main(String[] args) {
		StudentVO stu1 = new StudentVO("±èÃ¶Áß","101102","³²ÀÚ");
		
		ArrayList<StudentVO> arr = new ArrayList<StudentVO>();
	
		arr.add(stu1);
		
		stu1 = null;
		stu1 = new StudentVO("±èÁö¿¬","205202","¿©ÀÚ");
		arr.add(stu1);
		
		stu1 = null;
		stu1 = new StudentVO("±èÃ¶Á¾","136402","³²ÀÚ");
		arr.add(stu1);
		
		
		for(StudentVO s : arr) {
			System.out.println(s +"");
		}
		
		
		
	}
}
