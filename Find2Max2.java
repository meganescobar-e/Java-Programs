/**
 * CIS 4570-01
 * Find2Max Assignment
 * @author Megan Escobar
 */
 
import java.util.Scanner;

public class Find2Max {
 
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of at least 2 students: ");
		int numberOfStudents = input.nextInt();
		input.nextLine();
		
		if (numberOfStudents < 2) {
			numberOfStudents = 2;
		}	

		double score; 						
		double highest = 0; 			
		double secondHigest = 0;	
		String name = ""; 		
		String student1st = ""; 	
		String student2nd ="";	
		
		
				
		for (int i = 0; i < numStudents.length; i++) {
			
			double[] numStudents = new double[numberOfStudents];
			
			System.out.print("Enter a student name: ");
			name = input.nextLine();
			System.out.print("Enter a student score: ");
			score = input.nextDouble();
			input.nextLine();		

			if (i == 0) {
				// Make the first student the highest scoring student so far
				highest = score;
				student1st = name;
			}
			else if (i == 1 && score > highest) {
				// Second student entered scored
				// higher than first student
				secondHigest = highest;
				highest = score;
				student2nd = student1st;
				student1st = name;	
			}
			else if (i == 1) {
				// Second student entered scored
				// lower than first student
				secondHigest = score;
				student2nd = name;
			}		
			else if (i > 1 && score > highest && score > secondHigest) {
				// Last student entered has the highest score 
				secondHigest = highest;
				student2nd = student1st;
				highest = score;
				student1st = name;
			}
			else if (i > 1 && score > secondHigest) {
				// Last student entered has the second highest score 
				student2nd = name;
				secondHigest = score;
			}
	}
	System.out.println("Top two students: ");
	System.out.println(student1st + "'s " + "score is " + highest + "\n" + student2nd + "'s " + "score is " + secondHigest);
}}