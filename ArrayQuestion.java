/*
* Megan Escobar CIS 2830-01
* Array Assignment
*/

import java.util.List;
import java.util.ArrayList;
import java.util.regex.*;
import java.util.Scanner;

public class ArrayQuestion{
     public static void main(String[] args) { 

List<String> userInputArray = new ArrayList<String>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 Numbers ");
        int count = 0;
        String x;
	String inputLine;
		
        try {
            do {inputLine = input.nextLine();
		if (inputLine.length() ==0) {
		   System.out.println("Please enter at least one integer. Try again. ");
		   System.exit(0);
		   }
                else if (!(inputLine.matches("\\d+"))){
		    System.out.println("Sorry you have entered an invalid input. ");
		    System.exit(0);
		}
		else if (!(inputLine.equals("0"))) {
                    System.out.println("Given Number is " + inputLine);
                    userInputArray.add(inputLine);
                } else {
                    System.out
                            .println("Program will stop Getting input from USER");
                    break;
                }
                count++;
            } while (!(inputLine.equals("0")) && count < 10);

            System.out.println("Numbers from USER : " + userInputArray);
        } catch (Exception e) {
            System.out.println("Something went wrong :-( ");
        }
		
	}
}