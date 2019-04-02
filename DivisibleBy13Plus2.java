/**
 * CIS 4570-01
 * DivisibleBy13Plus Assignment
 * @author Megan Escobar
 */

 import java.util.List;
 import java.util.ArrayList;
 import java.util.Scanner;

 public class DivisibleBy13Plus2 {
   
     public static void main(String[] args) { 
	 
     List<Integer> userInputArray = new ArrayList<Integer>(10);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");

        int count = 0;
	    int number;

        do {
		number = input.nextInt();

				if (number == 0) {
				System.out.println(number +" is NOT divisible by 13, 17 or 19");
				System.exit(0);
				}		
				else if (count >= 10) {
				break;
				}
				else if (number % 13 == 0 || number % 17 ==0 || number % 19 == 0) {
				System.out.println(number +" is divisible by 13, 17 or 19");
				userInputArray.add(number);
				}
				else {
                    System.out.println(number +" is NOT divisible by 13, 17 or 19");
                    break;
                }

        count++;
        } while (number != 0);

         System.out.println("The numbers you entered are: " + userInputArray);
        
	}
}

