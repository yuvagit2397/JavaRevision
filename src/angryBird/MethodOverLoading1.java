package angryBird;

public class MethodOverLoading1 {
	
	private void add(String s1) {
		System.out.println("String");
		}
	private void add(Object s) {
		System.out.println("Object");
		}
	public static void main(String[] args) {
		
		MethodOverLoading1 ob=new MethodOverLoading1();
		ob.add(10);
	}
}
