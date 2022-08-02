package com.myclass101.study.ch02;

public class OperationsPromotionExample {

	public static void main(String[] args) {

		//byte 변수 byteValue 선언하고 12로 초기화
		//byte 변수 byteValue2 선언하고 12로 초기화
		//byte 변수 byteValue3 선언하고 위 두 변수를 합 연산 수형
		// byteValue3 결과 출력
		
		
		byte byteValue = 12;
		

		byte byteValue2 = 12;
	
		//byte byteValue3 =  byteValue + byteValue2;
		int intValue =  byteValue + byteValue2;
		
		System.out.println(intValue);
		
		
		//short
		
		
		short shortValue = 12;
		short shortValue2 = 12;
		//short shortValue3 = shortValue + shortValue2;
		int shortValue3 = shortValue + shortValue2;
		System.out.println(shortValue3);
		
		//int
		
		int intValue2 = 12;
		int intValue21 = 12;
		int intValue3 = intValue2 + intValue21;
		System.out.println(intValue3);
		
		//long
		
		long longValue = 12;
		long longValue2 = 12;
		long longValue3 = longValue + longValue2;
		System.out.println(longValue3);
		
		//float
		
		float floatValue = 12;
		float floatValue2 = 12;
		float floatValue3 = floatValue + floatValue2;
		System.out.println(floatValue3);
		
		//double
		
		double doubleValue = 12;
		double doubleValue2 = 12;
		double doubleValue3 = doubleValue + doubleValue2;
		System.out.println(doubleValue3);
		
		
		//byte 변수 byteValue4를 선언하고 byteValue intValue 합 연산 수행
		//int 변수 intValue4를 선언하고 byteValue intValue 합 연산 수행
		//intvalue4 결과 출력
		// byte byteValue4 = byteValue + intValue;
		int intValue4 = byteValue + intValue;
		System.out.println(intValue4);
		
		
		//int 변수 intValue5를 선언하고 intValue doubleValue 합 연산 수행
		// double 변수 doubleValue4를 선언하고 intValue doubleValue 합 연산 수행
		//doubleValue4 결과 출력
		
		//int intValue5 = intValue + doubleValue;
		double doubleValue4 = intValue + doubleValue;
		System.out.println(doubleValue4);
		
		
		
		
	}

}
