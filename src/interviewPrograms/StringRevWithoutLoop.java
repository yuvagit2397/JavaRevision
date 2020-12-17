package interviewPrograms;

public class StringRevWithoutLoop {
	
public static void revString(String input) {
	String s1="";
	int max=input.length();
	int i=0;
	if (i<max) {
		char charAt = input.charAt(max-1);
		s1=s1+charAt;
		System.out.print(s1);
		input=input.substring(0,max-1);
		revString(input);
	}
}

public static void stringPrintInRecursive(String str) {
	int i=0;
	int length=str.length();
	if (i<length) {
		char c = str.charAt(length-1);
		System.out.print(c);
		str=str.substring(0, length-1);
		stringPrintInRecursive(str);
		
	}
}
public static void main(String[] args) {
	stringPrintInRecursive("yuvasri");
	System.out.println();
	revString("monday");
}
}
