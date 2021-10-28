package OOP_10_28;

// �л�����(�л���ȣ,�л��̸�,��������)�� �����ϱ� ���� Ŭ���� 
// => �л���ȣ�� �л��̸� ���� �Ӽ��� ������ AcademyPerson Ŭ������ ��ӹ޾� �ۼ�
public class AcademyStudent extends AcademyPerson {
	
	private String course;
	
	public AcademyStudent() {

	}

	// �θ��� ����� �Ӽ��� super�� �ʱ�ȭ ������� �Ѵ�.
	public AcademyStudent(String num, String name, String course) {
		super(num, name);
		this.course = course;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	// �θ��� ���� �������̵�
	@Override
	public void display() {
		System.out.println("�л� ��ȣ = " + super.getNum());
		System.out.println("�л� �̸� = " + super.getName());
		System.out.println("���� ���� = " + this.getCourse());
	
	}
}
