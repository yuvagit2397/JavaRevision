package interviewprograms1;

import java.util.HashMap;
import java.util.Map;

public class NestedMap {
public static void main(String[] args) {
	int i=1;
	Map<Integer, Map<Integer,String>> mp=new HashMap<>();
	Map<Integer,String> innerMap=mp.get(i);
	if (innerMap==null) {
		mp.put(i, innerMap=new HashMap<>());
	}
	innerMap.put(3, "a");
	innerMap.put(2, "b");
	mp.put(4, innerMap);
	System.out.println(mp);
	mp.put(5, new HashMap() {{put(6, "c");}});
	System.out.println(mp);
}
}
