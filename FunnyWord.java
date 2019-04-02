/**
 * CIS 4570-01
 * FunnyWord Assignment
 * @author Megan Escobar
 */
 
 import java.util.Scanner;
 
 public class FunnyWord {
	 
 public String isPalindrome(char[] word){
    int i1 = 0;
    int i2 = word.length - 1;
    while (i2 > i1) {
        if (word[i1] != word[i2]) {
            return " that is not funny";
        }
        ++i1;
        --i2;
    }
	return " funny!";
  }
  
 public static void main(String[] args) {
	FunnyWord newWord = new FunnyWord();
	Scanner in = new Scanner(System.in);
	String input;
	String word;
	
	do {
		System.out.print("Enter a String: ");
		input = in.nextLine().toLowerCase();
		word = input.replaceAll("[\\W]", "");
        char[] wArray = word.toCharArray(); 
        System.out.println(newWord.isPalindrome(wArray)); 

	} while (!(word.equals("end")));
	  System.exit(0);
 }
 }
