package interviewprograms1;

public class NumberPyramid {
	/*				1
	 *            2 3 2
	 *          3 4 5 4 3
	 *        4 5 6 7 6 5 4
	 *        
	 *        */
	public static void main(String[] args) {
		
		 int rows = 5;
	     int k = 0;
	     int count = 0;
	     int count1 = 0;

	        for(int i = 1; i <= rows; ++i) {
	            for(int space = 1; space <= rows - i; ++space) {
	                System.out.print("  ");
	                ++count;
	            }

	            while(k != 2 * i - 1) {
	                if (count <= rows - 1) {
	                    System.out.print((i + k) + " ");
	                    ++count;
	                }
	                else {
	                    ++count1;
	                    System.out.print((i + k - 2 * count1) + " ");
	                }

	                ++k;
	            }
	            count1 = count = k = 0;

	            System.out.println();
	        }
	    }
	}

