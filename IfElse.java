/**
  class programming assignment 1
  if-else practice
  Megan Escobar CIS 20830-01
**/

import java.util.Scanner; 
public class IfElse 
{
     public static void main(String[] args) {
     
	 String day;										//To hold a day of the week
	 Scanner keyboard = new Scanner(System.in);
	 System.out.print("Enter the day of the week: ");   					//To get input from user
	 day = keyboard.nextLine();
/*
  If the day entered is not Monday,
  the system will print out 2 for Tuesday,
  3 for Wednesday, and so on. 
*/	 
	if(day.equalsIgnoreCase("Monday")) {							//To display the number of the week
	    System.out.println("The day is: 1");
	    }
	else if(day.equalsIgnoreCase("Tuesday")) {						
	   System.out.println("The day is: 2");
	   }
	else if(day.equalsIgnoreCase("Wednesday")) {
	   System.out.println("The day is: 3");
	   }
	else if(day.equalsIgnoreCase("Thursday")) {
	   System.out.println("The day is: 4");
	   }
	else if(day.equalsIgnoreCase("Friday")) {
	   System.out.println("The day is: 5");
	   }
	else if(day.equalsIgnoreCase("Satuday")) {
	   System.out.println("The day is: 6");
	   }
	else if(day.equalsIgnoreCase("Sunday")) {
	   System.out.println("The day is: 7");
	   }
	 System.exit(0); 									 //To indicate the program has stopped
	 }
}