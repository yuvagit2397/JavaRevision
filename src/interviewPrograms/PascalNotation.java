package interviewPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalNotation {
	public static void main(String[] args) {
		StringBuffer b=new StringBuffer();
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(s);
		String[] split = s.split(" ");
		for (String word : split) {
			char c = word.charAt(0);
			
			/*if(word.length()==1) {
				char charAt = word.charAt(0);
				b.append(Character.toUpperCase(charAt));
				continue;
			}*/
			if(Character.isUpperCase(c)) {
				b.append(c).append(word.substring(1));
			}else {
				char upperCase = Character.toUpperCase(c);
				b.append(upperCase).append(word.substring(1));
			}
		}
		System.out.println(b);
	}
}
