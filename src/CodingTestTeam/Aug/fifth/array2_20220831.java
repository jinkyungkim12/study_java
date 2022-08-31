package CodingTestTeam.Aug.fifth;

public class array2_20220831 {

	public static void main(String[] args) {

// 국어,영어,수학
//		1. 개인의 평균
//		2. 과목별 평균

		int[][] scores = {{99,88,55}, {55,77,66}, {55,55,44}, {55,55,44}, {55,55,77}};
		
		String[] name = {"강","김","이","박","정"};
		String[] subject = {"국어","영어","수학"};
		
		
		
		for(int i=0; i<scores.length; i++) {
			double sum = 0;
			for(int j=0; j<scores[i].length; j++) {
				sum +=scores[i][j];
		}
			System.out.println(name[i]+"의 평균 점수는: "+(sum/scores[i].length));
		}
		
		
		System.out.println("-----------------------");
		
		int[] sum2 = new int[3];
		
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				sum2[j] += scores[i][j];
			}
		}
		
		for (int i=0; i<sum2.length; i++) {
			System.out.println(subject[i]+"과목별 평균 점수는: " + ((double)sum2[i]/scores.length));
		}
		
		
	}

}
