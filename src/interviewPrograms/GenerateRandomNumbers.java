package interviewPrograms;

import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumbers {
          
		 
		public void generateRandomNumber(){
		 
		Random ran =  new Random();                       
		 
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("How many Random Numbers you want?:- ");
		 
		int value = sc.nextInt();                       
		 
		for(int i=0; i<value;i++){
		 
		    int number = ran.nextInt(100);
		    System.out.println(number);
		   }
		  }           
		 
		public static void main(String[] args) {
		 
		GenerateRandomNumbers obj = new GenerateRandomNumbers();
		obj.generateRandomNumber();
		}
		}
