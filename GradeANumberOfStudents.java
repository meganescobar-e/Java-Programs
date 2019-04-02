/**
 * CIS 4570-0numbers
 * GradeANumberOfStudents Assignment
 * @author Megan Escobar
 */
 
 import java.util.Scanner;

 public class GradeANumberOfStudents {
    
 public static void main(String[] args) {
	 
    Scanner in = new Scanner(System.in);
    System.out.print("Enter number of students: ");
    int numberOfStudents = in.nextInt();

    double[] scores = new double[numberOfStudents];
	String [] firstName = new String [numberOfStudents];
	String [] lastName = new String [numberOfStudents];
		
		for(int i = 0; i < scores.length; i++) {
			System.out.print("Enter score for student " + (i+1) + ": ");
			scores[i] = in.nextDouble();
			in.nextLine();

			System.out.print("Enter first name for student " + (i+1) + ": ");
			firstName[i] = in.nextLine();
				
			System.out.print("Enter last name for student " + (i+1) + ": ");				
			lastName[i] = in.nextLine();	
		}
		
	System.out.println("Student    First     Last Score Grade");	
		if(numberOfStudents != 0) { 	
			displayGrades(firstName, lastName, scores);
		}
 }

 public static void displayGrades(String[] fName, String[] lName, double[] grades) {
       
	double highScore = bestGrade(grades);
        
        for (int i = 0; i < grades.length; i++) {
		   System.out.printf("     %2d  %s   %s %5.1f     %s", (i+1), fName[i], lName[i], grades[i], assignLetterGrade(grades[i], highScore));
		   System.out.print("\n");
        }
 }

 public static char assignLetterGrade(double grade, double highScore) {

	double newGrade = highScore - grade;
	
    if (newGrade <= 10.0)
        return 'A';
	else if (newGrade > 10.0 && newGrade <= 20.0)
        return 'B';
    else if (newGrade > 20.0 && newGrade <= 30.0)
        return 'C';
	else if (newGrade > 30.0 && newGrade <= 40.0)
		return 'D';
	else 
		return 'F';
    }

 public static double bestGrade(double[] grades) {
    double highScore = grades[0];

        for (double grade : grades) {
            if (grade > highScore)
                highScore = grade;
        }

    return highScore;
    }
}