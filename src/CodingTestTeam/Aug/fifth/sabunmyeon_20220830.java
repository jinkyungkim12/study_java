package CodingTestTeam.Aug.fifth;

public class sabunmyeon_20220830 {

	public static void main(String[] args) {

		// int 타입 변수를 2개 선언하고
		// 두 정수가 주어졌을 때 사분면 어디에 해당되는지 출력하는 프로그램 작성
		
		int x = 1;
		int y = 0;
		
		
		if(x<0 && y>0) {
			System.out.println("1사분면");
			
		} else if(x>0 && y>0){
			System.out.println("2사분면");
			
		} else if(x<0 && y<0) {
			System.out.println("3사분면");
			
		} else if(x>0 && y<0) {
			System.out.println("4사분면");
			
		} else if(y==0) {
			System.out.println("x축 위");
			
		} else if(x==0) {
			System.out.println("y축 위");
		} else {
			System.out.println("(0,0)");
		}
		
		
	}

}
