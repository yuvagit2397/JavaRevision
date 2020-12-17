package interviewprograms1;

public class ExitMethodInTryCatch {
	{
		System.out.println("class level instance block");
	}
	public  void m1() {
		{
			System.out.println("method level instance block");
		}
		System.out.println("method");
	}
	public static void main(String[] args) {
		
		ExitMethodInTryCatch b=new ExitMethodInTryCatch();
		b.m1();
		
		
	}
		/*System.out.println("start");
		try {
			System.out.println("within try");
			System.exit(0);
			System.out.println(10/0);
			
		} catch (Exception e) {
			System.out.println("catch block");
			//throw new ArithmeticException("exception handled");
		}
		finally {
			System.out.println("finally block");
		}
	}
	
*/
}
