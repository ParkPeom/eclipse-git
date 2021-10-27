package OOP_10_26_다시만들기;

public class StudentApp {
	public static void main(String[] args) {
		
		Student[] students = new Student[] {
				new Student(1000,"홍길동",50,60) ,
				new Student(2000,"김길동",70,80) , 
				new Student(3000,"박길동",50,80) ,
				new Student(4000,"호길동",53,90)
		};
		
		
		// 일괄처리 
		/*
		for(int i = 0; i < students.length; i++ ) {
			students[i].display();
		}
		*/
		
		// 모든 학생들의 점수를 구하기
		
		/*
		 //total+=student.getTot();//학생의 총점을 반환받아 총점 합계 변수에 누적
			
			//정적 필드는 클래스를 이용하여 접근 가능 
			// => 정적 필드의 접근 지정자가 private인 경우 접근 불가능
			//Student.total += student.getTot(); 
		  
		 */
		for(Student student : students) {
			student.display();
			Student.setTotal(Student.getTotal() + student.getTot());
//			System.out.println("총 합계 " + total);
		}
		System.out.println("총합계 = " + Student.getTotal());
	}
}
