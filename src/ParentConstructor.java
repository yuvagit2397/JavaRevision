
public class ParentConstructor {
	 int i = 30;
	 static {
		 int c=8;
	 }

	ParentConstructor() {
		System.out.println("Grand parent class constructor");
	}
	ParentConstructor(int k) {
		System.out.println("Grand parent argument constructor");
	}
	public  void m1() {
		int i = 10;
		System.out.println(i);
		
	}
	
	
	
}
