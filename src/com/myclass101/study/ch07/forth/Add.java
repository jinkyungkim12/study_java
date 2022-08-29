package com.myclass101.study.ch07.forth;

import java.util.Arrays;

public class Add {

	//field
	
	int a = 1;
	int b = 2;
	int c = 3;
	
//	int sum = 0;
	
	//method 1
	
	
	public static void main(String[] args)  {	
		int[] array = {1,2,3};
		
		Arrays.sort(array);
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.print("[" + array[i] + "] ");
		}
	}
	
	//method 2
	
		public int sum (int a, int b, int c) {
				
				return (a*b)+c;
			}
	
}
