package schoolManagement;


/*
 
 학교이름 , 학교의 등급 , 학생들의 이름과 선생님들의 이름을 멤버필드로 가지고 있다.
 학생의 이름으로 학생이 속한 반을 return 하는 기능을 가진 메서드가 있다.
 학생의 이름으로 학생을 담당하는 선생님의 이름을 리턴하는 기능을 가진 메서드가 있다.
 
 	i 1행 2행 3행 
 	
*/
public class School {
	
	private String school_name1 = "Happy Scool";
	private String[][] school_name = {{"1반","김경식","김지훈","박훈"},
									  {"2반","함용덕","이제명"},
									  {"3반","김지훈","김군"}};
	private String[] teacher = {"Michlen" , "lose" , "Geary Gohy"};
	
	public School() {
		System.out.print(school_name1 + " ");
	}
	
	// 반
	public String getBan(String name) {
		
		for(int i = 0; i < school_name.length; i++) {
			for(int j = 0; j < school_name[i].length; j++) {
				if(school_name[i][j].equals(name)) {
					return  (i + 1) + "반 입니다.";
				}
			}
		}
		return "그런 학생이 없습니다"; // 없으면
	}
	
	// 선생님	
	public String getTeacher(String student_name) {
		for (int i = 0; i < school_name.length; i++) {
			for (int j = 0; j < school_name[i].length; j++) {
				
				if(school_name[i][j].equals(student_name)) {
					return "선생님 : " + teacher[i];
				}
			}
		}
		return null; // 없으면 
	}
	
	// 학생들
	public String[] getStudents(String student_name) {
		for (int i = 0; i < school_name.length; i++) {
			for (int j = 0; j < school_name[i].length; j++) {
				if(school_name[i][j].equals(student_name)) {
				     return school_name[i];
				}
			}
		}
		return null;
	}
}
