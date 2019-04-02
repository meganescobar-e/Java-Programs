/**
 * CIS 4570-01
 * NonDuplicateWords Assignment
 * @author Megan Escobar
 */
 
import java.io.*;
import java.util.*;

public class NonDuplicateWords {
	
public static void main(String [] args) {
	TreeSet<String> uniqueWords = new TreeSet<>();
	Scanner input = new Scanner (System.in);
	
	System.out.print("enter file name: ");
	String filename = input.nextLine();
	BufferedReader reader = null;
	File newFile = null; 

	try {	
		newFile = new File(filename); 
		if (! newFile.exists()) { 
			System.out.println("there was a problem!");
			throw new FileNotFoundException(filename + " (No such file or directory)");
		}
		
		reader = new BufferedReader(new FileReader(newFile));
		String line = reader.readLine();
		
		while (line != null) {

			line = line.replaceAll("[^a-zA-Z0-9'\\- ]", "");
			String[] words = line.split("\\W");
			
			for (String word : words) {
				if (word.equals("")) {
					line = null;
				}
				else {
				uniqueWords.add(word);
				}
			}
			line = reader.readLine();	
		}
		reader.close();
		System.out.println("Display words in ascending order:");
		
	}
	
	catch (IOException e) {
		System.out.print(e.toString());
	}

	for (String element : uniqueWords) {
		System.out.println(element);

	}
}
}
