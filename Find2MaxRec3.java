/**
 * CIS 4570-01
 * Find2MaxRec Assignment
 * @author Megan Escobar
 */
 
import java.util.Scanner;

public class Find2MaxRec3 {
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of at least 2 students: ");
		int numberOfStudents = input.nextInt();
		input.nextLine();
		
		if (numberOfStudents < 2) {
			numberOfStudents = 2;
		}	

		double[] numStudents = new double[numberOfStudents];	
		String[] nameStudents = new String[numberOfStudents];
		
		getStudents(numStudents,nameStudents,0);
		
		System.out.println("Top two students: ");
		System.out.println(getHighestName(nameStudents, numStudents) + "'s " + "score is " + getHighest(numStudents) +
		"\n" + getSecondHighestName(nameStudents, numStudents) + "'s " + "score is " + getSecondHighest(numStudents));
	}
	
	public static void getStudents (double [] numberStudents, String [] nameStu, int number) {						
		Scanner input = new Scanner (System.in);						
		
		if (number < numberStudents.length) {	
			System.out.print("Enter a student name: ");
			String name = input.nextLine();
			System.out.print("Enter a student score: ");
			double score = input.nextDouble();
			input.nextLine();		
			
			numberStudents[number]= score;
			nameStu[number]= name;
			getStudents(numberStudents, nameStu, number+1);
		}
	
	}
	
	public static double getHighest(double[] array) {
        return setHighest(array, 0, array[0]);
    }
	
	public static double setHighest(double[] array, int ii, double high) {
        if (ii == array.length) {
            return high;
		}

        if (high < array[ii]) {
            high = array[ii];
		}
		
        return setHighest(array, ii + 1, high);
    }
	
	public static String getHighestName(String [] nameArray, double [] array) {
		return setHighestName(nameArray, array, 0, nameArray[0], array[0]);
	}
	
	public static String setHighestName(String [] nameArray, double [] array, int ee, String highestStudent, double high) {
		if (ee == nameArray.length) {
            return highestStudent;
		}

        if (high < array[ee]) {
            highestStudent = nameArray[ee];
		}
		
    return setHighestName(nameArray, array, ee + 1, highestStudent, high);
    }
	
	public static double getSecondHighest(double [] array) {
		return setSecondHighest(array, 0, array[0], array[1]);
	}
	
	public static double setSecondHighest(double[] array, int index, double high, double secondHigh) {
		if (index < array.length) {
            if (high < array[index]) {
				secondHigh = high;
				high = array[index];
			}
			
			else if (array[index] > secondHigh && array[index] != high) {
				secondHigh = array[index];
			}
			
			return setSecondHighest(array, index + 1, high, secondHigh);
		}
		return secondHigh;
    }
	
	public static String getSecondHighestName(String [] nameArray, double [] array) {
		return setSecondHighestName(nameArray, array, 0, nameArray[0], nameArray[1], array[0], array [1]);
	}
	
	public static String setSecondHighestName(String [] nameArray, double[] array, int indexx, String highStr, String secondHighStr, double high, double secondHigh) {
		if (indexx < nameArray.length) {
            if (high < array[indexx]) {
				secondHighStr = highStr;
				highStr = nameArray[indexx];
			}
			
			else if (array[indexx] > secondHigh && array[indexx] != high) {
				secondHighStr = nameArray[indexx];
			}
			
			return setSecondHighestName(nameArray, array, indexx + 1, highStr, secondHighStr, high, secondHigh);
		}
		return secondHighStr;
    }
}
 