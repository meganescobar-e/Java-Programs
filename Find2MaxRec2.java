/**
 * CIS 4570-01
 * Find2MaxRec Assignment
 * @author Megan Escobar
 */
 
import java.util.Scanner;

public class Find2MaxRec2 {
 
	public static int MAX_VAL = 1000000;
	
    public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of at least 2 students: ");
		int numberOfStudents = input.nextInt();
		input.nextLine();
		
		if (numberOfStudents < 2) {
			numberOfStudents = 2;
		}	

		int[] numStudents = new int[numberOfStudents];	
		countStudents(numStudents,0);
		int [] smalls = new int [2];
		int sm = find(numStudents, 0, smalls);
		System.out.println(sm);
	}
	public static void countStudents (int [] numberStudents, int number){						
		Scanner input = new Scanner (System.in);
		
		if (number < numberStudents.length) {
			System.out.print("Enter a student name: ");
			String name = input.nextLine();
			System.out.print("Enter a student score: ");
			int score = input.nextInt();
			input.nextLine();
			numberStudents[number]= score;
	
			countStudents(numberStudents, number+1);		
		}
	}

    public static int find(int[] arr, int index, int [] smalls) {
        if(index == 0) {
            smalls[0] = arr[index];
            smalls[1] = Integer.MAX_VALUE;
            find(arr, index+1, smalls);
        } else if(index < arr.length){
            if(arr[index] < smalls[0]){
                smalls[1] = smalls[0];
                smalls[0] = arr[index];
            } else if(smalls[1] > arr[index]) {
                    smalls[1] = arr[index];
            }
            find(arr,index + 1, smalls);
        }
        return smalls[1];
    }
}
