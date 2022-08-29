package com.myclass101.study.ch07.forth;

import java.util.Arrays;

public class Add {

	//field
	
	int a = 1;
	int b = 2;
	int c = 3;
	
	int sum = 0;
	
	
	//method 1
	
	public void array(String[] args) {
		int[] array = {a, b, c};
	
		Arrays.sort(array);
	
		for(int i = 0; i < array.length; i++) {
			System.out.print("[" + array[i] + "] ");
		}
	}
	
	
	//method 2
	
		public int sum (int a, int b, int c) {
				
				return (a*b)+c;
		}

	
}
