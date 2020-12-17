package angryBird;

public class Mythread1 extends Thread {
MyThreadEx t;
Mythread1(MyThreadEx t){
	this.t=t;
}
public void run() {
	t.mul(10);
}
/*public static void main(String[] args) {
	Table table=new Table();
	Mythread1 ob=new Mythread1(table);
	ob.start();
}*/
}
