package interviewPrograms;

import java.util.Scanner;

public class BinaryToDecimalConvertion {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter binary number");
		String binaryNumber = scanner.nextLine();
		int parseInt = Integer.parseInt(binaryNumber, 2);
		System.out.println("dceimal value of  "+binaryNumber +"= "+parseInt);
		
	}
}
