package interviewprograms1;

import java.util.ArrayList;
import java.util.List;

public class PrintDupInString {
public static void main(String[] args) {
	
	String s="katalonStudio";
	String s1="katalonStudio";
	List<Character> li=new ArrayList<>();
	for (int i = 0; i < s1.length(); i++) {
		char c = s1.charAt(i);
		if(li.contains(c)==true) {
			System.out.println(c);
			s=s.replace(""+c+"","");
		}else {
			li.add(c);
		}
	}
	System.out.println(s);
}
}
