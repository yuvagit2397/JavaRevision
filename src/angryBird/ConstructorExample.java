package angryBird;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConstructorExample {
	static String s="ASDFGHJ";
static List<String> li=new ArrayList<>() ;
	ConstructorExample(){
		this(10);
		//ConstructorExample ob=new ConstructorExample(10);
		System.out.println("default");
	}
	ConstructorExample(int a){
		System.out.println("Argument");
	}
	public static void main(String[] args) {
		li.add("asd");
		li.add("awe");
		li.add("hgd");
		Integer[] i= {1,2,3,5,66,45};
		String string = s.toString();
		System.out.println(string);
		ConstructorExample ob=new ConstructorExample();
	     String string2 = Arrays.toString(i);
	     char charAt = string2.charAt(0);
	     System.out.println(charAt);
	}
	
}
