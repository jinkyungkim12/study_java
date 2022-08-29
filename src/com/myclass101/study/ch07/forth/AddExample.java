package com.myclass101.study.ch07.forth;

public class AddExample {

	public static void main(String[] args) {

		
		Add add = new Add();
		System.out.println("method2 of Add: " + add.sum(7, 1, 5));
		
		AddSon addSon = new AddSon();
		System.out.println("method of AddSon: " + addSon.sum(7, 1, 5));
		
		System.out.println("difference: ");
	
	}

}
