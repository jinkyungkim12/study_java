package com.myclass101.study.ch04;

public class IfExample5 {

	public static void main(String[] args) {
		// int 타입 변수를 2개 선언하고
		// 두 정수가 주어졌을 때 사분면 어디에 해당되는지 출력하는 프로그램
		
		int x = 10;
		int y = -10;
		
		if (x>0 && y>0){ 
			System.out.println("1사분면 입니다.");
			
		} else if(x<0 && y>0){
			System.out.println("2사분면 입니다.");
			
		} else if(x<0 && y<0){
			System.out.println("3사분면 입니다.");
		
		} else if(x>0 && y<0){
			System.out.println("4사분면 입니다.");
		
		}else {
			System.out.println("(0,0)입니다.");
		
		}
	}

}
