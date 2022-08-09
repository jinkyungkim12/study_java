package com.myclass101.study.ch04;

public class IfExample6 {

	public static void main(String[] args) {
		
		//int 타입 변수 3개 선언
		// 세 정수 중에서 최대값, 최솟값을 구하는 프로그램
		
		
		
		
		int V1 = 7;
		int V2 = 7;
		int V3 = 7;
		
		if (V1!=V2 && V2!=V3 && V3!= V1) {
			
			if(V1>V2 && V1>V3) {
				System.out.println("MAX: V1");
			} else if (V2>V1 && V2>V3) {
				System.out.println("MAX: V2");
			} else {
				System.out.println("MAX: V1");
			}
			
				
			 if(V1 < V2 && V1 < V3) {
				System.out.println("MIN: V1");
			} else if (V2<V1 && V2<V3) {
				System.out.println("MIN: V2");
			} else {
				System.out.println("MIN: V3");
			} 
		
		} else {
			System.out.println("적어도 2개의 동일한 정수가 존배합니다. 수정해주세요.");
		}
		
		
	}

}
