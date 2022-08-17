package com.myclass101.study.ch05;

public class ArrayCreatByValueNewExample {

	public static void main(String[] args) {
		
		// new int를 사용하기 위해서는 index를 반드시 써야 한다!
		
		// int[] b = new int[30];
		// int[] b;
		// b= new int[30];
		
		

		int[] arr1 = new int[3];
		
		int[] arr2;
		arr2 = new int[5];
		
		arr1[0] = 77;
		arr1[2] = 55;
		System.out.println("arr1[0]: " + arr1[0]);
		System.out.println("arr1[2]: " + arr1[2]);
	}

}
