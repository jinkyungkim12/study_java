package com.myclass101.study.ch04;

public class IfExample {

	public static void main(String[] args) {

		// if, if else 뒤에는 괄호 , else 뒤에는 no 괄호
		int score = 95;
		
		if(score >=90) {
			if (score>=97){
				System.out.println("A+");
			} else if(score<=92){
				System.out.println("A-");
			} else {
				System.out.println("A");
			}
		} 
		
		else if (score>=80 && score<90) {
			if (score>=87){
				System.out.println("B+");
			} else if(score<=82){
				System.out.println("B-");
			} else {
				System.out.println("B");
			}
		}
		
		else if (score>=70 && score<79) {
			if (score>=77){
				System.out.println("C+");
			} else if(score<=72){
				System.out.println("C-");
			} else {
				System.out.println("C");
			}
		}
		
		else if (score>=60 && score<69) {
			if (score>=67){
				System.out.println("D+");
			} else if(score<=62){
				System.out.println("D-");
			} else {
				System.out.println("D");
			}
		}
		
		else {
			System.out.println("F");
		}
		
		
	}

}
