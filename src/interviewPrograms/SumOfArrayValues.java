package interviewPrograms;

public class SumOfArrayValues {
public static void main(String[] args) {
	
	int[] a= {10,12,34,56,78};
	int count=0;
	for (int i=0;i<a.length;i++) {
		count=count+a[i];
	}
	System.out.println(count);
}
}
