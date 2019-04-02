/**
 * CIS 4570-01
 * DivisibleBy13Plus Assignment
 * @author Megan Escobar
 */

 import java.util.List;
 import java.util.ArrayList;
 import java.util.Scanner;

 public class DivisibleBy13Plus {
   
     public static void main(String[] args) { 
	 
     List<Integer> userInputArray = new ArrayList<Integer>(10);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any integer: ");

        int count = 0;
	    int number;

        do {
		number = input.nextInt();

				if (number == 0) {
				System.out.println(number +" is divisible by 13, 17 or 19");
				}		
				else if (count >= 10) {
				break;
				}
				else if (number % 13 == 0 || number % 17 ==0 || number % 19 == 0) {
				System.out.println(number +" is divisible by 13, 17 or 19");
				userInputArray.add(number);
				System.out.print("Enter any integer: ");
				}
				else {
                    System.out.println(number +" is NOT divisible 13, 17 or 19");
                    userInputArray.add(number);
					System.out.print("Enter any integer: ");
                }
        count++;
        } while (number != 0);       
	}
}

