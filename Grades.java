/**
 * CIS 4570-01
 * Grades Assignment
 * @author Megan Escobar
 */
 
 import java.util.Scanner;
 import java.util.regex.*;
 
 public class Grades { 
    public static void main(String[] args) { 
        
		Scanner in = new Scanner(System.in);

		System.out.print("enter a number grade: ");
		String gradeString = in.nextLine();
		
		float gradeInput = Float.parseFloat(gradeString);
		int stringLength = gradeString.length();
		char letterGrade;
		
		if (stringLength > 4) {
			System.out.println("ERROR: " + gradeString);
			System.exit(0);
		}
		if (gradeInput < 0.0 || gradeInput > 10.0) {
			System.out.println("ERROR: " + gradeString);
			System.exit(0);
		}
		if (gradeString.matches("^\\d+([.]\\d{2})?")) {
			System.out.println("ERROR: " + gradeString);
			System.exit(0);
		}
		if (gradeString.contains(".5") || gradeString.contains(".0")) {
			
		do {
				if (gradeInput <= 10.0 && gradeInput >= 8.5) {
					letterGrade = 'A'; 
					}
				else if (gradeInput >= 7.5 && gradeInput <= 8.0) {
					letterGrade = 'B'; 
					}
				else if (gradeInput >= 6.5 && gradeInput <= 7.0) {
					letterGrade = 'C'; 
				}		
				else if (gradeInput >= 5.5 && gradeInput <= 6.0) {
					letterGrade = 'D'; 
				}
				else {
					letterGrade = 'F'; 
				}
				System.out.println("letter grade is " + letterGrade); 
				break;
			}
		
		while (gradeInput >= 0.0 && gradeInput <= 10.0 && !gradeString.contains("-"));
		}	
		else {
				System.out.println("ERROR: " + gradeString);
		}
	}
}

