package com.myclass101.study.ch07.forth;

public class AddSon extends Add {

	
	//field
	
	int sum = 0;
	
	// overrilde
	
	@Override
	public int sum (int array[]) {
		
		sum = (array[0] * array[1]) + array[2] +10;
		
		return sum;
	}
	
}
