/**
 * <h1> HelloAgain </h1>
 * For CIS 2830-01
 * 
 * @author Megan Escobar
 */

import java.util.Scanner;
import java.io.*;

public class HelloAgain{
    /**
     * 
     * @param args the command line arguments
     * @throws IOException if file cannot be opened
     */
     public static void main(String[] args) throws IOException {

	Scanner keyboard = new Scanner(System.in);

// Get the file name
	System.out.print("Enter the name of a file: ");
	String filename = keyboard.nextLine();

/* 
*  Open the file entered. The scanner object 
*  uses the file as its source of input
*/  
        /**
         * @param File creates a file object
         * @param filename creates File object that represents a file
         * @param inputFile to obtain data from the file
         */
	File file = new File(filename);
	Scanner inputFile = new Scanner(file);

// Read first line from the file
	String firstLine = inputFile.nextLine();

	System.out.println("The first line in the file is: " + firstLine);

// Close the file
	inputFile.close();
     }
}
