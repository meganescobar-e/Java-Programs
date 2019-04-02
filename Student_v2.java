/**
 * CIS 4570-01
 * Student_v3 Assignment
 * @author Megan Escobar
 */

import java.util.Scanner;
 
public class Student_v3 {

	private String firstName;
    private String lastName;
	private boolean date;
	private int month;
	private int day;
	private int year;
	private int studentID;

	public void setStudentFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getStudentFirstName() {
		return firstName;
	}
	public void setStudentLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStudentLastName() {
		return lastName;
	}
	public boolean setDateOfBirth(int month, int day, int year) {
		if (month >= 1 && month <=12 && day >=1 && day <=31 && year >= 1850 && year <= 2015){
			this.month = month;
			this.day = day;
			this.year = year;
			return true;
		}
		else return false;
	}
public String getDateOfBirth() {
	return setDateOfBirth();
}
public void setStudentID (int studentID) {
	this.studentID = studentID;
}
public int getStudentID() {
	return 0;
}
public static void main(String [] args) {
	Student_v3 newStudent = new Student_v3();
	Scanner in = new Scanner(System.in);
		
	System.out.print("enter student first name: ");
	newStudent.setStudentFirstName(in.nextLine());
		
	System.out.print("enter student last name: ");
	newStudent.setStudentLastName(in.nextLine());
		
	System.out.print("enter student birth month as two ints: ");
	int month = in.nextInt();
		
	System.out.print("enter student birth day as two ints: ");
	int day = in.nextInt();
		
	System.out.print("enter student birth year as 4 ints: ");
	int year = in.nextInt();
	newStudent.setDateOfBirth(month, day, year);
		
	System.out.print("enter student id (int): ");
	newStudent.setStudentID(in.nextInt());
	
	System.out.print("Student " + newStudent.getStudentFirstName() + " " + newStudent.getStudentLastName() + "\n   birth date: ");
	System.out.println(newStudent.getDateOfBirth() + "\n   student id: " + newStudent.getStudentID());	
	if (month < 1 || month > 12 || day < 1 || day > 31 || year < 1850 || year > 2015) {
		System.out.print("invalid date\n");
	}
} }
/**
 * CIS 4570-01
 * Student_v3 Assignment
 * @author Megan Escobar
 */

import java.util.Scanner;
 
public class Student_v2 {

	private String firstName;
    private String lastName;
	private int month;
	private int day;
	private int year;
	private int studentID;

	public void setStudentFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getStudentFirstName() {
		return firstName;
	}
	public void setStudentLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStudentLastName() {
		return lastName;
	}
	public void setDateOfBirth(int month, int day, int year) {
		if (month >= 1 && month <=12){
			this.month = month;
		}
		else this.month = month;
		if (day >=1 && day <=31) {
			this.day = day;
		}
		else this.day = day;
		if (year >= 1850 && year <= 2015) {
			this.year = year;
		}
		else this.year = year;
	}
public String getDateOfBirth() {
	return (month + "/" + day + "/" + year);
}
public void setStudentID (int studentID) {
	this.studentID = studentID;
}
public int getStudentID() {
	return 0;
}
public static void main(String [] args) {
	Student_v3 newStudent = new Student_v3();
	Scanner in = new Scanner(System.in);
		
	System.out.print("enter student first name: ");
	newStudent.setStudentFirstName(in.nextLine());
		
	System.out.print("enter student last name: ");
	newStudent.setStudentLastName(in.nextLine());
		
	System.out.print("enter student birth month as two ints: ");
	int month = in.nextInt();
		
	System.out.print("enter student birth day as two ints: ");
	int day = in.nextInt();
		
	System.out.print("enter student birth year as 4 ints: ");
	int year = in.nextInt();
	newStudent.setDateOfBirth(month, day, year);
		
	System.out.print("enter student id (int): ");
	newStudent.setStudentID(in.nextInt());
	
	System.out.print("Student " + newStudent.getStudentFirstName() + " " + newStudent.getStudentLastName() + "\n   birth date: ");
	System.out.println(newStudent.getDateOfBirth() + "\n   student id: " + newStudent.getStudentID());	
	if (month < 1 || month > 12 || day < 1 || day > 31 || year < 1850 || year > 2015) {
		System.out.print("invalid date\n");
	}
} }