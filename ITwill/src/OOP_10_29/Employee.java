package OOP_10_29;

// �������(�����ȣ,����̸�)�� �����ϱ� ���� Ŭ���� (����� �Ӽ��� �θ�Ŭ������ �ش� )
// => �ν��Ͻ� ������ ������ �ƴ� ����� ������ Ŭ������ �ۼ� - �̷�Ŭ������ �߻�Ŭ������ �����ϴ°� ����
// �߻�Ŭ����(Abstract Class) : abstract �����ڸ� ����Ͽ� ����� Ŭ����
// => �ν��Ͻ��� �����Ҽ� ���� Ŭ����
public abstract class Employee {

	private int empNo;
	private String empName;
	// ����ʵ�(Constant Field) : �� ��� �ǹ� �ִ� �ܾ ����Ͽ� ǥ���ϱ� ���� ����
	// => public static final �����ڸ� �̿��Ͽ� �ʵ� ���� : �ʵ� ����� �ʱⰪ ���� 
	// ����ʵ�� ������ũ ǥ������� �����ϴ� ���� �����Ѵ�.
	// => final �����ڿ� ���� �ʵ尪 ���� �Ұ�
	private static final double INCETIVE_RATE = 1.5;
	
	public Employee() {}

	public Employee(int empNo, String empName) {
		super();
		this.empNo = empNo;
		this.empName = empName;
	}

	
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	/*
	// �޿��� ����Ͽ� ��ȯ�ϴ� �޼���
	public int computePay() {
		return 0;
	}
	*/
	/*
	// �޿��� ��ȯ�ϴ� �޼���
	// => �ڽ�Ŭ�������� �������̵� �����ϵ��� �ۼ��� �޼��� - �������̾���.
	// => �ڽ�Ŭ������ �ݵ�� �������̵� ���� ���ʿ� - �������̵� �������������� �θ� Ŭ������ �޼��尡 ȣ��ȴ�.
	public int computePay(){
		return 0;
	}
	*/
	// �޿��� ����Ͽ� ��ȯ�ϴ� �޼���
	// => �ڽ�Ŭ�������� ������ �������̵� �����ϵ��� �ۼ� - �߻�޼���� ����
	// �߻�޼���(Abstract Method) : abstract �����ڸ� ����Ͽ� �ۼ��� �޼��� 
	// => ����� �ۼ����� �ʴ� �ҿ����� �޼��� 
	// => �߻�޼��尡 �ϳ��� ����� Ŭ������ �ݵ�� �߻�Ŭ������ ���� 
	// => �ڽ�Ŭ�������� �ݵ�� �θ�Ŭ������ �޼��带 �ݵ�� �������̵� �����ϵ��� �������� �����ϴ� �޼���
	// �߻�Ŭ������ ��ӹ��� �ڽ�Ŭ������ ��� �߻� �޼��带 ������ �������̵� ����������Ѵ�. 
	public abstract int computePay();
	
	// �μ�Ƽ�긦 ����Ͽ� ��ȯ�ϴ� �޼���
	// => ��� ������� �޿��� 150%�� �μ�Ƽ��� ����
	
	// �ڽ�Ŭ�������� �޼��带 �������Ҽ����� �Ѵ�
	// => �ڽ� Ŭ�������� �������̵� �������� ���ϵ��� final �����ڷ� �޼��带 ���� 
	public final int computeIncentive() {
		// �߻�޼��带 ȣ���� ��� ������ ��ü ����ȯ�� ���� �ڽ� �ν��Ͻ� �޼��� ȣ��ȴ�. 
		// => �θ� Ŭ������ �޼��忡�� �ڽ� Ŭ������ �޼��� ȣ��
		
		// => ����ʵ带 ������ �ִٴ� ������ �ִ�. 
		int incentive = (int)(computePay() * INCETIVE_RATE) ;
		return incentive;
		
	}
}
