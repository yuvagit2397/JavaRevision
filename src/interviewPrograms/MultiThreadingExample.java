package interviewPrograms;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class MultiThreadingExample extends Thread {

	public void run() {
		
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
	}

}
