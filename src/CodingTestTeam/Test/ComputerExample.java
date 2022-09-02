package CodingTestTeam.Test;

public class ComputerExample {

	public static void main(String[] args) {
		
		System.out.println("원의 반지름: 7.0");

		System.out.println(" ");
		
		Calculator calculator = new Calculator();
		System.out.println("원면적: " + calculator.area(7));
		
		System.out.println(" ");
		
		Computer computer = new Computer();
		System.out.println("원면적: " + computer.area(7));
	}

}
