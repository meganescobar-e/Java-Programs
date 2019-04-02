/**
 * CIS 4570-01
 * Grades Assignment
 * @author Megan Escobar
 * score 90
 */
 
 import java.util.Scanner;
 
 public class Grades { 

    public static float roundToHalf(float grade) {
		return Math.round(grade * 2)/ 2.0f;	
	}
	
    public static void main(String[] args) { 
        
		Grades report = new Grades();
		
		char letterGrade;
		Scanner in = new Scanner(System.in);

		System.out.print("enter a number grade: ");
		String gradeString = in.nextLine();
		
		float gradeInput = Float.parseFloat(gradeString);
		int stringLength = gradeString.length();
		
			if (gradeInput >= 0.0 && gradeInput <= 10.0 && gradeString.contains(".") && !gradeString.contains("-") && gradeString.contains(".5") || gradeString.contains(".0")){
			
				double grade = Math.round(gradeInput);
					
				if (grade >= 8.5 && grade <= 10.0) {
					letterGrade = 'A'; 
					}
				else if (grade >= 7.5 && grade <= 8.0) {
					letterGrade = 'B'; 
					}
				else if (grade >= 6.5 && grade <= 7.0) {
					letterGrade = 'C'; 
				}		
				else if (grade >= 5.5 && grade <= 6.0) {
					letterGrade = 'D'; 
				}
				else {
					letterGrade = 'F'; 
				}
					 
				System.out.println("letter grade is " + letterGrade); 
			}
			else {
				System.out.println("ERROR: " + gradeString);
			}
	}
}