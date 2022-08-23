package com.myclass101.study.ch06;

public class HyundaeCarExample {

	public static void main(String[] args) {

		
		HyundaeCar hyundaeCar = new HyundaeCar();
		
		for (int i=0; i<hyundaeCar.name.length; i++) {
			System.out.println("hyundaeCar: " + hyundaeCar.name[i]);
		}
		
	}

}
