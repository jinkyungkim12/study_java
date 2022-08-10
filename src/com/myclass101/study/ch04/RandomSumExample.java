package com.myclass101.study.ch04;

public class RandomSumExample {

	public static void main(String[] args) {

		//1~100 사이의 랜덤 정수 2개를 발생시켜서 두 수 사이의 합을 구하라
		
		//double min = 1.0;
		//double max = 100.0;
		//int random = (int) ((Math.random() * (max - min)) + min);
		//System.out.println(random);
		
		double min = 1;
		double max = 100;
		int random = (int) ((Math.random() * (max - min)) + min);
		int random2 = (int) ((Math.random() * (max - min)) + min);
		int sum=0;
		
		for(int i=random+1; i<random2; i++) {
		sum += i;
		} if(random2>random){
			System.out.println("random: "+ random + " random2: " + random2 + " sum = " + sum);
		} else {
			System.out.println("다시 돌리세요.");
		}
		
	}

}
