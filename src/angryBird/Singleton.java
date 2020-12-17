package angryBird;

public class Singleton {
	private static Singleton singleinstance = null;
	public String str;

	private Singleton() {
		str = "am singleton design pattern";
	}

	public static  Singleton getInstance() {
		if (singleinstance == null) {
			singleinstance = new Singleton();
		}
		return singleinstance;

	}

	public static void main(String[] args) {
   Singleton x = Singleton.getInstance();
   Singleton y = Singleton.getInstance();
  x.str = (x.str).toUpperCase();
   System.out.println(x.str);
   System.out.println(y.str);
	}
}
