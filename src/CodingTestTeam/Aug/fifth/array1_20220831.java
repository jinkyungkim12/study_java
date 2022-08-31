package CodingTestTeam.Aug.fifth;

public class array1_20220831 {

	public static void main(String[] args) {

		// 1. array scoreChemisty 의 평균을 구해서 출력하시오.
		
		 int[] scoreChemistry = {88,99,45,86,34}; 
		 double sum = 0;
		
		 
		 for(int i=0; i<scoreChemistry.length; i++) {
			 sum += scoreChemistry[i];
			 
		 } System.out.println("평균: " + sum/5 +" 점");
		
	}

}
