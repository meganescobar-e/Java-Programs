
/**
 * <h1> For Loop Assignment </h1>
 * CIS 2830-01
 *
 * @author Megan Escobar
 */
import java.util.Scanner;

public class ForLoop {

    /**
     * @param args the command line argument
     */
    public static void main(String[] args) {
        //To receive input from user
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        //To hold the first integer
        double a = keyboard.nextInt();

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a larger integer ");
        //To hold the second integer
        double b = in.nextInt();

        //To hold the sum
        double sum = 0;
        //To hold the average
        double avg;
  /*
  The "if" statement is to ensure 
  the second integer entered is larger 
  than the first.
  If double b is not larger than double a
  the system will not run the "for" loop
  */
        /**
         * @param b second integer must be bigger than first
         * @param a first integer
         * @param sum sum of numbers between a and b
         * @param if to make sure b is bigger than a
         */
        if (b > a) {
            for (double i = a; i <= b; i++) {
                sum += i;
            }
  /*
  To calculate the average between
  the two integers entered and place
  the the sum on one line and the average
  on the second
  */
            /**
             * @param avg of both numbers entered
             */
            avg = (double) ((a + b) / 2);
            System.out.println("The sum of all integers between " + a + " and " + b + " is " + sum
                    + "\nThe average between " + a + " and " + b + " is " + avg);
        } else {
            System.out.println("That is not a larger integer ");
        }
    }
}
