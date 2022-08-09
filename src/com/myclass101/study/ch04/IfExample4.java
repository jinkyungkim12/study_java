package com.myclass101.study.ch04;

public class IfExample4 {

	public static void main(String[] args) {
		// int 타입의 변수를 1개 선언하고 
		// 짝수인지 홀수인지 판단하여 결과를 출력하는 프로그램을 작성하시오. 
		
		
		int V1=4;
		
		if(V1 != 0) {
			if(V1 % 2 == 0){
				System.out.println("V1은 짝수입니다.");
				
			} else{
				System.out.println("V1은 홀수입니다. ");
				
			}
		} else {
			 // V1==0
			System.out.println("0은 홀수, 짝수를 판단할 수 없습니다. ");
		}
		
		
	}

}
