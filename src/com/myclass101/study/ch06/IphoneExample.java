package com.myclass101.study.ch06;

public class IphoneExample {

	public static void main(String[] args) {

		Iphone iphone = new Iphone();
		
		
		System.out.println("iphone.name: " + iphone.name);
		System.out.println("현재 나의 아이폰: " + iphone.name2[2]);
		
		iphone.pr();
		
		System.out.println("----------------------------");
		
		Car car = new Car();
		
		System.out.println("car.name: " + car.name);
		
		
		Handbag handbag = new Handbag();
		
		System.out.println("handbag.name: " +handbag.name);
	}

}
