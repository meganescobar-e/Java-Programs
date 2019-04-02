/**
 * CIS 4570-01
 * StringsTest Assignment
 * @author Megan Escobar
 */

import java.util.Scanner;
public class StringsTest {

   public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	System.out.print("please enter String 1: ");
	String string1 = in.nextLine();

	System.out.print("please enter String 2: ");
	String string2 = in.nextLine();

	System.out.print("please enter String 3: ");
	String string3 = in.nextLine();
	
	System.out.print("please enter String 4: ");
	String string4 = in.nextLine();

	String sentence = (string1 + " " + string2 + " " + string3 + " " + string4);
	
	   System.out.println(sentence);

	   System.out.println(sentence.toUpperCase());

	   System.out.println(sentence.toLowerCase());

	   int stringTotal = sentence.length();
	   System.out.println(stringTotal);

	   char second = string1.charAt(1);
	   char last = string4.charAt(string4.length() - 1);
	   System.out.println(second);
	   System.out.println(last);
	   }
}



