package com.myclass101.study.ch02;

public class CharExample {

	public static void main(String[] args) {

		// char c1 = 'A';
		// String c2 = "A"; 
		// char에 "" 쓰명 안됨, ""쓰고 싶으면 String으로 바꿔줘야 함
		
		
		//char c3 ="";
		
		
		
		char c1 = 'A'; //문자를 저장
		char c2 = 65; // 십진수로 저장
		char c3 = '\u0041'; // 16진수로 저장
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		int unicode = c1;
		System.out.println(unicode);
		
		
		int unicode2 = c4;
		System.out.println(unicode2);
	}

}
