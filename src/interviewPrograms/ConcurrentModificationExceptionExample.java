package interviewPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExceptionExample {
	//When we trying to add values in list while iterating using iterator we will get 
	//ConcurrentModificationException
	public static void main(String[] args) {
	List<Integer> li=new ArrayList<Integer>();
	li.add(1);
	li.add(2);
	li.add(22);
	li.add(32);
	li.add(12);
	Iterator it=li.iterator();
	while(it.hasNext()) {
		//li.add(91);
		System.out.println(it.next());
		li.add(11);
	}
}
}
//Reference
/*java.util.ConcurrentModificationException is a very common exception when 
working with Java collection classes. Java Collection classes are fail-fast,
which means if the Collection will be changed while some thread is traversing 
over it using iterator, the iterator.next() will throw ConcurrentModificationException. 
Concurrent modification exception can come in case of multithreaded as well as a single threaded 
java programming environment.*/


