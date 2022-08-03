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
		
		// 첫 번째 문제
						
		double a1 = (double) 5 / 3;
		double a2 = (double) 5 / 8;
		double a3 = (double) 49 / 5;
		
		double V1 = (double) a1 - a2;
		double V2 = (double) V1 * a3;
		System.out.println("V2: " + V2);
		
		
		// 두 번째 문제
		
		double b1 = 5;
		double b2 = 3.25;
		double b3 = (double) 11 / 6;
		double b4 = (double) 12 / 17;
		
		double V3 = (double) b2 - b3;
		double V4 = (double) V3 * b4;
		double V5 = (double) b1 -  V4;
		System.out.println("V5: " + V5);
		
		
		
		int c1 = 1;
		int c2 = 2;
		int c3 = 3;
		int c4 = 4;
		int c5 = 5;
		int c6 = 6;
		int c7 = 7;
		int c8 = 8;
		int c9 = 9;

		
		int CV1 = c8 + c7 + c5;
		System.out.println("CV1: " + CV1);
		
		int CV2 = c1 + c9 + c5;
		System.out.println("CV2: " + CV2);
		
		int CV3 = c5 + c6 + c6;
		System.out.println("CV3: " + CV3);
		
		int CV4 = c4 + c7 + c1;
		System.out.println("CV4: " + CV4);
		
		int CV5 = c7 + c5 + c5;
		System.out.println("CV5: " + CV5);
		
		
		// main 과 class 영역 사이에 새로운 함수를 적어야 한다.
		
		//sum(8,7,5);
		//sum(1,9,5);
		//sum(5,6,6);
		//sum(4,7,1);
		//sum(7,5,5);
		
		
		
		avg("홍길동", 60, 70, 85, 90, 45);
		avg("박말순", 50, 75, 70, 60, 70);
		avg("고장난", 55, 60, 64, 58, 90);
		avg("도롱뇽", 80, 70, 63, 88, 78);
		
				
	}

	private static void avg(String name, int english, int math, int physics, int music, int athletic) {
		System.out.println(name + "의 평균: " + (double)(english+math+physics+music+athletic)/5);
		
	}

	//private static void sum(int a, int b, int c) {
			//System.out.println(a + " + " + b + " + " + c + " = " + (a+b+c));
	//}

}
