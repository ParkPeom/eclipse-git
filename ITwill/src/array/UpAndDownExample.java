package array;

import java.util.Scanner;

//��ǻ�ͷκ��� �������� ���� �������� Ű����� �Է��Ͽ� ���ߴ� ���α׷��� �ۼ��ϼ���.
//=> 1~100 ������ ���� �������� �����޵��� �ۼ�
//=> �������� ���� �� �ִ� ��ȸ�� 10���� �����ǵ��� �ۼ�
//=> Ű���� �Է°��� 1~100 ������ �ƴ� ��� �޼��� ��� �� ���Է�
//=> �������� �Է°��� ���� ��� �Է� Ƚ�� ��� �� ���α׷� ����
//=> �������� �Է°��� �ٸ� ��� "ū�� �Է�" �Ǵ� "������ �Է�" ������ �޼��� ���
//=> �������� 10�� �ȿ� ������ ���� ��� �������� ��µǵ��� �ۼ�
public class UpAndDownExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int chance = 10;
		int nansu = (int)(Math.random()*100)+1;
		System.out.println("nansu �̸� ���� " + nansu);
	while(true) {
			System.out.println("���� �Է��ϼ��� > ");
			int num = sc.nextInt();
			if(!(1 <= num && num <= 100)) {
				System.out.println("1~100 ������ �ƴմϴ�.");
				continue;
			}
			if(nansu == num) {
				System.out.println("������ϴ�.");
				System.out.println("�� : " + nansu);
				break;
			} else if(num < nansu) {
				System.out.println("ū�� �Է�");
				chance--;
			} else {
				System.out.println("������ �Է�");
				chance--;
			}
			if(chance <= 0) {
				System.out.println("����ȸ����");
				System.out.println("�� : " + nansu);
				break;
			}
		}
	}
}

