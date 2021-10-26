package OOP_10_26_�ٽø����;

import java.util.ArrayList;

public class StudentApp {

	public static void main(String[] args) {
		
		Student student1 = new Student(1000,"�ڹ�",98,95);
		
		student1.calcTot();
		student1.print();
		
		System.out.println("--------------------------");
		
		Student[] studentarr = new Student[6];
		studentarr[0] = new Student(1000,"������",98,95);
		studentarr[1] = new Student(2000,"�ڹ�",98,95);
		studentarr[2] = new Student(3000,"������",95,92);
		studentarr[3] = new Student(4000,"��ö��",75,81);
		studentarr[4] = new Student(5000,"��ö",58,25);
		studentarr[5] = new Student(6000,"������",78,65);
		for(int i = 0; i < studentarr.length; i++) {
				studentarr[i].print();
		}
		
		System.out.println("----------------------------");
		
		ArrayList<Student> studentArr = new ArrayList<Student>();
		studentArr.add(new Student(1000,"������",98,95));
		studentArr.add(new Student(2000,"�ڹ�",92,52));
		studentArr.add(new Student(3000,"����",48,65));
		studentArr.add(new Student(4000,"����ö",58,25));
		studentArr.add(new Student(5000,"������",78,65));
	
		for(Student s : studentArr) {
			s.print();
		}
	}
}
