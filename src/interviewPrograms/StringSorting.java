package interviewPrograms;

import java.util.Scanner;

public class StringSorting {
	
public static void sortingString() {
	int n=5;
	String temp;
	String[] arr=new String[n];
	System.out.println("Enter the String");
	Scanner sc=new Scanner(System.in);
	for (int i = 0; i < n; i++) {
		arr[i]=sc.nextLine();
	}
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if (arr[i].compareTo(arr[j])<0) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println("The Sorted String");
	for (int k = 0; k < arr.length; k++) {
		System.out.println(arr[k]);
	}
}
public static void main(String[] args) {
	sortingString();
}
}
