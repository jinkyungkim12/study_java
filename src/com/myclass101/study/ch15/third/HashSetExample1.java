package com.myclass101.study.ch15.third;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class HashSetExample1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		// 최상위 Iterator
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: " + set.size());
		
		for(String element : set) {
			System.out.println("\t" + element);
		}
		
		// 구슬주머니 안에 있는 것 싹다 지우는 것
		set.clear();
		
		if(set.isEmpty()) {
			System.out.println("비어 있음"); 
		}
	}

}
