package interviewPrograms;

public class RemoveSpaceWithoutWhiteSpace {
public static void main(String[] args) {
	String s="life             tastes           sweeter";
	
	String[] s1 = s.split(" ");
	String add="";
	
	for (int i = 0; i < s1.length; i++) {
		if(s1[i].length()==0) {
			continue;
		}
		add=add+s1[i];
	}
	System.out.println(add);
}
}
