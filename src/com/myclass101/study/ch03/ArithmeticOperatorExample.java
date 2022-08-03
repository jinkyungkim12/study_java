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
		
		int a1 = 5;
		int a2 = 3;
		int a3 = 8;
		int a4 = 49;
		
		int b1 = 5;
		double b2 = 3.25;
		int b3 = 11;
		int b4 = 6;
		int b5 = 12;
		int b6 = 17;
		
		
		
		double ResultValue1 = (double) a1 / a2;
		double ResultValue2 = (double) a1 / a3;
		double ResultValue3 = (double) ResultValue1 - ResultValue2;
		double ResultValue4 = (double) a4 / a1;
		double ResultValue5 = (double) ResultValue3 * ResultValue4;
		System.out.println("ResultValue5:" + ResultValue5);
		
		
		double RV1 = (double) b3 / b4;
		double RV2 = (double) b2 - RV1;
		double RV3 = (double) b5 / b6;
		double RV4 = (double) RV2 * RV3;
		double RV5 = (double) b1 - RV4;
		System.out.println("RV5: " + RV5);
		
		
		
		
		double c1 = (double) 5 / 3;
		double c2 = (double) 5 / 8;
		double c3 = (double) 49 / 5;
		
		double CV1 = (double) c1 - c2;
		double CV2 = (double) CV1 * c3;
		System.out.println("CV2: " + CV2);
		
		double d1 = 5;
		double d2 = 3.25;
		double d3 = (double) 11 / 6;
		double d4 = (double) 12 / 17;
		
		double DV1 = (double) d2 - d3;
		double DV2 = (double) DV1 * d4;
		double DV3 = (double) d1 -  DV2;
		System.out.println("DV3: " + DV3);
		
		
	}

}
