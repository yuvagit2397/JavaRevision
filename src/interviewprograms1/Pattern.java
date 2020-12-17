package interviewprograms1;

import java.util.Objects;

import org.omg.CORBA.Object;

public class Pattern {
	
public static void main(String[] args) {
	int k=1;
	for (int i = 1; i <= 7; i++) {
		System.out.print("*");
		for (int j = 1; j <= k; j++) {
			System.out.print(j);
		}
		k++;
	}
	String s="12345";
     Double.parseDouble(s);
     Float.parseFloat(s);
     Long.parseLong(s);
}
}
