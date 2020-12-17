package angryBird;

public class MyThreadEx {
public synchronized void mul(int a) {
for(int i=1;i<=10;i++) {
	System.out.println(i*a);
}
} 
}
