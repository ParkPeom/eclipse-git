package oop;

// ������ ������ Ŭ���� - �ν��Ͻ�(��ü) ������ ���� Ŭ����
public class Method {
	// �⺻�����ڰ� �̹� �ִ�.
	
	// Ŭ������ �����ϸ� Ŭ���� ���ο��� �Ű������� ���� �⺻ ������(Default Constructor) �� ����� ������ ó���ȴ�.
	// ����� ������ ó��
	
	// �޼��� ����
	void displayOne() {
		System.out.println("Method Ŭ������ displayOne() �޼��� ȣ��");
	}
	
	void displayTwo() {
		System.out.println("Method Ŭ������ displayTwo() �޼��� ȣ��");
	}
	
	void printOne() {
		int tot = 0;
		for(int i = 0; i <= 100; i++) {
			tot += i;
		}
		System.out.println(" 1 ~ 100 ������ �������� �հ� = " + tot);
	}
	
	// �޼��� ȣ��� �Ű������� ���� ���������� ���޵Ǿ� ����Ǿ�߸� �޼����� ��� ���� 
	// => �Ű������� ���� ������� ���� ��� �޼��� ȣ�� �Ұ��� - ���� �߻�
	
	void printTwo(int num) {
		// �Ű������� ����� ���� ���� ��ȿ�� �˻縦 ���ټ� �ִ�.
		if(num <= 0 ) { // ���������� ���� �Ű������� ����� ���
			System.out.println("[����]�Ű��������� 0���� ū ���� ����Ǿ�� �մϴ�.");
			return ; // �޼��� ���� ���� 
		}
		
		int tot = 0;
		for (int i = 0; i <= num; i++) {
			tot += i;
		}
		System.out.println("1~"+num+"������ �հ� " + tot);
	}
	
	void printThree(int num1 , int num2) {
//		if(num1 > num2) { // ���������� ���� �Ű������� ����Ȱ��
//			System.out.println("[����]�Ű��������� 0���� ū ���� ����Ǿ�� �մϴ�.");
//			return;
//		}
		// ����ڸ� ���� ���ݴ� ������ �ְ� ó���� �ش�. 
		if(num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		int tot = 0;
		for (int i = num1; i <= num2; i++) {
			tot += i;
		}
		// �޼��忡�� ������� ���ϴ°� ���� . 
		// ��� ��� ��ȯ���� ������ִ°� ����. 
		System.out.println(num1 + "~" + num2 + "������ �������� �հ� = " + tot);
	}
	int returnTot(int num1 , int num2) {
		if(num1>num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		int tot= 0;
		for (int i = num1; i <= num2; i++) {
			tot +=i;
		}
		// ������ ����� ���� �޼��� ����� ��ȯ
		// => �޼����� ��ȯ���� ���� �ڷ����� ���� ��ȯ
		return tot;
	}
}
