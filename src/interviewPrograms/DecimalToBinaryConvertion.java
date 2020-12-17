package interviewPrograms;

import java.util.Scanner;

public class DecimalToBinaryConvertion {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Decimal number");
	int decimalNumber = scanner.nextInt();
	String parseInt = Integer.toBinaryString(decimalNumber);
	System.out.println("dceimal value of  "+decimalNumber +"= "+parseInt);
}
}
