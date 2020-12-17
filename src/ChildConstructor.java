import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChildConstructor implements MainInInterface {
	ChildConstructor(){
		
		System.out.println("child class constructor");
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		ChildConstructor s=new ChildConstructor();
		//comparing two objects using equals method(having in object class)
		/*ConstructorEx x=new ChildConstructor();
		boolean equals = s.equals(x);
		System.out.println(equals);*/
		
		List<Integer> li=new ArrayList<Integer>();
		synchronized(Collections.synchronizedCollection(li)) {
			li.add(1);
			li.add(2);
			System.out.println(li);
		}
	}
}
