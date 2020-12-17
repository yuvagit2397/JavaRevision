package interviewPrograms;

public class Singleton {
	private static Singleton instance=null;
	String str;
	private Singleton() {
		str="This is Singleton class";
	}
	
	public static Singleton getInstance() {
		if(instance==null) {
			instance=new Singleton();
		}
		return instance;
		
	}
	public static void sample() {
		System.out.println("sample");
	}
	
	public static void main(String[] args) {
		
		Singleton a=instance.getInstance();
		Singleton b=Singleton.getInstance();
		a.str=(a.str).toUpperCase();
		System.out.println(a.str);
		b.str=(b.str).toLowerCase();
		System.out.println(b.str);
		a.sample();
		System.out.println(a.str);
		
		
		
	}
}
