package Person;

public class Teacher extends Person {
	
	private String teacherNo;
	private int salary;
	private int year;
	
	Teacher(){}
	public Teacher(String name, int age, int height, int weight, String teacherNo, int salary, int year) {
		super(name, age, height, weight);
		this.teacherNo = teacherNo;
		this.salary = salary;
		this.year = year;
	}
	
	// 출력
	public String getTeacherNo() {
		return teacherNo;
	}
	public void setTeacherNo(String teacherNo) {
		this.teacherNo = teacherNo;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void show() {
		System.out.println("-----------------------------");
		System.out.println("교사 이름 : " + super.getName());
		System.out.println("교사 나이 : " + super.getAge());
		System.out.println("교사 키 : " + super.getHeight());
		System.out.println("교사 몸무게 : " + super.getWeight());
		// 위에는 상속받은 Person 클래스의 메쏘드를 바로 사용함
		
		System.out.println("교직원 번호 : " + this.getTeacherNo());
		System.out.println("교사 월급 : " + this.getSalary());
		System.out.println("교사 연차 : " + this.getYear());
		System.out.println("-----------------------------");
	}
}