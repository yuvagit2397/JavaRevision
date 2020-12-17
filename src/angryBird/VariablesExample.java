package angryBird;

public class VariablesExample extends SuperEx {
//we cant use this and super keyword inside a static method
	int x=10;
	static int y=10;
static final int z=16;
	
	public  void example() {
		int x=9;
		System.out.println(x);
		this.x=z+5;
		System.out.println(this.x);
		super.example();
	
}
	VariablesExample(){
		int s=this.x;
		this.example();
		System.out.println("child");
	
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		VariablesExample ob=new VariablesExample();
		System.out.println(ob.z);
		ob.example();
		SuperEx ob1 =new SuperEx();
		
	}
}
