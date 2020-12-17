package interviewprograms1;

public class PerfectNumber {
public static void main(String[] args) {
	
	int n=6;
	int val=0;
	System.out.println("divisors are");
	for (int i = 1; i < n; i++) {
		if (n%i==0) {
			System.out.println(i);
			val=val+i;
		}
	}
	if (val==n) {
		System.out.println("perfect number");
	}
	else {
		System.out.println(" not a perfect number");
	}
}
}
