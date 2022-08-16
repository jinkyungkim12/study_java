package com.myclass101.study.ch04;

public class RandomSumExample2 {

	public static void main(String[] args) {

		//1~100 사이의 랜덤 정수 2개를 발생시켜서 두 수 사이의 합을 구하라
		
						
				double num1 = 1.0;
				double num2 = 100.0;
				
				int max = 0; int min = 0; int sum = 0;
				
				int random1 = (int) ((Math.random() * (num2 - num1)) + num1);
				int random2 = (int) ((Math.random() * (num2 - num1)) + num1);

				if(random2 > random1) {
					max = random2;
					min = random1;
					
				} else{
					max = random1;
					min = random2;
				}
				
				System.out.println("max: " + max + " / " + "min: " + min);
				
				for(int i = min; i<=max; i++) {
					sum += i;
					System.out.println(i + ":" + sum);
				}
				
				System.out.println("total sum: " + sum);
				
	}  

}
