package interviewPrograms;

public class AbstractConstructorSubclass extends AbstractExampleWithConstructor {
static int a;
	@Override
	public void m2() {
		System.out.println("m2");
	}
public static void main(String[] args) {
	a=10;
	AbstractConstructorSubclass b=new AbstractConstructorSubclass();
	b.m2();
	b.m1();
}
}
