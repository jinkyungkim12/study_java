package com.myclass101.study.ch04;

public class IfExample2 {

	public static void main(String[] args) {
		
		int grade = 1;
		int price = 100000;
		double sale6=0.0;
		
		if(grade == 1) {
			int sale = (int) (price * 0.95);
			System.out.println("일반 등급 할인율은 5%, 정가: " + price +" 원," + " 할인가 : " + (int)sale +" 원 입니다.");
		}
		else if(grade == 2) {
			int sale2 = (int) (price * 0.9);
			System.out.println("브론즈 등급 할인율은 10%, 정가: " + price +" 원,"+ " 할인가 : " + (int)sale2+" 원 입니다.");
		}
		else if(grade == 3) {
			int sale3 = (int) (price * 0.85);
			System.out.println("실버 등급 할인율은 15%, 정가: " + price +" 원,"+ " 할인가 : " + (int)sale3 +" 원 입니다.");
		}
		else if(grade == 4) {
			int sale4 = (int) (price * 0.8);
			System.out.println("골드 등급 할인율은 20%, 정가: " + price +" 원,"+ " 할인가 : " + (int)sale4 +" 원 입니다.");
		}
		else if(grade == 5){
			int sale5 = (int) (price * 0.973);
			System.out.println("플래티넘 등급 할인율은 2.7%, 정가: " + price +" 원,"+ " 할인가 : " + (int)sale5 +" 원 입니다.");
		}
		else {
			System.out.println("1~5 까지의 grade만 가능합니다.");
		}
	}

}
