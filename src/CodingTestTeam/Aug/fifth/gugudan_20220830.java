package CodingTestTeam.Aug.fifth;

public class gugudan_20220830 {

	public static void main(String[] args) {

		int sum = 0;
		
		for(int i = 2; i<=9; i++) {
			for(int j = 1; j<=9; j++) {
				if(j == 1) {
					System.out.println("--------------");
				}
				System.out.println(i + " * " + j + " = " + (i*j) );
			}
		}
		
	}

}
