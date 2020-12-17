package interviewPrograms;

public class CharacterOccuranceWithoutIteration {
public static void main(String[] args) {
	String s="DangerPaanai";
	int length = s.length();
	String s1=s.replace("a", "");
	int length2 = s1.length();
	int occurance=length-length2;
	System.out.println("occurance of 'a' "+occurance);
}
}
