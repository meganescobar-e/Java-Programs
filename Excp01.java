/**
 * CIS 4570-01
 * Excp01 Assignment
 * @author Megan Escobar
 */

import java.util.*;
 
public class Excp01 {
	
public static int myMethod(Scanner input) {
	int jj = 0;
	while (true){
		try {
			jj = input.nextInt();
			if (jj > 100) {		
				throw new IllegalArgumentException();			
			}
			else {
				break;
			}
		}
		catch(InputMismatchException e) {
			System.out.print("try again, enter an int: ");
			input.nextLine();
		}	
		catch (IllegalArgumentException e) {
			System.out.print("Exception thrown--number: " + jj);	
			System.exit(0);
		}
	}
return jj;
}

public static void main(String [] args){
	int counter = 0;
	double average = 0;
	int sum = 0;
	int k = 0;
	int n = 0;
	int x = 0;
	Scanner input = new Scanner(System.in);
	
	System.out.print("enter nr of integers (max 10) to be processed: ");
	
	while (true){
		n = myMethod(input);
		if (n < 0 || n >= 10){
					System.out.print("out of bounds, try again, enter an int: ");
					input.nextLine();
				}
		else {
			break;
		}
	}
	
	System.out.println("ok, now lets loop " + n + " times");
	while (counter < n){
		System.out.print("enter an int: ");
		x = myMethod(input);
		counter++;
		sum = sum + x;
	}
	
	average= (double)sum/counter;
	System.out.println("average is: " + average);
	
	System.out.print("enter an integer less than 200: ");
	while (true){
		try{
			k = input.nextInt();
			if (k >= 200){
				System.out.print("out of bounds, try again, enter an int: ");
				input.nextLine();
			}
			else {
				break;
			}
		}
		catch(InputMismatchException e) {
			System.out.print("try again, enter an int: ");
			input.nextLine();
		}	
		}
	System.out.print("integer was: " + k);
}
}