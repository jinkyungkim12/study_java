package com.myclass101.study.ch02;

public class PromotionExample {

	public static void main(String[] args) {

		// 자동타입변환 : promotion
		// 강제형전환: casting
		//	작은 형이 큰 형으로 변환은 문제가 발생하지 않는다.
		//	큰 형이 작은 형으로 변환이 되려면 문제가 생기거나 변환이 이루어져도 데이터 손실이 발생한다.
	
		// byte < short < int < long < float < double
		
		byte byteValue = 10;
		System.out.println("byteValue: " + byteValue +"입니다!");
		
		short shortvalue2 = byteValue;
		System.out.println("shortvalue2: " + byteValue);
		
		// 타입변환: 작은 => 큰 
	//	int intValue = byteValue;
	//	System.out.println("intValue: " + intValue);
	
	//	int intValue2 = 1234567890;
	//	System.out.println("intValue: " + intValue);
		
	//	int byteValue2 = intValue2;
	//	System.out.println("byteValue2: " + byteValue2 + "입니다!");
		
		
		//int intValue3 = 200;
		//System.out.println("intValue3: " +intValue3 + "입니다!");
		
		//double doubleValue = intValue3;
		//System.out.println("doubleValue: " +doubleValue + "입니다!");
		
		
		// short에 byte 대입 후 출력
		short shortValue = byteValue;
		System.out.println("shortvalue: " + byteValue + "입니다!");
		
		//int에 short 대입 후 출력
		
		int intValue= shortValue;
		System.out.println("intValue: " + shortValue + "입니다!");
		
		// long에 int 대입 후 출력
		
		long longValue= intValue;
		System.out.println("longvalue: " + intValue + "입니다!");
		
		// float에 long 대입 후 출력
		
		float floatValue= longValue;
		System.out.println("floatValue: " + longValue + "입니다!");
		
		// double에 float 대입 후 출력
		double doubleValue2= floatValue;
		System.out.println("doubleValue2: " + floatValue + "입니다!");
		
		
 	}

}
