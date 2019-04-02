/**
 * CIS 4570-01
 * ClassifyPennies Assignment
 * @author Megan Escobar
 */
 import java.util.Scanner;

 public class ClassifyPennies {
 public static void main(String[] args) {

 float amount, quarter, dime, nickel, penny;
 int hundred, fifty, twenty, ten, five, one;

 Scanner in = new Scanner(System.in);

 System.out.print("enter amount of money with at most 2 decimal places: ");
 amount = in.nextFloat();

 hundred = (int) (amount / 100);
 fifty = (int) (amount % 100 / 50);
 twenty = (int) (amount % 100 % 50 / 20);
 ten = (int) (amount % 100 % 50 % 20 / 10);
 five = (int) (amount % 100 % 50 % 20 % 10 / 5);
 one = (int) (amount % 100 % 50 % 20 % 10 % 5);
 quarter = (float) (amount % 100 % 50 % 20 % 10 % 5 % 1 / 0.25);
 dime = (float) (amount % 100 % 50 % 20 % 10 % 5 % 1 % 0.25 / 0.10);
 nickel = (float) (amount % 100 % 50 % 20 % 10 % 5 % 1 % 0.25 % 0.10 / .05);
 penny = (float) (amount % 100 % 50 % 20 % 10 % 5 % 1 % 0.25 % 0.10 % .05 / .01);
 
	if (hundred != 0) {
	System.out.println(hundred + " 100 dollar bills");
	}
	if (fifty != 0) {
	System.out.println(fifty + " 50 dollar bills");
	}
	if (twenty != 0) {
	System.out.println(twenty + " 20 dollar bills");
	}
	if (ten != 0) {
	System.out.println(ten + " 10 dollar bills");
	}
	if (five != 0) {
	System.out.println(five + " 5 dollar bills");
	}
	if (one != 0) {
	System.out.println(one + " 1 dollar bills");
	}

	if ((int)quarter != 0) {
	System.out.println((int)quarter + " 25 cent coins");
	}
	if ((int)dime != 0) {
	System.out.println((int)dime + " 10 cent coins");
	}
	if ((int)nickel != 0) {
	System.out.println((int)nickel + " 05 cent coins");
	}
	if ((int)penny != 0) {
	System.out.println((int)penny + " 1 cent coins");
	}
 }
}