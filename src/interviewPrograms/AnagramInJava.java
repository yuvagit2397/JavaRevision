package interviewPrograms;

public class AnagramInJava {
	public static void main(String[] args) {
		String s1="braga2";
		String s2="grabz";
		int k=0;
		
		if (s1.length()!=s2.length()) {
			System.out.println("given strings "+s1+" and "+s2+" are not anagram");
			
		}
		else {
			for (int i = 0; i < s1.length(); i++) {
				char c = s1.charAt(i);
					boolean contains = s2.contains(""+c+"");
				if (contains==true) {
					continue;
				}
				else {
					k++;
				}
			}
			
		
		int x=0;
		if (s1.length()==s2.length()) {
			for (int i = 0; i < s2.length(); i++) {
				char c1 = s2.charAt(i);
					boolean contains = s1.contains(""+c1+"");
				if (contains==true) {
					continue;
				}
				else {
					x++;
				}
			}
			
		}
		if (k==0&&x==0) {
			System.out.println("given strings "+s1+" and "+s2+" are anagram");
		}
		else {
			System.out.println("given strings "+s1+" and "+s2+" are not anagram");
		}
	}}
}
