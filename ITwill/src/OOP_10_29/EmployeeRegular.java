package OOP_10_29;

// ������ ��� ���� (�����ȣ,����̸�,����) ���� �ϱ� ���� Ŭ����  
// => Employee Ŭ������ ��ӹ޾� �ۼ�
public class EmployeeRegular extends Employee {

	// ������ 
	private int annualSalary;
	
	public EmployeeRegular() {}

	// �θ� �����ڵ� ȣ��
	public EmployeeRegular(int empNo, String empName, int annualSalary) {
		super(empNo, empName);
		this.annualSalary = annualSalary;
	}

	public int getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	// �޿��� ����Ͽ� ��ȯ�ϴ� �޼��� 
	public int computeSalary() {
		return annualSalary/12;
	}

	@Override
	public int computePay() {
		return computeSalary() / 12;
	}
	
	// �μ�Ƽ�� �޼��带  �������̵� �Ҽ����� �����ʿ䰡 �ִ�. 
	// final �����ڸ� ����� �޼��带 �������̵� ������ ��� ���� �߻�
//	@Override
//	public int computeIncentive() {
//		return 1_000_000_000;
//	}
}
