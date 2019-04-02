/**
 * CIS 4570-0num
 * MultiplicationTable Assignment
 * @author Megan Escobar
 */
 
 import java.util.Scanner;
 
 public class MultiplicationTable1 {
 
 public static void main(String [] args) {
 
	Scanner in = new Scanner(System.in);
	System.out.print("enter an integer: ");
	int num = in.nextInt();
	
        for(int i=1; i <= 12; i++)
        {
            System.out.printf("%2d * %2d = %2d%n",i,num,(num * i));
        }
 }
 }