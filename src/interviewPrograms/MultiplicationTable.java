package interviewPrograms;

import java.util.Scanner;

public class MultiplicationTable {
	static int x;
	private void mulTable() {

		int mul;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  table num");

		int tableNum = sc.nextInt();
		/*for (int i = 1; i <= 16; i++) {
			mul = tableNum * i;
			System.out.println(+i + "*" + tableNum + "=" + mul);
		}*/
		System.out.println("value of x="+x);
	}

	public static void main(String[] args) {
		MultiplicationTable ob = new MultiplicationTable();
		ob.mulTable();
         //System.out.println("value of x="+x);
	}
}
