package interviewprograms1;

public class PrintingOddPositionOfGivenString {
	public static void main(String[] args) {
   String s="Catalon Studio";
   
  s= s.replace(" ","");
   String rev="";
   for (int i =s.length()-1;i>=0; i--) {
	
	   rev=rev+s.charAt(i);
	   
	   
}
   System.out.println(rev);
   for (int i = 0; i < rev.length(); i++) {
	if(i%2!=0) {
		char charAt = rev.charAt(i);
		System.out.println(Character.toUpperCase(charAt));
	}
}
   }
}
