package interviewPrograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetCurrentDate {
public static void main(String[] args) throws IOException, InterruptedException, AWTException, ParseException {
	SimpleDateFormat form=new SimpleDateFormat("dd/MM/yy HH.mm.ss");
	Date dat=new Date();
	String format = form.format(dat);
	System.out.println(format);
	Date parse = new SimpleDateFormat("dd/MM/yy").parse(format);
	System.out.println(parse);
	File f=new File("WritiingDate.txt");
	FileWriter fw=new FileWriter(f);
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write(format);
	bw.close();
	
	//getting IP address of the system
	InetAddress localHost = InetAddress.getLocalHost();
	String hostAddress = localHost.getHostAddress();
	String hostName = localHost.getHostName();
	System.out.println("host name: "+hostName);
	System.out.println("host address: "+hostAddress);
	
	//open and close the notepad
	Runtime runtime = Runtime.getRuntime();
	Process process = runtime.exec("notepad.exe F://javanotepad1.text");
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	r.keyPress(KeyEvent.VK_SPACE);
	r.keyRelease(KeyEvent.VK_SPACE);
	
	r.keyPress(KeyEvent.VK_H);
	r.keyRelease(KeyEvent.VK_H);
	
	r.keyPress(KeyEvent.VK_I);
	r.keyRelease(KeyEvent.VK_I);
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_S);
	r.keyRelease(KeyEvent.VK_S);
	r.keyRelease(KeyEvent.VK_CONTROL);
	
	
	Thread.sleep(2000);
	//process.destroy();
	Thread.sleep(2000);
	System.out.println("File deleted succesfullly");
}
}
