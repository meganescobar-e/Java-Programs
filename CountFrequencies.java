/**
 * CIS 4570-01
 * CountFrequencies Assignment
 * @author Megan Escobar
 */
 
import java.io.*;
import java.util.*;

public class CountFrequencies {
	
public static void main(String [] args) { 
	TreeMap<String, Integer> map = new TreeMap<>();
	Scanner input = new Scanner(System.in);
	BufferedReader reader = null;
	File newFile = null; 
	int count;
	
	System.out.print("enter file name: ");
	String filename = input.nextLine();
	
	try {	
		newFile = new File(filename); 
		if (! newFile.exists()) { 
			System.out.println("there was a problem!");
			throw new FileNotFoundException(filename + " (No such file or directory)");
		}
		
		reader = new BufferedReader(new FileReader(newFile));
		String line = reader.readLine();
		
		while (line != null) {
			
			if (line != null) {
				String[] words = line.split("\\W");
				for (String word : words) {
				
				if (word.equals("")) {
					line = null;
				}
				
				else if (map.containsKey(word)) {
					count = map.get(word);
					map.put(word, count + 1);
				}
				
				else {
					map.put(word, 1);
				}
				}
			}
			line = reader.readLine();	
		}
		reader.close();
	}
	
	catch (IOException e) {
		System.out.print(e.toString());
	}
	for (Map.Entry<String, Integer> entry : map.entrySet()) {
		System.out.println(entry.getKey() + "  " + entry.getValue());
	}
}
}