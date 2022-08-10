package com.myclass101.study.ch04;

public class MultiplicationTable {

	public static void main(String[] args) {

		// 구구단 2단 출력 프로그램
		// 2 * i = 2;
		
		for(int i=1; i<=9; i++) {
		System.out.println("2 * " + i + " = " + (2 * i));
			
		}
		System.out.println("----------------------------");
		
		// 2단 ~ 9 단 까지 출력하는 프로그램 작성: 6줄 이상 되지 않	게
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
			System.out.println(i + " * " + j + " = " + (i*j) );
			}
		}

	}
}