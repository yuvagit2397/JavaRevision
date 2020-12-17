package interviewPrograms;

public class PrintAlphabatUsingLoop {
public static void main(String[] args) {
	char c;
	System.out.println("The Alphabatics using Loop");
	for (c='A';c<='Z'; c++) {
		System.out.print(c+" ");
	}


//flyods triangle
	System.out.println();
	int k=1;
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j <=i; j++) {
			System.out.print(" "+k);
			k++;
		}
		System.out.println();
	}
	
	//all substring of a string
	String s="abcd";
	int n=s.length();
	for (int i = 0; i <= n; i++) {
		for (int j = i+1; j <= n; j++) {
			System.out.println(s.substring(i, j));
		}
	}

}	
}
