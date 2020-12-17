package staticExamples;

public class Honda extends Car{
	//we can overload static method but cant override
	public static void start() {
		System.out.println("Honda......start");
	}
	public static void start(int z) {
		System.out.println("Honda......start");
	}
	public static void start(int z,int a) {
		System.out.println("Honda......start");
	}
}
