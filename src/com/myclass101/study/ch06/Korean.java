package com.myclass101.study.ch06;

public class Korean {

//	String name = "김진경";
//	String ssn = "123456-123456";
//	int age = 30;
//	
//	
//	Korean(){
//		
//	}
//	
//	Korean(String name, String ssn){
//		
//		this.name = name;
//		this.ssn = ssn;
//	}
//	
//	Korean(String name, int age){
//			
//		this.name = name;
//		this.age = age;
	
	
	//practice
	
	String name = "";
	String ssn = "";
	int age = 1;
	
	Korean(){
		
	}
	
	Korean(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
		}
	
	Korean(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	// static 추가 하면 Car car = new car (); 선언하지 않아도 된다!
	
	// static filed(객체)
	static String nationality = "대한민국";
	
	// static method(함수)
	static int staticTest (int a) {
		return a+10;
	}
	
	int staticTest2(int a) {
		return a-10;
	}
	
	int ttest() {
		Arithmetic arithmetic = new Arithmetic();
		
		arithmetic.aaa(12);
		
		return 1;
	}
	
	public void ttest2() {
//		Arithmetic arithmetic = new Arithmetic();
//		arithmetic.staticTest();
		
		Arithmetic.staticTest();
	}

	
}
	

