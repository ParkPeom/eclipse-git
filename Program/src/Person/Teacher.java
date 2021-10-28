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
	
	// ���
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
		System.out.println("���� �̸� : " + super.getName());
		System.out.println("���� ���� : " + super.getAge());
		System.out.println("���� Ű : " + super.getHeight());
		System.out.println("���� ������ : " + super.getWeight());
		// ������ ��ӹ��� Person Ŭ������ �޽�带 �ٷ� �����
		
		System.out.println("������ ��ȣ : " + this.getTeacherNo());
		System.out.println("���� ���� : " + this.getSalary());
		System.out.println("���� ���� : " + this.getYear());
		System.out.println("-----------------------------");
	}
}