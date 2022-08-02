package com.myclass101.study.ch02;

public class CastingExample {

	public static void main(String[] args) {

		// 강제 형변환: casting : (원하는 형) 변수명
		
		double doubleValue = 1234567;
		System.out.println("doubleValue: " + doubleValue);
		
		double doubleValue2 = 1234567891; // 자리수가 7자리 넘어가면 *10^n(E + 숫자)으로 표기됨
		System.out.println("doubleValue2: " + doubleValue2);
		
		// float 변수에 double 대입
		float floatValue = (float) doubleValue;
		System.out.println("floatValue: "+floatValue);
		
		
		// long <- float
		long longValue = (long) floatValue;
		System.out.println("longValue: " + longValue);
		
		//int <- long
		int intValue = (int) longValue;
		System.out.println("intValue: " + intValue);
		
		// short <- int
		short shortValue = (short) intValue;
		System.out.println("shortValue: " + shortValue);
		
		//byte <- short
		byte byteValue = (byte) shortValue;
		System.out.println("byteValue: " + byteValue);
		
		
		
		
		//int를 string으로 변환
		String StringValue = String.valueOf(intValue);
		System.out.println("StringValue: " + StringValue);
		
	
		//string을 int로 변환
		int intValue2 = Integer.parseInt(StringValue);
		System.out.println("intValue2: " + intValue2);
		
		// int: 원시 데이터 타입
		// integer: 참조형 데이터 타입
	}

}
