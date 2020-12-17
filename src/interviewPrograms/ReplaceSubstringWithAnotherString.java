package interviewPrograms;

public class ReplaceSubstringWithAnotherString {
	public static void replaceEx() {
		String str = "I use selenium webdriver. selenium is a tool for web applications automation.";
	
	String[] split = str.split("selenium");
	
	String toReplace="firefox";
	StringBuffer sb=new StringBuffer();
	/*int i=0;
	for (String word : split) {
		if(i!=split.length-1) {
			sb.append(word).append(toReplace);
		}else {
			sb.append(word);
		}
		i++;
	}
	System.out.println(sb);*/
	for (int i = 0; i < split.length; i++) {
		String st= split[i];
		sb.append(st).append(toReplace);
		
	}
	System.out.println(sb);
	
	}
	public static void main(String[] args) {
		replaceEx();
	}
}
//I use 
//webdriver. 
//is a tool for web applications automation.

