package OOP_10_28;

// ��������(������ȣ,�����̸�,�ٹ��μ�)�� �����ϱ� ���� Ŭ����
public class AcademyStaff extends AcademyPerson {
	
	private String depart;
	
	public AcademyStaff() {	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public AcademyStaff(String num, String name, String depart) {
		super(num, name);
		this.depart = depart;
	}
	
	@Override
	public void display() {
		System.out.println("���� ��ȣ = " + super.getNum());
		System.out.println("���� �̸� = " + super.getName());
		System.out.println("�ٹ� �μ� = " + this.getDepart());
	}
}
