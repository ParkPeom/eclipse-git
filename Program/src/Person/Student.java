package Person;

public class Student extends Person {
	
	private String studentID;
	private int grade;
	private double gPA;

	public Student() {}
	
	public Student(String name, int age, int height, int weight, String studentID, int grade, double gPA) {
		super(name, age, height, weight);
		this.studentID = studentID;
		this.grade = grade;
		this.gPA = gPA;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public double getgPA() {
		return gPA;
	}

	public void setgPA(double gPA) {
		this.gPA = gPA;
	}
	
	
	// 출력
	public void show() {
		System.out.println("-----------------------------");
		System.out.println("학생 이름 : " + super.getName());
		System.out.println("학생 나이 : " + super.getAge());
		System.out.println("학생 키 : " + super.getHeight());
		System.out.println("학생 몸무게 : " + super.getWeight());
		// 위에는 상속받은 Person 클래스의 메쏘드를 바로 사용함
		
		System.out.println("학생 학번 : " + this.getStudentID());
		System.out.println("학생 학년 : " + this.getGrade());
		System.out.println("학생 학점 : " + this.getgPA());
		System.out.println("-----------------------------");
		
	}
	
}
