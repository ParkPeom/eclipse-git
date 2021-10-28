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
	
	
	// ���
	public void show() {
		System.out.println("-----------------------------");
		System.out.println("�л� �̸� : " + super.getName());
		System.out.println("�л� ���� : " + super.getAge());
		System.out.println("�л� Ű : " + super.getHeight());
		System.out.println("�л� ������ : " + super.getWeight());
		// ������ ��ӹ��� Person Ŭ������ �޽�带 �ٷ� �����
		
		System.out.println("�л� �й� : " + this.getStudentID());
		System.out.println("�л� �г� : " + this.getGrade());
		System.out.println("�л� ���� : " + this.getgPA());
		System.out.println("-----------------------------");
		
	}
	
}
