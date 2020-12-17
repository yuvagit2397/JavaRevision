package interviewprograms1;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesInArrayList {
public static void main(String[] args) {
	List<Integer> li=new ArrayList<Integer>();
	li.add(1);
	li.add(2);
	li.add(3);
	li.add(1);
	li.add(2);
	li.add(4);
	li.add(4);
	li.add(5);
	int count=0;
	for (int i = 0; i < li.size(); i++) {
		Integer val = li.get(i);
		for (int j = 0; j < li.size(); j++) {
			if (li.contains(val)==true&&li.indexOf(val)!=i) {
				count++;
				break;
			}
		}
	}
	System.out.println("the no of duplicates present in list = "+count);
}
}
