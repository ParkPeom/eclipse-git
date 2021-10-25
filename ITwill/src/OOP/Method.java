package OOP;

/*
  2021-10-25 
  
 */

public class Method {

	// �Ű������� ���޹��� �������� Ȧ���� ¦���� �����Ͽ� ����� ��ȯ
	// Ȧ��(false) ¦��(true)
	
	boolean isOddEven(int num) {
		if(num%2==0) return false;
		else return true;
	}
	
	// ������ ����� ���� �޼��� ����� ��ȯ
	// => �޼����� ��ȯ���� ���� �ڷ����� ���� ��ȯ

	// return�� ���� �ϳ��� ��ȯ�Ҽ��ִµ�
	// �迭�� �̿��ϸ� ���� ������ ��ȯ �Ҽ��ִ�.
	// �迭�� ��ȯ�ϴ� �޼��� - �迭�� �ؽ��ڵ尡 ��ȯ��
	int[] returnArray() {
		int[] array = {10,20,30,40,50};
		return array; // ���������� ����� �迭�� �ؽ��ڵ� ��ȯ - �迭��ȯ 
		// return new int[]{10,20,30,40,50};
		// return {10,20,30,40,50} <- ���� �߻� 
	
	}
	
	// 3���� �Ű������� ���� ���޹޾� �հ踦 ����Ͽ� ��ȯ�ϴ� �޼���
	int sumOne(int num1,int num2,int num3) {
		return num1 + num2 + num3;
	}
	
	// �Ű������� �迭�� ���޹޾� �迭 ��� ���� �հ踦 ����Ͽ� ��ȯ�ϴ� �޼���
	// �迭�� �ؽ��ڵ尪�� ���޹��� 
	int sumTwo(int[] num) {
		int tot = 0;
		for(int temp : num) {
			tot += temp;
		}
		return tot;
	}
	
	// �Ű����� ���� ��ȣ(...)�� ����� �Ű������� ������ ��� ���� 0�� �̻� ���޹޾� �迭�������� ����� ����
	// ó���Ҷ��� ���� ������Ÿ���̹Ƿ� �迭�������� ó���Ҽ� �ִ�.
	int sumThree(int...num) {
		int tot = 0;
		for(int temp : num) {
			tot += temp;
		}
		return tot;
	}
	
	public static void main(String[] args) {
		Method method = new Method();
		boolean result = new Method().isOddEven(10);
		System.out.println(result);
		// if������ ���ǽ� ��� ������ ��ȯ�ϴ� �޼��带 ȣ���Ҽ��ִ�.
		// (�� ����� ���� ���� ����.)
		if(method.isOddEven(11)) {
			System.out.println("�Ű������� ¦���Դϴ�.");
		} else {
			System.out.println("�Ű������� Ȧ���Դϴ�.");
		}
		System.out.println("======================");
		// ���������� �޼����� ��ȯ��(�迭�� �ؽ��ڵ�) ����
		int[] num = method.returnArray();
		System.out.println("��ȯ�� ��Ұ� >> " );
		
		for(int temp : num) {
			System.out.print(temp + " ");
		}
		
		System.out.println("======================");
		
		// �޼����� �Ű������� ���� ���������� ���޵��� ���� ��� ������ �߻�
//		System.out.println("�հ� = " + method.sumOne(10, 20, 30 , 40 , 50));
		System.out.println("�հ� = " + method.sumOne(10, 20, 30));
		int[] numarray = {10,20,30};
		System.out.println("�հ�� : " + method.sumTwo(numarray));
		System.out.println("�հ�� : " + method.sumTwo(new int[] {10,20,30}));
		
		System.out.println("�հ� = " + method.sumThree(numarray)); // ���� �������� �ʾƵ� ���� X
		System.out.println("�հ� = " + method.sumThree(10,20,30)); 
		System.out.println("�հ� = " + method.sumThree(10)); 
		System.out.println("�հ� = " + method.sumThree(10,20,30,40,50)); 
	}
}
