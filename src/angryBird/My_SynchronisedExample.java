package angryBird;

public class My_SynchronisedExample {
public static void main(String[] args) {
		MyThreadEx table=new MyThreadEx();
		Mythread1 ob=new Mythread1(table);
		Mythread2 ob2=new Mythread2(table);
		ob.start();
		ob2.start();
		
}

}
