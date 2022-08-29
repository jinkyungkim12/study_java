package com.myclass101.study.ch07.forth;

public class AddSon extends Add {

	
	//field
	
		int a = 1;
		int b = 2;
		int c = 3;
	
	
	// overrilde
	
	@Override
	public int sum (int a, int b, int c) {
		
		return (a*b)+c +10;
	}
	
}
