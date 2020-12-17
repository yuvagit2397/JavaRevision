package interviewprograms1;

public class GreatestNumber {
	public static void main(String[] args) {
		int[] arr= {5,9,5,3,8,9,2,6,11};
		int min = Integer.MIN_VALUE;
		//System.out.println(min);
		for (int i = 0; i < arr.length; i++) {
		if (min<arr[i]) {
			min=arr[i];
		}
	}
		System.out.println(min);
	}

}
