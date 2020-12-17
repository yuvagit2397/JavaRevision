package angryBird;

public class Mythread2 extends Thread {
MyThreadEx t;
Mythread2(MyThreadEx t){
	this.t=t;
}
public void run() {
	t.mul(50);
}

}
