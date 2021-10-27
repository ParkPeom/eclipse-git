package OOP_10_26_�ٽø����;

public class Student {
	
	private int num;
	private String name;
	private int kor,eng,tot;
	
	
	private static int total;

	public Student() {}

	public Student(int num, String name, int kor, int eng) {
		super();
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	
	
		//������ ����Ͽ� �ʵ忡 �����ϴ� ��� �ۼ� - �޼ҵ� ȣ��
		// => �ڵ��� �ߺ��� �ּ�ȭ �Ͽ� ���������� ȿ���� ����
		//tot=kor+eng;
		calcTot(); // ��ü�� �ϳ��� �����ɋ����� �� �޼��尡 ����Ǹ鼭
				   // ������ ������ 
	
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
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	// �� ���� ��ȯ 
	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot; // 2
	}
	
	// ������ ����Ͽ� �ʵ忡 �����ϴ� �޼���
	// �ν��Ͻ� ������ ������  
	/*
	public void calcTot() {
		tot = kor + eng;
	}
	 */
	
	//����ȭ ó���� �޼���  : Ŭ���� ���ο����� ȣ���Ͽ� ����ϴ� �޼��� - �ý��� �޼���
	private void calcTot() {
		tot = kor + eng; // 1
	}
	
	// �ʵ尪�� ����ϴ� �޼���
	public void display() {
		System.out.println(name +"[" + num + "]�� ���� >> ");
		System.out.println("���� = " + kor + " ���� = " + eng + " ���� " + tot);
	}
	
	//���� �޼ҵ�(Static Method) : this �Ű������� �������� �ʴ� �޼ҵ�
	// => this �Ű������� �����Ƿ� �ν��Ͻ� �ʵ� ���� �Ұ���
	// => ���� �ʵ�� �����Ͽ� ��� ����
	// => �ν��Ͻ��� ������� Ŭ������ �̿��Ͽ� �޼ҵ� ȣ�� ����
	
	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Student.total = total; // ���������� ���� ���� 
	}

}