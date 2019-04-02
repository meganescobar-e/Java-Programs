import java.util.Scanner; 

public class RecursiveBinarySearch {
     public static void main(String[] args) {

	int searchValue;			// value to search for
	int result;				// search result
	String input;				// a line of input
	char again;				// hold a single character

	int numbers [] = {101, 142, 147, 189, 199, 207, 222, 234, 289, 296, 310, 319,
			  388, 394, 417, 429, 447, 521, 536, 600};

	Scanner keyboard = new Scanner(System.in);

	System.out.print("Enter the value to search for: ");
	searchValue = keyboard.nextInt();

	result = binarySearch(numbers, 0, (numbers.length - 1), searchValue);

	if (result == -1) {
	   System.out.println(searchValue + " was not found. ");
	}
	else { 
	   System.out.println(searchValue + " was found at element " + result);
	}
     }
public static int binarySearch(int[] array, int first, int last, int value) {
// mid-point of the search
       int middle; 

       if (first > last){
	  return -1;
// calculate the middle position
       middle = (first + last) / 2;
	}
// search for the value
       else if ((array[middle]) == value){
	  return binarySearch(array, middle + 1, last, value);
	}
       else{
	  return binarySearch(array, first, middle - 1, value);
	}
}
}