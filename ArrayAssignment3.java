/*
* Megan Escobar CIS 2830-01
* Array Assignment
*/

import java.util.List;
import java.util.ArrayList;
import java.util.regex.*;
import java.util.Scanner;

public class ArrayAssignment3{
     public static void main(String[] args) { 

/*
*  This format of the array allows for the 
*  input to be a String. This is necessary for 
*  later methods.
*/
	List<String> userInputArray = new ArrayList<String>(10);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 integers, if you want to stop inputting integers "
			    + "enter 0. ");
/* 
*  String the input from the scanner because 
*  conditions like inputLine != can only work 
*  on integers.
*/
	int count =0;
	String inputLine;
/*
*  The do-while will only execute inputLine = input.nextLine();
*  if the input does not equal zero. As the first printed line
*  of the program says, entering zero will stop the program
*  from accepting anymore input.
*/
            do {
		inputLine = input.nextLine();
/*
*  In the first if-statement, the inputLine must have have a length
*  of more than zero. Being a String, this means inputLine cannot have
*  an empty value. This does not allow the user to just press ENTER
*/
		if (inputLine.length() ==0) {
		   System.out.println("Please enter at least one integer. Try again. ");
		   System.exit(0);
		   }
/* 
*  The second condition requires the input to be a digit. Because 
*  inputLine is a String it can accept letters. However, I set a 
*  condition to only allow digits.
*/
                else if (!(inputLine.matches("\\d+"))){
		    System.out.println("Sorry you have entered an invalid input. ");
		    System.exit(0);
		}
/*
*  The third condition limits the array to 10 integers.
*/   		
		else if (count >= 10) {
		     System.out.println("Sorry, you have exceeded the array. The program"
					+ " will only print the first 10 integers. ");
		     break;
		}
/*
*  The fourth condition adds the input from the user into
*  the array 'userInputArray' defined in line 19 if the input
*  is not 0.
*/
		else if (!(inputLine.equals("0"))) {
                    System.out.println("The integer you entered is: " + inputLine);
                    userInputArray.add(inputLine);
                } 
/*
*  The default printed line if the other conditions return false
*  ends the program. This is because if the other conditions return
*  false, it is because a 0 was ended which was expressed in the first
*  printed line as a means to stop the program.
*/
		else {
                    System.out.println("You entered 0, the program will now stop"
					+ " accepting input. ");
                    break;
                }
/*
*  Therefore, under these conditions the do-while loop
*  will add input into the userInputArray array as long as 
*  a zero is not entered.
*/	
	      count++;
            } while (!(inputLine.equals("0")));

         System.out.println("The numbers you entered are: " + userInputArray);
        
	}
}