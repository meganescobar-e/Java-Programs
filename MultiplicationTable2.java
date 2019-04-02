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
	int i=0;
	
        while (i <= 11)
        {
		i++;
			System.out.printf("%2d * %2d = %2d%n",i,num,(num * i));
        }
 }
 }