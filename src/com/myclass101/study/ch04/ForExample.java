package com.myclass101.study.ch04;

public class ForExample {

	public static void main(String[] args) {

		
	//		**********
	//		**********
	//		**********
	//		**********
	//		**********
	//		출력하는 프로그램을 만드시요
			
			
	//		**********
	//		*        *
	//		*        *
	//		*        *
	//		**********
	//		출력하는 프로그램을 만드시요
			
			
	//		1
	//		12
	//		123
	//		1234
	//		12345
	//		123456
	//		1234567
	//		12345678
	//		123456789
	//		1 3 5 7 90
	//		출력하는 프로그램을 만드시요


		
		//1번 문제
		
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++){
			System.out.print("*");
		}
		System.out.println("*");
		 if(i==5) {
			 break;
		 }
		}
		
		System.out.println("------------------");

		
		//2번 문제
		
				
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++){
			if(i>1 && i<5 && j>1 && j<=9){
				System.out.print(" ");
			}else {
				System.out.print("*");
			}
		}
		System.out.println(" ");
		}
		
		System.out.println("------------------");
		
		// 3번 문제
				
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				if(i==10 && j % 2 == 0){
					if(j==10) {
						System.out.println("0");
					}
					System.out.print(" ");
				} else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
		
		System.out.println("------------------");
		
		for(int i=1; i<=10; i++) {
			if(i==10) {
				for(int j=1; j<=i-1; j++) {
					if(j%2==1) {
						System.out.print(j);
					} else {
						System.out.print(" ");
					}
				}
				System.out.println("0");
			} else {
				for(int j=1; j<=i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
	}

}
