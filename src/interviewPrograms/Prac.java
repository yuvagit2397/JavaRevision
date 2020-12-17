  package interviewPrograms;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Prac {
	static Sample sample=null;
	public static void camel() {
		String cam = "";
		List<Character> li = new ArrayList<>();
		String s = "I am a smart girl";
		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) {
			char c = split[i].charAt(0);
			if (i == 0) {
				li.add(Character.toLowerCase(c));
			} else {
				li.add(Character.toUpperCase(c));
			}
		}

		int k = 0;
		for (String word : split) {
			String sub = word.substring(1);
			cam = cam + li.get(k) + sub;
			k++;
		}
		System.out.println("Camel Notation : " + cam);
	}

	public static void pascal() {
		String pas = "";
		List<Character> li1 = new ArrayList<Character>();
		String s1 = "i am A smart girl";
		String[] words = s1.split(" ");
		for (int i = 0; i < words.length; i++) {
			char c1 = words[i].charAt(0);
			li1.add(Character.toUpperCase(c1));
		}
		int j = 0;
		for (int i = 0; i < words.length; i++) {
			String substring = words[i].substring(1);
			pas = pas + li1.get(j) + substring;
			j++;
		}
		System.out.println("Pascal Notation : " + pas);
	}

	public static void withoutWhiteSpace() {
		String trim = "";
		String s2 = "i   am   a    smart girl";
		String[] words2 = s2.split(" ");
		for (int i = 0; i < words2.length; i++) {
			if (words2.length == 0) {
				continue;
			} else {
				trim = trim + words2[i];
			}
		}
		System.out.println("WithoutWhiteSpace : " + trim);
	}

	public static void SmallInArray() {
		int arr[] = { 4, 5, 2, 8, 9, 1, 0 };
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("smallest no : " + min);
	}

	public static void letterOccurance() {
		String s = "i am a smart girl";
		String c = "a";
		int length1 = s.length();
		int length2 = s.replace(c, "").length();
		int len = length1 - length2;
		System.out.println(len);

	}

	public static void flightPriceOrder() {

		List<Integer> li = new ArrayList<Integer>();
		String a[] = { "#1", "#2", "#3", "#4", "#23", "#0", "#1200", "#1600" };
		for (int i = 0; i < a.length; i++) {
			String s = a[i].replaceAll("#", "");
			int fare = Integer.parseInt(s);
			li.add(fare);
		}
		System.out.println("List " + li);
		String valueOf = "";
		for (int i = 0; i < li.size(); i++) {
			if (i == 0) {
				valueOf = String.valueOf(li.get(i));
				valueOf = "#" + valueOf;
				System.out.println(valueOf);
			} else {
				Integer x = li.get(i - 1);
				Integer y = li.get(i);
				if (x < y) {
					valueOf = String.valueOf(li.get(i));
					valueOf = "#" + valueOf;
					System.out.println(valueOf);
				} else {
					break;
				}
			}
		}
	}

	// Recursion is a basic programming technique ,
	// in which a method calls itself to solve some pblm
	static int factorial(int num) {
		if (num > 1)
			return num * factorial(num - 1);
		else
			return 1;
	}
    
	public static void test(){
		//ConcurrentModificationException
		List<Integer> li=new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(22);
		li.add(32);
		li.add(12);
		Iterator it=li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			li.add(11);
		}
	}
	public static  void triangle() {
		int s=10;
		for (int i = 1; i <=5; i++) {
			for (int j = 0; j <s; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print(i+" ");
			}
			s--;
			System.out.println();
		}
	}
	
			/*	1                         
	           2 3
	          4 5 6
	         7 8 9 10*/
	public static void main(String[] args) {
		//flightPriceOrder();
		//test();
		triangle();
		/*
		 * Scanner scanner=new Scanner(System.in);
		 * System.out.println("Enter Factorial number"); int facttorialNumber =
		 * scanner.nextInt(); int num=facttorialNumber; int fact = factorial(num);
		 * System.out.println("Factorial of "+num +" = "+ fact);
		 */
 
}
}
