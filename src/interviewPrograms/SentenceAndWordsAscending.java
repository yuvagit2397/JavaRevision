package interviewPrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SentenceAndWordsAscending {
public static void main(String[] args) throws IOException {
	List<String> li=new ArrayList<String>();
	String filePath = "D:\\yuvasri_revision\\Java_Revision\\src\\wordcountfile.txt";
	FileReader file = new FileReader(filePath);
	BufferedReader br = new BufferedReader(file);
	String read="";
	String sentence="";		
	while((read=br.readLine()) !=null) {
		sentence=sentence.concat(read);
}
	System.out.println(sentence);
	int wordCount=0;
	String[] senten = sentence.split("\\.");
	for (int i = 0; i < senten.length; i++) {
		for (int j = i+1; j < senten.length; j++) {
			if (senten[i].compareToIgnoreCase(senten[j])>=0) {
				String temp=senten[i];
				senten[i]=senten[j];
				senten[j]=temp;
			}

		}
			}
	System.out.println("The ascending sentence are");
	for (int i = 0; i < senten.length; i++) {
		System.out.println(senten[i]);
	}
	
	for (int i = 0; i < senten.length; i++) {
		String[] split = senten[i].split(" ");
		for (int l = 0; l < split.length; l++) {
			li.add(split[l]);
		}}
		for (int j = 0; j < li.size(); j++) {
			for (int k = j+1; k < li.size(); k++) {
				if (li.get(j).compareToIgnoreCase(li.get(k))>0) {
					String flag=li.get(j);
					li.set(j, li.get(k));
					li.set(k, flag);
					
				}
			}
		
	}
		System.out.println(li);
}
}
