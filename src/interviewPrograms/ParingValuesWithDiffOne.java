package interviewPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParingValuesWithDiffOne {
	static Map<Integer, Integer> mp=new HashMap<Integer, Integer>();
	static List<Integer> li=new ArrayList<Integer>();
	 public static void pair() {
		 int[] nos= {2,3,1,4,6,8,2,6,0,3,5,8,9};
		 for (int i = 0; i < nos.length; i++) {
			 for (int j = i+1; j < nos.length; j++) {
				if (nos[i]-nos[j]==1||nos[i]-nos[j]==-1) {
					int k=nos[i]+nos[j];
					if (li.contains(k)==false) {
						li.add(k);
						mp.put(nos[i], nos[j]);
					}
				}
			}
			
		}
		 System.out.println(mp);
	 }
	 public static void main(String[] args) {
		pair();
	}
}

