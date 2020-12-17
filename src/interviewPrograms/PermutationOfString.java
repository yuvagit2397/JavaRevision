package interviewPrograms;

public class PermutationOfString {
	public static void permutation(String input) {
		permutation("",input);
	}
	public static void permutation(String per,String input) {
		if (input.length()==0) {
			System.out.println(per+" ");
		}
		else {
			//int z=0;
			for (int i = 0; i < input.length(); i++) {
				permutation(per+input.charAt(i),
						input.substring(0,i)+input.substring(i+1, input.length()));
			//System.out.println(++z +"permutation "+per);
			//System.out.println(z++ +"input "+input);
			}
		}
	}
	public static void main(String[] args) {
		permutation("sri");
	}

}
