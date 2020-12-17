package interviewPrograms;

public class SingletonImplementation {
	
	int x=10;
public static void imp() {
	Singleton instance = Singleton.getInstance();
	
	System.out.println(instance.str);
}
public static void main(String[] args) {
	imp();
}
}
