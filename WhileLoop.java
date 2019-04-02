/*
*  Megan Escobar 2830-01
*  While Loop Assignment
*/ 

import java.util.Scanner;
public class WhileLoop {
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

/*
*  Establishing the variables as doubles
*  allows for the values returned to be 
*  decimals. This is important for the average
*  so it does not return a rounded number.
*/

	double sum = 0; 
	double avg;

/*
*  The while loop alone is not enough
*  to create a condition. If there is no
*  if statement the program will still produce
*  a sum even though we specified that b is
*  required to be larger than a. Therefore, b
*  is tested against an if statement. If it does not
*  satisfy the if statement, the programs does not 
*  run a sum and average operation on the integers.
*/

if (a < b) { 								
    avg = (double)((a + b)/2); 
    while (a <= b) {								
      sum += a;
      a++;
    }
System.out.println("The sum of the numbers bewteen " + num1 + " and " + num2 + " is: " + sum 
		   + "."+ "\nThe average of " + num1 + " and " + num2 + " is: " + avg + ".");
System.exit(0);
	}

else {									
    System.out.print("That is not a larger integer. ");
    }
  }
}   