
/**
 * <h1> HelloCIN File Assignment </h1>
 * For the class CIS 2830-01
 *
 * @author Megan Escobar
 */
import java.util.Scanner;
import java.io.*;

public class HelloCIN {

    /**
     * @throws IOException throws exception if file cannot be opened
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        /*
         * String filename holds the name of a file
         * String CIN holds the user's writing in the file
         */
        Scanner keyboard = new Scanner(System.in);
        String filename;
        String CIN;

        System.out.println("Welcome! Enter a file name to contain your CIN: ");
        filename = keyboard.nextLine();

        /**
         * @param filename to write data to the file
         */
        PrintWriter outputFile = new PrintWriter(filename);

        System.out.print("Enter your CIN: ");
        CIN = keyboard.nextLine();

        /**
         * @param CIN to print user's input in file
         */
        outputFile.println(CIN);

        outputFile.close();
        System.out.println("Data written to the file. ");
    }
}
