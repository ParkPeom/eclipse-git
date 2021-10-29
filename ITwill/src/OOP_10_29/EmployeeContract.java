package OOP_10_29;

// ����� ��� ����(�����ȣ,����̸�,���޿�)�� �����ϱ� ���� Ŭ���� 
public class EmployeeContract extends Employee {
	
	// ���޿��� �߰��ϸ� ��
	
	private int contractPay;
	
	public EmployeeContract() {	}

	public EmployeeContract(int empNo, String empName, int contractPay) {
		super(empNo, empName);
		this.contractPay = contractPay;
	}


	public int getContractPay() {
		return contractPay;
	}

	public void setContractPay(int contractPay) {
		this.contractPay = contractPay;
	}
	
	// �޿��� ����Ͽ� ��ȯ�ϴ� �޼���
	public int returnPay() {
		return contractPay;
	}

	@Override
	public int computePay() {
		return returnPay();
	}
	
}
