/**
   class programming assignment 2
   switch practice
   Megan Escobar 2830-01
**/

import java.util.Scanner;
public class SwitchAssignment {
     public static void main(String[] args) {

	 String day; 											//To hold a day of the week
	 Scanner keyboard = new Scanner(System.in);
	 System.out.print("Enter the day of the week: ");						//To get a day of the week
	 day = keyboard.nextLine();

/**
   The switch statement evaluates it's
   expression and compares with values
   of each case label.
**/
	 
	 switch (day) {
	    case "Monday": 
		   System.out.println("The day is: 1");
		   break;										//To terminate the switch
		case "Tuesday":
		   System.out.println("The day is: 2");
		   break;
		case "Wednesday":
		   System.out.println("The day is: 3");
		   break;
		case "Thursday":
		   System.out.println("The day is: 4");
		   break;
		case "Friday":
		   System.out.println("The day is: 5");
		   break;
		case "Saturday":
		   System.out.println("The day is: 6");
		   break;
		case "Sunday":
		   System.out.println("The day is: 7");
		   break;
		default:										 //To provide output to an invalid entry
		   System.out.println("Invalid day");
	 }
	 }
}