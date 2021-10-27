package 상속을이용한School;

/*
  선생님을 의미하는 클래스
  School 클래스를 상속받은 자식 클래스
  동시에 Student 클래스에 상속하는 부모 클래스 
 */

public class Teacher extends School {
	
	// 각반 학생들의 지도교수
	
	public Teacher() {
		System.out.println("반 확인 프로그램");
	}
	
	public String getBan(String name) {
		return super.getBan(name) + "반";	
	}
}
