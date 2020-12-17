package interviewPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CountNoOfWordsInNotepad {
	public static void main(String[] args) throws IOException {
		
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
		String[] senten = sentence.split("[.]");
		System.out.println("the no of sentences "+senten.length);
		for (int i = 0; i < senten.length; i++) {
			String[] split = senten[i].split(" ");
			for (int j = 0; j < split.length; j++) {
				String word=split[j];
				System.out.println(word);
				wordCount++;
			}
		}
		System.out.println("the no of words "+wordCount);
		}
	
}
