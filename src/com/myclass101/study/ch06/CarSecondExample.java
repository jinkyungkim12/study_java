package com.myclass101.study.ch06;

public class CarSecondExample {

	public static void main(String[] args) {

		CarSecond carsecond = new CarSecond();
		String color;
		
		CarSecond carsecond2 = new CarSecond("pink");
		CarSecond carsecond3 = new CarSecond("skyblue", 1200);
		
		String color2 = "yellow";
		
		System.out.println("carsecond.color: " + carsecond.color);
		System.out.println("carsecond.cc: " + carsecond.cc);
		
		System.out.println("carsecond2.color: " + carsecond2.color);
		System.out.println("carsecond2.cc: " + carsecond2.cc);
		
		System.out.println("carsecond3.color: " + carsecond3.color);
		System.out.println("carsecond3.cc: " + carsecond3.cc);
		
	}

}
