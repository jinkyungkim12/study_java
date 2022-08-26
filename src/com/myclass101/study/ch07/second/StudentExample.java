package com.myclass101.study.ch07.second;

public class StudentExample {

	public static void main(String[] args) {

		
		// 명시적 생성자(2개)를 사용하여 객체를 생성하고
		// 모든 필드를 출력하시오!!
		
		
		Student student = new Student("김진경", "930507-234567", 12);
		
		
		System.out.println("student.name: " + student.name);
		System.out.println("student.ssn: " + student.ssn);
		System.out.println("student.studentNO: " + student.studentNO);
		
		
		Student student2 = new Student("차은우", "970330-123456");
		
		System.out.println("student2.name: " + student2.name);
		System.out.println("student2.ssn: " + student2.ssn);
		System.out.println("student2.studentNO: " + student.studentNO);
		
	}

}
