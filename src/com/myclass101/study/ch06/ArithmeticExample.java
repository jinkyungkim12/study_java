package com.myclass101.study.ch06;

public class ArithmeticExample {

	public static void main(String[] args) {

		Arithmetic arithmetic = new Arithmetic();
		
		int resultSum = arithmetic.sum(1,2);
		int resultMinus = arithmetic.minus(10,3);
		int resultMultiplication = arithmetic.multiplication(5,2);
		int resultDivision = arithmetic.division(10,2);
		int resultDivision2 = arithmetic.division2(10,3);
		
		
		arithmetic.say(resultSum);
		arithmetic.say(resultMinus);
		arithmetic.say(resultMultiplication);
		arithmetic.say(resultDivision);
		arithmetic.say(resultDivision2);
	}

}
