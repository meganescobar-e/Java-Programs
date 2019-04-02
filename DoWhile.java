/*
*  Megan Escobar CIS 2830-01
*  Do-While Assignment
*/

import java.util.Scanner;
public class DoWhile {
  public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);                      
        System.out.println("Please enter an integer "); 
//To hold an integer 
        double a = keyboard.nextInt();     					                             
        double num1 = a;

/*
*  The purpose of creating the double num1 is to hold the original
*  value of a. If the system outputs a when running the DoWhile loop
*  the system will print out a++ until it no longer satifies the loop.
*  We want the system to print out the original value of a and not a++.
*/

        Scanner in = new Scanner(System.in);  
        System.out.println("Please enter a larger integer "); 
//To hold a second integer 

        double b = in.nextInt(); 						
    	double num2 = b;

	double sum = 0; 
	double avg;
/*
*  The inclusiong of an if statement around the DoWhile loop
*  is to ensure that the loop does not run at least once if the 
*  condition is not satisfied. Although the purpose of a DoWhile
*  loop is to run at least once, the if statement prevents the 
*  system from outputting wrong math. 
*/
if ( a < b){	

avg = (double)((a + b)/2);

do { 							
   sum += a;
   a++;  
   } 
while (b >= a); 
System.out.println("The sum of the numbers bewteen " + num1 + " and " + num2 + " is: " + sum 
		   + "."+ "\nThe average of " + num1 + " and " + num2 + " is: " + avg + ".");
    }
else {									
    System.out.print("That is not a larger integer. ");
    }

  }
}