package array;

public class ArrayExample {
	public static void main(String[] args) {
		int[] age = {17,22,36,57,60,43,23,14,29,44,52,69,51,39,33,11};
		int[] age2 = new int[6];
			
		int sum = 0;
		int average = 0;
		
		for(int i = 0; i < age.length; i++ ) {
			sum += age[i];
			average = sum / age.length;
		}
		System.out.println("��ճ��� : " + average);
		System.out.println("============================");
		// �迭�� ����� ������� ���̸� ���ɺ��� �����Ͽ� �ο����� ����Ͽ� ����ϼ���
		// 10�� - 3��
		// 20�� - 4��
		// ....
		// 60�� - 2��	
		int[] count = new int[7];
		int agede;
		for(int i = 0; i < age.length; i++) {
				agede = age[i] / 10;
				count[agede]++;
		}
			for(int i = 0; i < 7; i++) {
				System.out.println(i * 10 +"�� - " + count[i] + "��");
			}			
	}
}