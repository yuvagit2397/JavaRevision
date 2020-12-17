package angryBird;

import java.util.ArrayList;
import java.util.List;

public class PrintDupInGivenArray {
public static void main(String[] args) {
	List<Integer> li=new ArrayList<>();
	int a[]= {1,4,8,1,4,3,8,3,2,5};
	
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if (a[i]==a[j]) {
				if (li.contains(a[i])==false) {
					li.add(a[i]);
					System.out.println(a[i]);
				}
				
			}
		}
		
	}
}
}
