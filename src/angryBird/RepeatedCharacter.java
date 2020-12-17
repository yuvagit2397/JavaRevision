package angryBird;

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacter {
	public static void main(String[] args) {
		String p="paanaisrisri";
		char[] ch = p.toCharArray();
		Map<Character,Integer> mp=new HashMap<>();
			for (char c : ch) {
				if(mp.containsKey(c)) {
					Integer it = mp.get(c);
					mp.put(c, it+1);
				}
				else {
					mp.put(c, 1);
				}
			}
			System.out.println(mp);
	}


}
