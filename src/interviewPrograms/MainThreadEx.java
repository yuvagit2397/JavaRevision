package interviewPrograms;

public class MainThreadEx {
	public static void main(String[] args) {
		MultiThreadingExample ob = new MultiThreadingExample();
		ob.start();
		for (int j = 6; j <= 10; j++) {
			System.out.println(j);
		}
     
	}
}
