import java.util.ArrayList;
import java.util.List;

public class ConstructorEx extends ParentConstructor {

	public ConstructorEx() {
		super(10);
		System.out.println("Parent class constructor");
	}

	/*static {
		System.out.println("i am in child class static block");

	}
*/
	/*public static void main(String[] args) {
		ConstructorEx ob = new ConstructorEx();
List<Character> li=new ArrayList<Character>();
		String s = "abcdefghijklmnoqrstuv";
		String full = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < s.length(); i++) {
			li.add(s.charAt(i));
		}
		System.out.println(li);
		for (int i = 0; i < full.length(); i++) {
			char c1 = full.charAt(i);
			if (li.contains(c1)==false) {
				System.out.println(c1);
			}

		}
	}*/
}
