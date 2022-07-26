package com.myclass101.study.ch15.first;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("장원영", "전지현", "장동건");
		
		// 향상된 for문
		for(String name: list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		
		// 향상된 for문
		for(int value : list2) {
			System.out.println(value);
		}
	}

}
