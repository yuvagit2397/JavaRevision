package interviewprograms1;

public class CountTheNoOfObjectCreated {
	static int count=0;

	{
		count=count+1;
	}
public static void main(String[] args) {
	CountTheNoOfObjectCreated ob=new CountTheNoOfObjectCreated();
	CountTheNoOfObjectCreated ob1=new CountTheNoOfObjectCreated();
	CountTheNoOfObjectCreated ob2=new CountTheNoOfObjectCreated();
	System.out.println(count);
	
}
}
