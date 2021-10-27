package OOP_10_26;

//������(Modifier) : Ŭ����, �ʵ�, �޼ҵ� ����� Ư���� ����� �����ϱ� ���� Ű����
//=> ���� ������(Access Modifier) : private, package(default), protected, public
//=> static, final, abstract

//static : �ν��Ͻ��� ������� Ŭ������ �����ϱ� ���� �ʵ� �Ǵ� �޼ҵ带 ������ �� ����ϴ� ������
//=> Ŭ������ ���� Ŭ������ ��쿡�� static ������ ��� ����

//�л�����(�й�,�̸�,����,����,����)�� �����ϱ� ���� Ŭ����
public class Student {
	//�ν��Ͻ� �ʵ�(Instance Field) : �ν��Ͻ� ������ �ν��Ͻ��� ��������� �ʵ�
	// => �ν��Ͻ��� �����Ͽ� ���
	private int num;
	private String name;
	private int kor,eng,tot;
	
	//���� �ʵ�(Static Field) : Ŭ���� ���� Ŭ����(Clazz)�� ��������� �ʵ�
	// => �ν��Ͻ��� ������� �޸𸮿� ������ �ϳ��� �����Ǵ� �ʵ�
	// => �����ڿ��� �ʱ�ȭ���� �ʰ� �ʵ� ����� ���� �ʱ�ȭ
	// => ��� �ν��Ͻ����� ��� ���� : ������ - �޸� ���� �� �ʵ尪 ���� ����
	// => Ŭ������ �����Ͽ� ���
	private static int total; // ���л�������
	
	//������(Constructor) : �ν��Ͻ��� �����ϴ� Ư���� �޼ҵ� 
	// => �ν��Ͻ� �ʵ忡 �⺻���� �ƴ� �ʱⰪ�� �����ϱ� ���� ����
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int num, String name, int kor, int eng) {
		super();
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
		//������ ����Ͽ� �ʵ忡 �����ϴ� ��� �ۼ� - �޼ҵ� ȣ��
		// => �ڵ��� �ߺ��� �ּ�ȭ �Ͽ� ���������� ȿ���� ����
		//tot=kor+eng;
		calcTot(); // ����ȭ ó���� �޼��� �����ڷ� ȣ��� �޼��� ȣ���Ŵ , �߰��Ҷ����� �������� ������
	}
	
	//�ν��Ͻ� �޼ҵ�(Instance Method) : this �Ű������� �����ϴ� �޼ҵ�
	// => this�� �̿��Ͽ� �ν��Ͻ� �ʵ忡 �����Ͽ� ��� ����
	// => ���� �ʵ忡 �����Ͽ� ��� ����
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
		calcTot();
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
		calcTot();
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	//������ ����Ͽ� �ʵ忡 �����ϴ� �޼ҵ�
	/*
	public void calcTot() {
		tot=kor+eng;
	}
	*/
	// ���� - ����ȭó���� �޼���
	//����ȭ ó���� �޼ҵ� : Ŭ���� ���ο����� ȣ���Ͽ� ����ϴ� �޼ҵ� - �ý��� �޼ҵ�
	private void calcTot() { // ���� 
		tot=kor+eng;
	}
	
	//�ʵ尪�� ����ϴ� �޼ҵ� - �ʵ尪 Ȯ��
	public void display() {
		System.out.print(name+"["+num+"]�� ���� >> ");
		System.out.println("���� = "+kor+", ���� = "+eng+", ���� = "+tot);
	}

	//���� �޼ҵ�(Static Method) : this �Ű������� �������� �ʴ� �޼ҵ�
	// => this �Ű������� �����Ƿ� �ν��Ͻ� �ʵ� ���� �Ұ���
	// => ���� �ʵ�� �����Ͽ� ��� ����
	// => �ν��Ͻ��� ������� Ŭ������ �̿��Ͽ� �޼ҵ� ȣ�� ����
	
	public static int getTotal() {
		return total; // ���л��� ����
	}

	public static void setTotal(int total) {
		Student.total = total; // ���� 
	}
}
