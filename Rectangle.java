/**
 * CIS 4570-01
 * Rectangle Assignment
 * @author Megan Escobar
 */
 
 import java.util.Scanner;

 public class Rectangle {
 
 private double width;
 private double length;

 public double getWidth() {
 return width;
 }

 public void setWidth(double width) {
 this.width = width;
 }

 public double getLength() {
 return length;
 }

 public void setLength(double length) {
 this.length = length;
 }

 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	Rectangle rectangle1 = new Rectangle();
	System.out.print("enter length for rectangle 1: ");
	rectangle1.setLength(in.nextDouble());

	System.out.print("enter width for rectangle 1: ");
	rectangle1.setWidth(in.nextDouble());

	Rectangle rectangle2 = new Rectangle();
	System.out.print("enter length for rectangle 2: ");
	rectangle2.setLength(in.nextDouble());

	System.out.print("enter width for rectangle 2: ");
	rectangle2.setWidth(in.nextDouble());

	Rectangle rectangle3 = new Rectangle();
	System.out.print("enter length for rectangle 3: ");
	rectangle3.setLength(in.nextDouble());

	System.out.print("enter width for rectangle 3: ");
	rectangle3.setWidth(in.nextDouble());

	System.out.println("now lets print the rectangles:");

	System.out.println("1. width: " + rectangle1.getWidth());
	System.out.println("   length: " + rectangle1.getLength());

	System.out.println("2. width: " + rectangle2.getWidth());
	System.out.println("   length: " + rectangle2.getLength());

	System.out.println("3. width: " + rectangle3.getWidth());
	System.out.println("   length: " + rectangle3.getLength());

}
}