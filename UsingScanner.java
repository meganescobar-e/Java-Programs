/**
 * CIS 4570-01
 * UsingScanner Assignment
 * @author Megan Escobar
 */

import java.util.Scanner; 

public class UsingScanner {
   public static void main(String [] args) {

	Scanner in = new Scanner (System.in);

	System.out.print("please enter a integer: ");
	int integer1 = in.nextInt();
	System.out.println("I read an integer: " + integer1);
	
	System.out.print("please enter a double: ");
	double double1 = in.nextDouble();
	in.nextLine();
	System.out.println("I read an double: " + double1);

	System.out.print("please enter a String: ");
	String string1 = in.nextLine();
	System.out.println("I read a String: " + string1);
	
	}
}
