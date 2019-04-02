/**
 * <h1> Array Assignment </h1>
 * CIS 2830-01
 * @author Megan Escobar
 */
import java.util.Scanner;
public class ArrayAssignment4{

    public static void main(String[] args) {
		int count=0;
		
		Scanner in = new Scanner(System.in);		
		System.out.println("enter a string: ");
		
		String str1 = in.nextLine();
		int number = Integer.parseInt(str1);
		
		if(str1.contains("a")) {
			count = count + 1; 
		}
		System.out.format("\n Number of Digits in a Given Number = %d", count);
	}
}
