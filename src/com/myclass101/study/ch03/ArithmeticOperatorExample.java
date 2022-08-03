package com.myclass101.study.ch03;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {

		
//		int 변수 v1에 초기값 5
//		int 변수 v2에 초기값 2
		
//		int 변수 result1 에 + 연산 후 출력
//		int 변수 result2 에 - 연산 후 출력
//		int 변수 result3 에 * 연산 후 출력
//		int 변수 result4 에 / 연산 후 출력
//		int 변수 result5 에 % 연산 후 출력
	
		
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1: " +result1);
		
		int result2 = v1 - v2;
		System.out.println("result2: " +result2);
		
		int result3 = v1 * v2;
		System.out.println("result3: " +result3);
	
		int result4 = v1 / v2;
		System.out.println("result4: " +result4);
		
		int result5 = v1 % v2;
		System.out.println("result5: " +result5);
	
		
		
		// double 소숫점 계산 정확히 하기 위해서 (double)캐스팅 해줘야 함
		
		double result6 = v1 / v2;
		System.out.println("result6: " +result6);
		
		double result7 = (double) v1 / v2;
		System.out.println("result7: " +result7); 
		
		
		
		
		// 분수 계산
						
		double a1 = (double) 5 / 3;
		double a2 = (double) 5 / 8;
		double a3 = (double) 49 / 5;
		
		double V1 = (double) a1 - a2;
		double V2 = (double) V1 * a3;
		System.out.println("V2: " + V2);
		
		double b1 = 5;
		double b2 = 3.25;
		double b3 = (double) 11 / 6;
		double b4 = (double) 12 / 17;
		
		double V3 = (double) b2 - b3;
		double V4 = (double) V3 * b4;
		double V5 = (double) b1 -  V4;
		System.out.println("V5: " + V5);
		
		
	}

}
