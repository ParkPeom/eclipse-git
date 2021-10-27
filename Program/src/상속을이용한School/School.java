package 상속을이용한School;

/*
 학교이름 , 학교의 등급 , 학생들의 이름과 선생님들의 이름을 멤버필드로 가지고 있다.
 
  학생의 이름으로 학생이 속한 반을 return 하는 기능을 가진 메서드가 있다.
  학생의 이름으로 학생을 담당하는 선생님의 이름을 리턴하는 기능을 가진 메서드가 있다.
  
  
 */

public class School {
	
	public String schoolName = "Commin";
	public String schoolClass = "Middle school";
	
	// 반 학생들 이름 다차원 배열 
	private String[][] class_student_name = {
			{"commin1","commin2"}, // 1반
			{"commin3","commin4"}, // 2반
			{"commin4","commin5"} // 3반
		};
	// 각 반 담임 - 1차원배열
	private String[] teacher_name = {
			"Micle Cherick" , // 1반
			"Brown Shole" , // 2반
			"Geary Gohy" , // 3반
			
		};
	
	public School() {
		System.out.println(schoolName + " " + schoolClass);
	}
	
	// 각 반의 학생 - 다차원 배열 
	public String getBan(String name) {
		for (int i = 0; i < class_student_name.length; i++) {
			for (int j = 0; j < class_student_name[i].length; j++) {
				
				if(class_student_name[i][j].equals(name)) {
					return (i + 1) + ""; // 몇반 
				}
			}
		}
		return null; // 없으면 
	}
	
	// 선생님 이름 - 일차원 배열  
	public String getTeacherName(String student_name) {
		for (int i = 0; i < class_student_name.length; i++) {
			for (int j = 0; j < class_student_name[i].length; j++) {
				
				if(class_student_name[i][j].equals(student_name)) {
					
					return teacher_name[i]; // 선생님 이름 호출 
				}
			}
		}
		return null; // 없으면 
	}
	
	// 각 반 친구들 불러오기
	
	public String[] getFriends(String student_name) {
		for (int i = 0; i < class_student_name.length; i++) {
			for (int j = 0; j < class_student_name[i].length; j++) {
				
				if(class_student_name[i][j].equals(student_name)) {
					return class_student_name[j]; // 각반 친구들 호출
				}
			}
		}
		return null;
	}
}

