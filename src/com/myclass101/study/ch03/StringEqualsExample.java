package com.myclass101.study.ch03;

public class StringEqualsExample {

	public static void main(String[] args) {

		String str1 = "장원영";
		String str2 = "장원영";
		String str3 = new String("장원영");
		
		boolean result1 = (str1 == str2);
		System.out.println("result1: " + result1); // true
		
		
		boolean result2 = (str1 == str3);
		System.out.println("result2: " + result2); // false
		
		System.out.println("str1.equals(str2): " + str1.equals(str2)); // == (x) true
		System.out.println("str1.equals(str3): " + str1.equals(str3)); // == (x) true
		
		
		// 문자열이 같은지 아닌지 비교할 때는 .equals라는 함수를 사용해야 한다!
		// 문자 자체 비교시 .equals 사용한다! 
		// String 참조형 datatype / String는 객체이기 때문에 데이터타입, 함수를 같이 가지고 있다.
		// .함수() 이렇게 사용하면 된다!
		
		
		
		
		
	}

}
