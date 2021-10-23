package oop;

import java.util.Arrays;

// 배열 요소에 저장된 값을 오름차순 정렬하여 바꾸어 저장하고 출력 하는 프로그램을 작성하세요 
	
public class ArraySortApp {
	
	public static void main(String[] args) {
		int[] array = {30,50,10,40,20};
		int max = array[0];
		int min = array[0];
		
		System.out.println("정렬 전 >> ");
		
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
		System.out.println("정렬 후 >>"); 
		for(int num : array) {
			System.out.print(num +" ");
		}
	System.out.println();	

	// Arrays 클래스 : 배열에 대한 다양한 기능을 제공하는 메소드가 선언된 클래스
	
	// Arrays.toString(Object[] array)); : 배열을 제공받아 배열 모든 요소값을 문자열로 변환하여 반환
	
	System.out.println("정렬 전 >> " + Arrays.toString(array));
	
	Arrays.sort(array); // 배열을 제공받아 배열의 요소값들이 오르차순 정렬되어 저장 되도록 기능을 제공하는 메서드
	
	
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
