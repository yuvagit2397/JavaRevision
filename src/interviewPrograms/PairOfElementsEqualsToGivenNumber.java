package interviewPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PairOfElementsEqualsToGivenNumber {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		int[] nosArr = { 8, 4, 1, 2, 3, 7, 8, 9 };
		int given = 12;
		for (int i = 0; i < nosArr.length; i++) {
			int no = nosArr[i];
			//int m = 0;
			for (int j = 0; j < nosArr.length; j++) {
				int no1 = nosArr[j];
				if ((no + no1) == given) {

					if ((li.contains(no) || li.contains(no1))==true) {
						continue;
					} else {
						li.add(no);
						System.out.println(no + "," + no1);
					}
				}

			}
		}

	}
}
