package com.myclass101.study.ch06;

public class KoreanExample {

	public static void main(String[] args) {

		Korean k1 = new Korean("차은우", "970303-123456");
		System.out.println("k1.name: " + k1.name);
		System.out.println("k1.ssn: " + k1.ssn);
		
		
		Korean k2 = new Korean("김진경", 30);
		System.out.println("k2.name: " + k2.name);
		System.out.println("k2.age: " + k2.age);
	}

}
