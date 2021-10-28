package Person;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		Student student1 = new Student("조재성",32,163,55,"1111048",3,4.1);
		Student student2 = new Student("김재형",35,173,57,"1312068",3,3.8);
		
		student1.show();
		student2.show();
		
		Teacher teacher = new Teacher("이숭인",38,171,55,"0000000",400,5);
		teacher.show();
		
		// 배열을 이용하여 객체를 확인해보자 
		
		Student[] students = new Student[100];
		
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student("홍길동" +i+"번쨰",20,175,80,i+"",1,4.5);
			students[i].show();
		}
		
		// Scanner 로 실제 입력을 받아서 객체를 초기화 하여 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("총 몇명의 학생이 존재합니까?(배열수) : ");
		int number = sc.nextInt(); 
		
		
		for(int i = 0; i < number; i++) {
			String name; 
			int age;
			int height;
			int weight; 
			String studentID;
			int grade; 
			double gPA;
			
			System.out.print("학생의 이름을 입력하세요 : ");
			name = sc.next();
			System.out.print("학생의 나이를 입력하세요 : ");
			age = sc.nextInt();
			System.out.print("학생의 키를 입력하세요 : ");
			height = sc.nextInt();
			System.out.print("학생의 몸무게를 입력하세요 : ");
			weight = sc.nextInt();
			sc.nextLine();
			System.out.print("학생의 학번을 입력하세요 : ");
			studentID = sc.nextLine();
			System.out.print("학생의 학년을 입력하세요 : ");
			grade = sc.nextInt();
			System.out.print("학생의 학점을 입력하세요 : ");
			gPA = sc.nextDouble();
			
			students[i] = new Student(name,age,height,weight,studentID,grade,gPA);
		}
		
		for(Student s : students) {
				s.show();
		}
		
	}
}
