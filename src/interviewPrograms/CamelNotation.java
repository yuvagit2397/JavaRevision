package interviewPrograms;

import java.util.Scanner;

public class CamelNotation {
	public static void main(String[] args) {
		StringBuffer b=new StringBuffer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) {
			char c = split[i].charAt(0);
			if (Character.isUpperCase(c) && (i==0)) {
				char begin = Character.toLowerCase(c);
				b.append(begin).append(split[i].substring(1));
				}
			else {
				char c1 = Character.toUpperCase(c);
				b.append(c1).append(split[i].substring(1));
			}
				
		}
		System.out.println(b);
	}

}
