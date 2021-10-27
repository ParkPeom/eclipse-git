package 상속을이용한School;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 프로그램 설명
 *학생 자신의 이름을 입력하면 자신의 반과 담임선생님 그리고 반의 친구들까지 모두 Console
  출력이되게 하는 프로그램
 * 
 *반 확인 프로그램
 * 당신의 이름을 쓰세요 >> 박범
 * 당신의 담임 :  1반담임 이름
 * 당신의 반 :  1반  
 * 반친구들 : {  1반친구들 출력  } 
 * 
 학생을 의미하는 클래스
 Teacher 클래스를 상속받은 자식클래스
 메인메서드가 이곳에 존재하므로 프로그램의 시작은 Student 클래스
 학생의 이름을 입력받아 Console 화면에 결과를 출력 
  
 */
public class Student extends Teacher {
	
	private String name;
	public Student() throws IOException {
		super();
		start();
	}
	
	public void start() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("당신의 이름을 쓰세요 >> ");
		
		name = br.readLine();
		
		if(super.getBan(name) == null) {
			System.out.println("당신은 우리 학교 학생이 아닙니다.");
			return; // 종료 
		}
		
		System.out.println("당신의 담임 : " + super.getTeacherName(name));
		System.out.println("당신의 반 : " + super.getBan(name));
		
		String[] friends = super.getFriends(name);
		System.out.print(" 반 친구들 : { ");
		for(int i = 0; i < friends.length; i++) {
			System.out.print(friends[i] + " ");
		}
		System.out.println("}");
	}
	
	public static void main(String[] args) throws IOException {
		new Student();
	}	
}
