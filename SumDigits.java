/**
 * CIS 4570-01
 * SumDigits Assignment
 * @author Megan Escobar
 */

import java.util.Scanner;

public class SumDigits {
	
    public static void main(String [] args) {
		 Scanner in = new Scanner(System.in);
         System.out.print("Enter an integer between 0 and 1000: ");
         int input = in.nextInt();
		 
		 int hundreds = input / 100 ;									// the hundreds place
         int remainder = input % 100 ;									// the remainder
         int tens = remainder / 10 ;									// the tens place
         int ones = remainder % 10 ;									// the ones place
		 
		 int result = hundreds + tens + ones;
         
		 System.out.println("The sum of all digits in " + input + " is " + result );
     }
} 
