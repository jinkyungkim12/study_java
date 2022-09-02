package CodingTestTeam.Test;

public class Computer extends Calculator{

	@Override
	public double area(int param) {
		System.out.println("Computer 객체의 areaCircle 실행");
		
		return Constants.PAI_2 * param * param;
	}
	
}
