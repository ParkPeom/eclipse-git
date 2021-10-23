package oop;

import java.util.Arrays;

// �迭 ��ҿ� ����� ���� �������� �����Ͽ� �ٲپ� �����ϰ� ��� �ϴ� ���α׷��� �ۼ��ϼ��� 
	
public class ArraySortApp {
	
	public static void main(String[] args) {
		int[] array = {30,50,10,40,20};
		int max = array[0];
		int min = array[0];
		
		System.out.println("���� �� >> ");
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] +" \t");
		}
		
		System.out.println("===============");
		
		System.out.println("===================");
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("���� �� >>"); 
		for(int num : array) {
			System.out.print(num +" ");
		}
	System.out.println();	

	// Arrays Ŭ���� : �迭�� ���� �پ��� ����� �����ϴ� �޼ҵ尡 ����� Ŭ����
	
	// Arrays.toString(Object[] array)); : �迭�� �����޾� �迭 ��� ��Ұ��� ���ڿ��� ��ȯ�Ͽ� ��ȯ
	
	System.out.println("���� �� >> " + Arrays.toString(array));
	
	Arrays.sort(array); // �迭�� �����޾� �迭�� ��Ұ����� �������� ���ĵǾ� ���� �ǵ��� ����� �����ϴ� �޼���
	
	
	int[] arr1 = {1,2,3,4,5};
	int[] arr2 = {1,2,3,4,5};
	
	for (int i = 0; i < arr2.length; i++) {
			arr1[i] += 10;
		}
	for (int e : arr2) {
		e += 10;
	}
	}
}
