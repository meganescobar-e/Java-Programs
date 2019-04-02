import java.util.Scanner;
import java.util.regex.*;
public class Dem {
public static void main(String [] args) {
Scanner in = new Scanner(System.in);
String input = in.nextLine();
if (input.matches("^\\d+([.]\\d{2})?")) {
		 int newValue = Integer.parseInt(input);
		 System.out.print(newValue);
	 }
	 else {
		 System.out.print("error");
	 }
	 
	 
	}
}