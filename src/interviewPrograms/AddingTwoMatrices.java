package interviewPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class AddingTwoMatrices {

	public static void main(String[] args) {

		int a[][]= {{1,2,3},{3,4,5},{5,6,7}};
		int b[][]= {{2,6,4},{3,7,3},{3,8,6}};
		
		int c[][]= new int[3][3];
		
		System.out.println("ADD");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("MUL");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				c[i][j]=a[i][j]*b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("TRANSPOSE");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				c[i][j]=a[j][i];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	

}
