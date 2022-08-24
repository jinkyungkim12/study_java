package com.myclass101.study.ch06;

public class Board {

	
	String name = "김연아";
	int views = 3000;
	boolean useNY = true;
	
	Board(){
		
	}
	
	Board(String name){
		this.name = name;
	}

	Board(String name, int views){
		this.name = name;
		this.views = views;
	}
	
	Board(String name, boolean useNY){
		this.name = name;
		this.useNY = useNY;
	}
	
	Board(String name, int views, boolean useNY){
		this.name = name;
		this.views = views;
		this.useNY = useNY;
	}
	
	public void say() {
		System.out.println("name: "+name+"/ views: "+views+"/ useNY: "+useNY);
	}
	
}
