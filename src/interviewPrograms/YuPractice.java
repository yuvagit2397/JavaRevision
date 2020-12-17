package interviewPrograms;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class YuPractice {

	public static void flightPrice() {
		String[] arr = { "$1000", "$2000", "$3000", "$4000", "$1500", "$2000", "$2500" };
		for (int i = 0; i < arr.length; i++) {
			String s = arr[i].substring(1);
			int num = Integer.parseInt(s);
			for (int j = i + 1; j < arr.length; j++) {
				String s1 = arr[j].substring(1);
				int num1 = Integer.parseInt(s1);
				if (num < num1) {
					System.out.println("$" + String.valueOf(num));
					break;
				} else {
					System.out.println("$" + String.valueOf(num));
					i = arr.length;
					break;
				}
			}
		}

	}
	public static int number(int n) {
		System.out.println(n);
		return n;
	}
public static void main(String[] args) {
	flightPrice();
}
}
