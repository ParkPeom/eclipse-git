package array;

import java.util.ArrayList;
import java.util.List;

// �迭 : 1���� �迭 �Ǵ� ������ �迭(2���� �迭 , 3�����迭 ...)
// => 1���� �迭 : ���(Element) �� ����
// => ������ �迭 : �迭�� ���� >> 2���� �迭 - 1���� �迭�� ���� 

public class DoubleArrayApp {
	
	public static void main(String[] args) {
		
		// ���� ) �ڷ��� [][] �������� = new �ڷ���[][];
		// 1���� �迭�� 2�� , �� ���� 3�� 
		// => �� ���� : 1���� �迭�� ���� ǥ��
		// => �� ���� : 1���� �迭�� ��� ���� ǥ�� 
		int[][] num = new int[2][3];

		List arr = new ArrayList();
		
		System.out.println("num = " + num[0][0]);
		System.out.println("num = " + num[0][1]);
		System.out.println("num = " + num[0][2]);
		System.out.println("==================================");
		System.out.println("num = " + num[1][0]);
		System.out.println("num = " + num[1][1]);
		System.out.println("num = " + num[1][2]);
		System.out.println("==================================");

		
		for (int i = 0; i < num.length; i++) { // �� 1���� �迭�� ������ŭ �ݺ�ó�� 
			for (int j = 0; j < num[i].length; j++) { // �� 1���� �迭�� �����ϴ� ����� ������ŭ �ݺ�
				System.out.print(num[i][j] + "\t");	 
			}
		System.out.println();	
		}
		
		System.out.println("============================");
		int[][] su = new int[][] {{10,20,30},{40,50,60},{70,80,90}};
		
		for(int[] arr3 : su) { // 1���� �迭�� ����� �迭 ���� 
			for(int arr2 : arr3) { // 2���� �迭�� ����� �迭 ���� 
				System.out.print(arr2 + " \t");
			}
			System.out.println();
		}
		
		int[][] number = new int[3][]; // 1���� �迭�� ���� 2���� �迭 ���� 
									   // => 1���� �迭�� �ؽ��ڵ带 ������ �� �ִ� ���������� ����
		System.out.println("number = " + number[0]);
		System.out.println(number[1]);
		System.out.println(number[2]);
		
		// null �̸� �����Ҽ� ���� null ��
		
		// 2���� �迭�� ������ҿ� 1���� �迭�� �����Ͽ� 2���� �迭�� ���������� ������״� 
		// => 1���� �迭�� �����ϴ� ����� ������ �ٸ��� �Ͽ� �����ߴ� 
		number[0] = new int[3];
		number[1] = new int[2];
		number[2] = new int[4];
		
		number[0][0] = 10;
		number[0][1] = 20;
		number[0][2] = 30;

		number[1][0] = 40;
		number[1][1] = 50;
		
		number[2][0] = 60;
		number[2][1] = 70;
		number[2][2] = 80;
		number[2][3] = 90;
		
		int[][] array = {{2,3},{5,6,7},{1,2,5},{6,4}};
		
		for(int[] arr3 : number) { // 1���� �迭�� ����� �迭 ���� 
			for(int arr2 : arr3) { // 2���� �迭�� ����� �迭 ���� 
				System.out.print(arr2 + " \t");
			}
			System.out.println();
		}
		
		
		
	}
}
