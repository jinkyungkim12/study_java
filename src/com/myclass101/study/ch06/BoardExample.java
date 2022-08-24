package com.myclass101.study.ch06;

public class BoardExample {

	public static void main(String[] args) {

		Board board = new Board();
		System.out.println("name: " + board.name);
		
		Board board2 = new Board();
		System.out.println("name, views: " + board2.name + " , " + board2.views);
		
		Board board3 = new Board();
		System.out.println("name, useNY: " + board3.name + " , " + board3.useNY);
		
		Board board4 = new Board();
		System.out.println("name, views, useNY: " + board4.name + " , " + board4.views + " , " + board4.useNY);
		
		
		System.out.println("-----------------------------------------");
		
		Board board5 = new Board("차은우", 10000, false);
		System.out.println("name, views, useNY: " + board5.name + " , " + board5.views + " , " + board5.useNY);
		
	}

}
