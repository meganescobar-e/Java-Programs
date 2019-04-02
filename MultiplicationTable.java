/**
 * CIS 4570-0num
 * MultiplicationTable Assignment
 * @author Megan Escobar
 */
 
import java.util.Scanner;
 
public class MultiplicationTable {
 
public static void main(String [] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("enter an integer: ");
	int num = in.nextInt();
	int num2 = 12;
	displayMult(num, num2);
}

public static void displayMult(int number1, int number2) {
	if ( number2 != 1 ) {
		displayMult(number1, number2-1);
	}
	System.out.printf("%2d * %2d = %2d%n",number2 ,number1 ,(number1 * number2));
}}