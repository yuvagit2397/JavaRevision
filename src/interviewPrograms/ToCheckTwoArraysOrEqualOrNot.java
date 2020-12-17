package interviewPrograms;

import java.util.Arrays;

public class ToCheckTwoArraysOrEqualOrNot {
	public static void main(String[] args) {

		int a[] = { 1, 6, 3 };
		int b[] = { 2, 3, 1 };
		int length1 = a.length;
		int length2 = b.length;
		int len = length1 - length2;
		int m = 0;
		if (len == 0) {
			Arrays.sort(a);
			Arrays.sort(b);
			for (int i = 0; i < a.length; i++) {
				if (a[i] == b[i]) {
					continue;
				} else {
					m++;
				}

			}

		}
		if (m == 0) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}

	}
}
