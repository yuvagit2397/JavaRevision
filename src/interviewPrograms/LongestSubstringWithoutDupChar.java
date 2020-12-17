package interviewPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;

public class LongestSubstringWithoutDupChar {

	public static void main(String[] args) {

		String s = "developers_write_unit_tests";

		List<String> li = new ArrayList<>();
		List<Integer> size = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			String subString = "";
			char c = s.charAt(i);
			subString = subString + c;
			for (int j = i + 1; j < s.length(); j++) {
				char charAt = s.charAt(j); 
				if (subString.contains("" + charAt + "") == false) {
					char c1 = s.charAt(j);
					subString = subString + c1;                                                      

				} else {
					break;
				}

			}
			li.add(subString);
		}
		for (String length : li) {
			size.add(length.length());
		}
		int z = size.indexOf(Collections.max(size));
		System.out.println(z);
		System.out.println(li.get(z));
		Collections.reverse(size);
		Collections.reverse(li);
		int z1 = size.indexOf(Collections.max(size));
		System.out.println(li.get(z1));
        System.out.println(z1);
	}

}