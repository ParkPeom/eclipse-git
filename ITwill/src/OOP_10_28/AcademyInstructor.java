package OOP_10_28;

// ���� ������ �����ϱ� ���� Ŭ����
// => �����ȣ �����̸��� Person���� ��ӹ޾� ����

public class AcademyInstructor extends AcademyPerson {
	
	private String subject;
	public AcademyInstructor() {}

	public AcademyInstructor(String num, String name, String subject) {
		super(num, name);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public void display() {
		System.out.println("���� ��ȣ = " + super.getNum());
		System.out.println("���� �̸� = " + super.getName());
		System.out.println("���� ���� = " + this.getSubject());
	}
}
