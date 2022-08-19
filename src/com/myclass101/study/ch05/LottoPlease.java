package com.myclass101.study.ch05;

public class LottoPlease {

	public static void main(String[] args) {

		//로또번호 뽑기
		// 현재까지 나온 번호와 중복되면 안됨
		// 중복숫자 제거
		// 3연속 번호 뽑기
		// 보너스 번호는 제외
		
		
		// 랜덤 숫자 생성
		
		int lotto[] = new int[6]; // 정수 배열 생성
				
				for (int i = 0; i < 6; i++)
				{
					lotto[i] = (int)(Math.random() * 45) + 1; // 정수 생성
		            
					/*
		            		* 여기서 i를 감소시키는 것은 중복된 숫자가 발생했을 시
		                    	* 마지막에 추가된 중복을 배열에서 제거함으로
		                        * 기존에 추가된 다른 값에는 영향 없음
		            		*/
					for (int j = 0; j < i; j++) {
						if (lotto[j] == lotto[i]) {
							i--; // 
						}
					}
				} 
		
		
		
		
		
		// 숫자 확인
		
		
		
		
		
		
		// 중복숫자 제거
		
		
	}

}
