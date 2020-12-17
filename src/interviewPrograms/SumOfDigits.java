package interviewPrograms;

public class SumOfDigits {
public static void main(String[] args) {
long x=12345678123456789l;

	int i,j=0;
	while(x>0) {
		i= (int) (x%10);
		j=j+i;
		x=x/10;
	}
	System.out.println(j);
	/*String s="i am yuvasri.i am a girl";
	String[] split = s.split("[.]");
	System.out.println(split.length);
	for (int k = 0; k < split.length; k++) {
		System.out.println(split[k]);
	}*/
}
}
