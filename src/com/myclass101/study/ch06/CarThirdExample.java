package com.myclass101.study.ch06;

public class CarThirdExample {

	public static void main(String[] args) {

		CarThird carThird = new CarThird();
		System.out.println("name: " + carThird.name);
		
		CarThird carThird2 = new CarThird("그랜저");
		System.out.println("name: " + carThird2.name);
		
		CarThird carThird3 = new CarThird("소나타",10000);
		System.out.println("name, cc: " + carThird3.name +" , "+ carThird3.cc);
		
		CarThird carThird4 = new CarThird("투싼",30000, "yellow");
		System.out.println("name, cc, color: " + carThird4.name +" , "+ carThird4.cc+" , "+carThird4.color);
	}

}
