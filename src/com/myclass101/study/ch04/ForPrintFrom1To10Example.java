package com.myclass101.study.ch04;

public class ForPrintFrom1To10Example {

	public static void main(String[] args) {

		// for문에는 i를 변수로 사용한다.
		
		int sum = 0;
		
		for (int i=0; i<=10; i++) {
			System.out.println(i);
			sum = sum + i; // sum = sum + i -> sum += i;
		}
	System.out.println("sum: " + sum);
		
		//1부터 10까지 더하는 프로그램 작성
		
			//int sum = 0;
			//for(int i=0; i<=10; i++) {
			//	System.out.println(i);
			//	sum += i;
			//}
			//System.out.println("sum: " + sum);
			
	}

}
