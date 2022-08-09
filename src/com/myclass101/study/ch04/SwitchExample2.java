package com.myclass101.study.ch04;

public class SwitchExample2 {

	public static void main(String[] args) {

		// 일반 5% 할인, 브론즈 10% 실버 15% 골드 20% 플래티넘 2.7%
		
		
		String grade = "골드";
		int price = 10000;
		
		
		switch (grade) {
		case "일반":
			 System.out.println("일반등급 회원은 5% 할인적용되어 " +(int) price * 0.95 + " 입니다.");
			 break;
			 
		case "브론즈":
			System.out.println("브론즈등급 회원은 10% 할인적용되어 " +(int) price * 0.90 + " 입니다.");
			 break;
		
		case "실버":
			System.out.println("실버등급 회원은 15% 할인적용되어 " +(int) price * 0.85 + " 입니다.");
			 break;
		
		case "골드":
			System.out.println("골드등급 회원은 20% 할인적용되어 " +(int) price * 0.80 + " 입니다.");
			 break;
			 
		case "플래티넘":
			System.out.println("플래티넘등급 회원은 2.7% 할인적용되어 " +(int) price * 0.973 + " 입니다.");
			 break;
			 
		default:
			 System.out.println("비회원은 할인 적용대상이 아닙니다.");
			 break; 
		}
		
		
		
	}

}
