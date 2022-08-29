package com.myclass101.study.ch07.exc;

public class AddExample {

	public static void main(String[] args) {

		
		Add add = new Add();
		
		AddSon addSon = new AddSon();
		
		int[] arr = {10, 50, 5};
		
		System.out.println("<정렬 전> ");
		add.printArr(arr);
		
		System.out.println("");
		
		System.out.println("<정렬 후> ");
		add.array(arr);
		add.printArr(arr);
		
		System.out.println("");
		
		System.out.println("부모 매서드2: " + add.sum(arr));
		System.out.println("자식 매서드: " +addSon.sum(arr));
		System.out.println("값 차이: " + ( add.sum(arr) - addSon.sum(arr)));
		
	}

}
