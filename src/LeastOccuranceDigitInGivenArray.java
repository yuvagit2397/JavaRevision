import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class LeastOccuranceDigitInGivenArray {
	static Map<Integer, Integer> mp = new HashMap<>();
	static List<Integer> li = new ArrayList<>();
	static List<Integer> li1 = new ArrayList<>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array values");
		int arr[] = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = scanner.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			int digit = arr[i];
			if (mp.containsKey(digit)) {
				Integer it = mp.get(digit);
				mp.put(digit, it + 1);
			} else {
				mp.put(digit, 1);
			}
		}
		Set<Entry<Integer, Integer>> entrySet = mp.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			li.add(entry.getValue());

		}
		Collections.sort(li);
		Integer integer = li.get(0);
		Set<Entry<Integer, Integer>> entrySet1 = mp.entrySet();
		for (Entry<Integer, Integer> entry1 : entrySet1) {
			if (entry1.getValue() == integer) {
				Integer key = entry1.getKey();
				li1.add(key);

			}
			Collections.sort(li1);
		}
		System.out.println("Least Occrance Character in Given Array " + li1.get(0));

	}
}
 