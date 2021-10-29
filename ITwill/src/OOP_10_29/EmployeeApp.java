package OOP_10_29;

// ��� �޿� ���� ���α׷� 

public class EmployeeApp {
	
	public static void main(String[] args) {
		// �߻�Ŭ������ �ν��Ͻ��� ������ ��� ���� �߻�
		// Employee employee = new Employee();
		
		// �߻�Ŭ����(�θ�Ŭ����)�� ���������� �����Ͽ� �ڽ� �ν��Ͻ� ���� ����
		Employee employee1 = new EmployeeRegular();
		Employee employee2 = new EmployeeTime();
		Employee employee3 = new EmployeeContract();
		
		Employee[] employArr = new Employee[5];
		
		employArr[0] = new EmployeeRegular(1000,"ȫ�浿",96000000);
		employArr[1] = new EmployeeTime(2000,"�Ӳ���",50000,150);
		employArr[2] = new EmployeeContract(3000,"����ġ",70000000);
		employArr[3] = new EmployeeTime(4000,"������",20000,100);
		employArr[4] = new EmployeeRegular(5000,"����",60000000);
		
		for (Employee employee : employArr) {
			System.out.println("��� ��ȣ = " + employee.getEmpNo());
			System.out.println("��� �̸� = " + employee.getEmpName());
			
			// �޿��� ��ȯ�޾� ��� 
			// => ����� ��ü ����ȯ�� �̿��Ͽ� �ڽ� �ν��Ͻ��� �޼��� ȣ��
			// => instanceof �����ڸ� �̿��Ͽ� �ڽ� Ŭ������ �����Ͽ� ��ü ����ȯ ����� �Ѵ�.
			/*
			if (employee instanceof EmployeeRegular ) {
				System.out.println(((EmployeeRegular)employee).computeSalary());
			} else if(employee instanceof EmployeeContract) {
				System.out.println(((EmployeeContract)employee).returnPay());
			} else if(employee instanceof EmployeeTime) {
				System.out.println(((EmployeeTime)employee).calcPay());
			}
			*/
			
			// �ڽ� Ŭ�������� �θ�Ŭ������ �޼��带 �������̵� �����Ͽ� ������ ��ü ����ȯ�� ����
			// �̿��Ͽ� �ڽ� �ν��Ͻ��� �޼��带 ȣ�� 
			System.out.println("��� �޿� = " + employee.computePay());
			System.out.println("�μ� Ƽ�� = " + employee.computeIncentive());
			
			System.out.println("==============================================");
		}
	}
}
