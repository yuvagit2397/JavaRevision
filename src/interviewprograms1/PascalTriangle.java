package interviewprograms1;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
		System.out.println("enter the no");
		Scanner sc=new Scanner(System.in);
		int no = sc.nextInt();
		System.out.println("Enter space count");
		int space=sc.nextInt();
		int number=1;
		for (int i = 0; i < no; i++) {
			for (int s = 0; s < space; s++) {
				System.out.print(" ");
			}
			number=1;
			for (int j = 0; j <=i; j++) {
				System.out.print(number+" ");
				number=number*(i-j)/(j+1);
			}
			space--;
			System.out.println();
		}
	}
}


 











