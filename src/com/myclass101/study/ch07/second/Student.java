package com.myclass101.study.ch07.second;

public class Student extends People{

	public int studentNO;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); // super() = 부모 생성자 = People, 부모 클래스
		this.studentNO = studentNo; // this = Student, 현재 클래스
	}
	
	public Student(String name, String ssn) {
		super(name, ssn); // = this.name = name;/ this.ssn = ssn;
	}
	
	public Student() {
//		super();
	}
	
	
}
