import java.math.BigDecimal;
import java.util.Scanner;

public class ClassifyPennies {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

BigDecimal number;
int hundred;
int fifty;
int twenty;
int ten;
int five;
int one;
int quarter;
int dime;
int nickel;
int penny;

System.out.print("enter amount of number with at most 2 decimal places: ");
number = input.nextFloat();

hundred = (int) (number / 100); 
fifty = (int) (number % 100 / 50); 
twenty = (int) (number % 100 % 50 / 20); 
ten = (int) (number % 100 % 50 % 20 / 10); 
five = (int) (number % 100 % 50 % 20 % 10 / 5); 
one = (int) (number % 100 % 50 % 20 % 10 % 5); 
quarter = Math.round( (number % 100 % 50 % 20 % 10 % 5 % 1 / 0.25)); 
dime = Math.round((number % 100 % 50 % 20 % 10 % 5 % 1 % 0.25 / 0.10)); 
nickel = Math.round((number % 100 % 50 % 20 % 10 % 5 % 1 % 0.25 % 0.10 / .05)); 
penny = Math.round((number % 100 % 50 % 20 % 10 % 5 % 1 % 0.25 % 0.10 % .05 / .01)); 


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

if (quarter != 0) {
System.out.println(quarter + " 25 cent coins");
}
if (dime != 0) {
System.out.println(dime + " 10 cent coins");
}
if (nickel != 0) {
System.out.println(nickel + " 05 cent coins");
}
if (penny != 0) {
System.out.println(penny + " 1 cent coins");
}

}
}

