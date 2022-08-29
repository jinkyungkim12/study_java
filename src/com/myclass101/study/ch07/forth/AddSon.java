package com.myclass101.study.ch07.forth;

public class AddSon extends Add {

	
	//field
	
	int sum = 0;
	
	// overrilde
	
	@Override
	public int sum (int arr[]) {
		
		sum = (arr[0] * arr[1]) + arr[2] +10;
		
		return sum;
	}
	
}
