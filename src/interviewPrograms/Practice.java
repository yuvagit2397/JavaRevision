package interviewPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Practice {
	static String camelCase="";
	public static int camelCase() {
		int aa=10;
		return aa;
     /*List<Character> li=new ArrayList<>();
 		String s="paanai completed today test successfully";
		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) {
			char charAt = split[i].charAt(0);
			if(i==0) {
				li.add(charAt);
			}else {
				li.add(Character.toUpperCase(charAt));
			}
		}
		int k=0;
	for (String sub : split) {
		if(sub.length()==0) {
			camelCase=camelCase+" "+li.get(k);
		}else {
		String substring = sub.substring(1);
		camelCase=camelCase+" "+li.get(k)+substring+"";
		k++;
	}}
	System.out.println(camelCase);*/
	}
	public static void stringOccuranceWithoutIteration() {
		Set<String> set=new HashSet<>();
		int occurance=0;
		int limit=0;
     String s="paanaicompletedtodaytestsuccessfully";
     int l = s.length();
     for(int i=0;i<=limit;i++) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Character");
     String c = sc.next();
     if(set.contains(c)) {
    	 System.out.println("U already given that character so Enter new One");
    	  limit++; 
    	 continue;
     }else {
     set.add(c);
     }
     if(s.contains(c)) {
    	int s1= s.replace(c,"").length();
    	occurance=l-s1;
    	System.out.println(c+"="+occurance);
    	break;
     }else {
    	 System.out.println("String not contains the character which u given");
    	 limit++;
     }
	}
     
	}
	public static void main(String[] args) {
		//camelCase();
		stringOccuranceWithoutIteration();
	}
}
