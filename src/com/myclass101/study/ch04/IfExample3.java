package com.myclass101.study.ch04;

public class IfExample3 {

	public static void main(String[] args) {

		// int 타입의 변수를 2개 선언하고 
		// 두 정수가 주어졌을 때 두 정수를 비교하고
		// 크기 비교 결과를 나타내는 프로그램을 작성하시오
		
		int V1 = 10;
		int V2 = 20;
		
		if(V2>V1){
			System.out.println("V2가 V1보다 큽니다.");
		}
		else if(V1>V2){
			System.out.println("V1가 V2보다 큽니다.");
		}
		else {
			System.out.println("V1와 V2가 같다.");
		}
		
	}

}
