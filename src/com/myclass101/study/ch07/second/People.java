package com.myclass101.study.ch07.second;

public class People {

	public String name;
	public String ssn;
	
	
	// 부모에 생성자가 존재한다.
	// 명시적 생성자
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	//기본 생성자
	public People() {
	}
}
