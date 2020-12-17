package angryBird;

import java.util.Arrays;
import java.util.List;

public class ConversionExample {

	public static void main(String[] args) {
		//String array to list
		String a[] = { "a","b","c" };

		List<String> asList = Arrays.asList(a);
		System.out.println(asList.size());
		
		//int to String
		
		float n=10.5f;
		String valueOf = String.valueOf(n);
		System.out.println(valueOf);
		
		//String to Integer
		
		String s="123";
		int parseInt = Integer.parseInt(s);
		System.out.println(parseInt);
		
		//float to int
		 int z=(int)n;
		 System.out.println(z);
		 
		 //String to char array
		 
		 char[] charArray = s.toCharArray();
		 //System.out.println("char");
		 //System.out.println(charArray);
		 for (char c : charArray) {
			System.out.println(c);
		}
		 
		 
	}
}