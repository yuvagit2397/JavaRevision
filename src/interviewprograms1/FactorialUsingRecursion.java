package interviewprograms1;

public class FactorialUsingRecursion {

	static int factorial(int num) {
		int val;
		if (num == 1) {
			return 1;
		}
		val = factorial(num - 1) * num;
		return val;

	}

	public static void main(String[] args) {
		int n = 5;
		int f = factorial(n);
		System.out.println("Factorial of " + n + " is = " + f);

	}

}
