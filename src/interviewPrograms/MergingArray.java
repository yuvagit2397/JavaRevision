package interviewPrograms;

public class MergingArray {
public static void main(String[] args) {
	int[] a= {3,8,6};
	int[] b= {2,4,1};
	int[] c=new int[a.length+b.length];
	System.out.println("first array elements");
	for (int i = 0; i < a.length; i++) {
			c[i]=a[i];
			System.out.print(a[i]);
		}
	System.out.println();
	int k=a.length;
	System.out.println("second array elements");
		for (int j = 0; j < b.length; j++) {
			c[k]=b[j];
			k++;
			System.out.print(b[j]);
		}
		System.out.println();
	for (int i = 0; i < c.length; i++) {
		for (int j = i+1; j < c.length; j++) {
			if (c[i]>c[j]) {
			int temp=c[i];
			c[i]=c[j];
			c[j]=temp;
			}
		}
	}
	System.out.println("merged array in sorting order");
	for (int i = 0; i < c.length; i++) {
		System.out.print(c[i]);
	}
	}
 }

