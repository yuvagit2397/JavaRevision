package interviewprograms1;

public class PowerOfGivenNumber {
	public static void main(String[] args) {
		int num=3;
		int power=4;
		int val=1;
		for (int i = 0; i <power; i++) {
		val=val*num;
		}
		System.out.println(val);
	}
}
