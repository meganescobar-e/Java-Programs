/**
 * CIS 4570-01
 * AskInforPrintInfo Assignment
 * @author Megan Escobar
 */

import java.util.Scanner;
public class AskInfoPrintInfo{

   public static void main(String[] args){

	Scanner in = new Scanner (System.in);
	System.out.print("enter your name: ");
	String inputName = in.nextLine();

	System.out.print("enter your address (first line): "); 
	String inputAddress = in.nextLine();

	System.out.print("enter your address (second line): ");
	String inputAddress2 = in.nextLine();

	System.out.print("enter your phone number: ");
	String inputNumber = in.nextLine();

	System.out.println("Name: " + inputName); 
	System.out.println("address:");	
	System.out.println("    " + inputAddress);
	System.out.println("    " + inputAddress2);
	System.out.println("Phone: " + inputNumber);
	}
}