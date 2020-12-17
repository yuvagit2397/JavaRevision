package interviewPrograms;

import java.util.ArrayList;
import java.util.List;

public class CamelCase {
	
	public static void main(String[] args) {
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
		System.out.println(cam);
	}
	//another method
		/*String s = "Iam at home";
		String[] split = s.split(" ");
		List<Character> li = new ArrayList<>();
		for (int j = 0; j < split.length; j++) {

			if (j == 0) {
				char c1 = split[j].charAt(0);
				li.add(Character.toLowerCase(c1));
				continue;
			}
			char c = split[j].charAt(0);

			boolean b = Character.isUpperCase(c);
			if (b == false) {
				char d = Character.toUpperCase(c);
				li.add(d);
			} else {
				li.add(c);
			}
		}

		String str = "";
		String camelCase = "";
		for (int i = 0; i < split.length; i++) {
			Character ch = li.get(i);
			// System.out.println("li " + ch);
			str = String.valueOf(ch);
			String substring = split[i].substring(1);
			// System.out.println(substring);
			str = str + substring;
			//System.out.println(str);
			camelCase=camelCase.concat(str);

			// char charAt = split[i].charAt(0);

		}
		System.out.println(camelCase);

	}*/

}
