package interviewprograms1;

public class NumberTriangle {
	public static void main(String[] args) {
		int s = 10;
		int x = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= s; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				x++;
				if (x == 10) {
					System.out.println(0);
				} else {
					System.out.print(x + " ");
				}
			}
			s--;
			System.out.println();
		}
	}
}
