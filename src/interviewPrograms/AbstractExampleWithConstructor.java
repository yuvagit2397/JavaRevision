package interviewPrograms;

public abstract class AbstractExampleWithConstructor {
	public void m1() {
		System.out.println("m1");
	}

	public abstract void m2();

	AbstractExampleWithConstructor() {
		System.out.println("abstract constructor");
	}
}
