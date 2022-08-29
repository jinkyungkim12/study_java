package com.myclass101.study.ch07.exc;

import java.util.Arrays;

public class Add {

	//field
		
	int sum = 0;
	int [] arr = new int[3];
	
	//method 1
	

	public void array(int arr[])  {
        
        for (int i=0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
            	if(arr[i] < arr[j]) {
            		int tmp = arr[i];
            		arr[i] = arr[j];
            		arr[j] = tmp;
            	}
            }
        	
        }
    }
	
	
	public void printArr(int arr[]) {
		for (int i=0; i<arr.length; i++) {
			System.out.print("["+ arr[i] +"]");
		}
		
		System.out.println(" ");
	}
	
	
	
	//method 2
	
		public int sum (int arr[]) {
			
			sum = (arr[0]*arr[1]) + arr[2];
			
				return sum;
		}

	
}
