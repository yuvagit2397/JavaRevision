package interviewPrograms;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Sample {
	
public static void main(String[] args) {
	List<Integer> li=new ArrayList<>();
	Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    System.out.println( sdf.format(cal.getTime()) );
	for(int i=0;i<=40000000;i++) {
		li.add(i);
	}
	Calendar cal1 = Calendar.getInstance();
    SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
    System.out.println( sdf1.format(cal1.getTime()) );
}
}
