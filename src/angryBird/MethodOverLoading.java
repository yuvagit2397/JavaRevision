package angryBird;

public class MethodOverLoading {
	//float f=10.0f;
	
private void add(String s) {
System.out.println("String");
}
private void add(int n) {
System.out.println("Int");
}
private void add(float f) {
System.out.println("float");    //12.0f
}
private void add(double d) {
System.out.println("double");   //10.0
}
public static void main(String[] args) {
	MethodOverLoading ob=new MethodOverLoading();
	ob.add(12);
}
}
