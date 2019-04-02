/**
 * CIS 4570-01
 * CountVowels Assignment
 * @author Megan Escobar
 */

 import java.util.Scanner;
 public class CountVowels {
	
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter a string: ");
		String inputString = in.nextLine();
		String inputStringlc = inputString.toLowerCase();
		
		int totalCount;
		
		int aCount = 0;
		int eCount = 0;
		int iCount = 0;
		int oCount = 0;
		int uCount = 0;
		
		if (inputStringlc.contains("a")) {
			aCount++;
		}
		if (inputStringlc.contains("e")) {
			eCount++;
		}
		if (inputStringlc.contains("i")) {
			iCount++;
		}
		if (inputStringlc.contains("o")) {
			oCount++;
		}
		if (inputStringlc.contains("u")) {
			uCount++;
		}
		totalCount = aCount + eCount + iCount + oCount + uCount;
		
			if (totalCount == 1) {
				System.out.println("there is one vowel in string: " + "\"" + inputString + "\"");
			}
			else if (totalCount == 0) {
				System.out.println("there are no vowels in string: " + "\"" + inputString + "\"");
			}
			else {
				System.out.println("there are " + totalCount + " different vowels in string: " + "\"" + inputString + "\"");
			}
	}
 }


