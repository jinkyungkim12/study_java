package com.myclass101.study.ch07.second;

public class Student extends People{

	public int studentNO;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNO = studentNo;
	}
	
	public Student(String name, String ssn) {
		super(name, ssn);
	}
}
