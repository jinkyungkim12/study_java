package com.myclass101.study.ch05;

public class ArrayCreatByValueListExample1 {

	public static void main(String[] args) {

		// 선언하는 방법 2가지
		
		int[] scoreEnglish;
		int scoreMath[];
		
		// 데이터 넣는 법
		int[] scoreChemistry = {88,99,45,86,34};
		
		// 문자열, 최초데이터 넣는 것(객체생성, 초기화)
		
		String[] name = {"장원영","장동건","고소영"};
		
		// 데이터 불러오기 변수 + index
		
		System.out.println("누굴까?: " + name[2]);
		
		System.out.println("명지님 화학 성적: " + scoreChemistry[0]);
		
		
		// 화학성적 평균값
		
		double sum=0;
		double avg=0;
		
		for(int i=0; i<=4; i++) {
			  sum += scoreChemistry[i];
		}
		
		avg = sum/5;
		System.out.println("화학 평균: " + avg);
		
		// System.out.println(scoreChemistry.length); 객체 수(길이)를 알기 어려울때(끝을 모를)
		
		
//		 double sum=0; 
//		 double avg=0;
		  
//		 for(int i=0; i<=scoreChemistry.length; i++) { 
//		  		sum += scoreChemistry[i]; 
//		 }
		 
//		 avg = sum/scoreChemistry.length; 
//		 System.out.println("화학 평균: " + avg);
		 
		
	}

}
