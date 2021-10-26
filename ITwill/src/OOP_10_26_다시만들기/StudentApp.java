package OOP_10_26_´Ù½Ã¸¸µé±â;

import java.util.ArrayList;

public class StudentApp {

	public static void main(String[] args) {
		
		Student student1 = new Student(1000,"¹Ú¹ü",98,95);
		
		student1.calcTot();
		student1.print();
		
		System.out.println("--------------------------");
		
		Student[] studentarr = new Student[6];
		studentarr[0] = new Student(1000,"±èÁöÈÆ",98,95);
		studentarr[1] = new Student(2000,"¹Ú¹ü",98,95);
		studentarr[2] = new Student(3000,"¹ÚÁöÈÆ",95,92);
		studentarr[3] = new Student(4000,"±èÃ¶Á¤",75,81);
		studentarr[4] = new Student(5000,"Á¤Ã¶",58,25);
		studentarr[5] = new Student(6000,"±èÁ´¿î",78,65);
		for(int i = 0; i < studentarr.length; i++) {
				studentarr[i].print();
		}
		
		System.out.println("----------------------------");
		
		ArrayList<Student> studentArr = new ArrayList<Student>();
		studentArr.add(new Student(1000,"±èÁöÈÆ",98,95));
		studentArr.add(new Student(2000,"¹Ú¹ü",92,52));
		studentArr.add(new Student(3000,"¹ÚÈÆ",48,65));
		studentArr.add(new Student(4000,"±èÁ¤Ã¶",58,25));
		studentArr.add(new Student(5000,"±èÁö¿µ",78,65));
	
		for(Student s : studentArr) {
			s.print();
		}
	}
}
