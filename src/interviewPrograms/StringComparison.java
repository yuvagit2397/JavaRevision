package interviewPrograms;

public class StringComparison {
public static void main(String[] args) {
	String s="asdf wer ser";
	StringBuffer s1=new StringBuffer();
	s1.append("a");
	s1.append("s");
	s1.append("d");
	s1.append("f");
	//using contentequals method
	System.out.println(	"comparison using contentEquals method "+s.contentEquals(s1));
	
	//using equals method
	System.out.println(	"comparison using Equals method "+s.equals(s1));
	
	//compareTo method
	//using this method we can compare only two Strings
	//compares based on unicode value
	
	String[] split = s.split("\\s");
	for (int i = 0; i < split.length; i++) {
		System.out.println(split[i]);
	}
	String x="yuvasri";
	String y="yuva";
	String z="sri";
	
	System.out.println(x.replace(x, y));
}
}
