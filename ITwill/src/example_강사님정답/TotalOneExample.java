package example_���������;

import java.util.Scanner;

//Ű����� �������� 5�� �Է¹޾� �հ踦 ����Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
//ex) 1��° ������ �Է� >> 10
//  2��° ������ �Է� >> 20
//  3��° ������ �Է� >> 30
//  4��° ������ �Է� >> 40
//  5��° ������ �Է� >> 50
//  [���]�հ� = 150

public class TotalOneExample {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		int tot=0;
		for(int i=1;i<=5;i++) {
			System.out.print(i+"��° ������ �Է� >> ");
			int num=scanner.nextInt();
			tot+=num;
		}
		System.out.println("[���]�հ� = "+tot);
		scanner.close();
	}
}
