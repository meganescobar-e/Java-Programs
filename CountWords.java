/**
 * CIS 4570-0numbers
 * CountWords Assignment
 * @author Megan Escobar
 */
 
import java.util.Scanner;
import java.util.ArrayList;
 
public class CountWords {

public static void wordCount(ArrayList <String> list) {
	
	int isChecked[] = new int[list.size()];

	for (int i = 0; i < list.size(); i++) {
		int count = 0;
            
		for (int j = 0; j < list.size(); j++) {
            
			if (list.get(j).equals(list.get(i))) {
			count += 1;
			if(i!=j)isChecked[j] = 1;
			}	
		}
            
	if(count > 0 && count == 1) {
		System.out.println(list.get(i) + " occurs " + count + " time");
	}
        
	else if(count > 1 && isChecked[i]==0) {
		System.out.println(list.get(i) + " occurs " + count + " times");
	}
	
	} 
}
	
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	ArrayList <String> numList = new ArrayList <String>();
	String input;
	String word;
	int count = 0;
        
	System.out.print("Enter at most 1000 lines:\nfinish by entering a line containing only 0: ");
		
		do
		{
			input = in.nextLine();
			if(input.equals("0")){
				break;
			}
			
			numList.add(input);
			count += 1;			
		}
		while (!input.equals("0"));
		wordCount(numList);    
}}