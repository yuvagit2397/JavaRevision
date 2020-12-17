package interviewPrograms;

public class StringLengthWithoutLengthMethod {
static String s="today is monday";
 public static void main(String[] args) {
	System.out.println(s.length());
	System.out.println("-----------");
	char[] c = s.toCharArray();
	int len=0;
	for (char ch : c) {
		
		len++;
	}
	System.out.println(len);
}
}
