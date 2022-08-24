package com.myclass101.study.ch06;

public class BoardExample {

	public static void main(String[] args) {

		Board board = new Board();
		Board board1 = new Board("김진경");
		Board board2 = new Board("송강", 5000);
		Board board3 = new Board("차은우", false);
		Board board4 = new Board("박보검", 10000, false);

		board.say();
		board1.say();
		board2.say();
		board3.say();
		board4.say();
		
	}

}
