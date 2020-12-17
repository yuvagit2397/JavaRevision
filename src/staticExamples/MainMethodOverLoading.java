package staticExamples;

public class MainMethodOverLoading {
	{
		System.out.println("Normal Block");
	}
	static {
		System.out.println("static");
	}
	static public void main(String[] args) {
		MainMethodOverLoading MainMethodOverLoading=new MainMethodOverLoading();
		main(10);
		main("paanai");
	}
	public static void main(String s) {
		System.out.println(s);
	}
	public static void main(int x) {
		System.out.println(x);
	}
}
//we can write main method 
//1.public static void main(String[] args)
//static public void main(String[] args)
//	static public void main(String args[]) 


//