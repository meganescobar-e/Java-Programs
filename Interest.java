/**
 * CIS 4570-01
 * Grades Assignment
 * @author Megan Escobar
 * score 90
 */
 
 import java.util.Scanner;
 
 public class Investment {
 
 private double beginningBalance;
 private double annualInterest;
 private double monthlyInterest;
 private double sixInterset;
 private double newBalance;
 private double total;
 
 public void setBalance(double beginningBalance, double annualInterest) {
    this.beginningBalance = beginningBalance;
	this.annualInterest = annualInterest;
 }
 public void getBalance() {
    return beginningBalance;
 }
 public void setmonthlyInterest(double annualInterest) {
    monthlyInterest = annualInterest / 12;
	sixInterest = monthlyInterest * 6;
 }
 public void getmonthlyInterest() {
    return monthlyInterest;
 }
 public void Amount(){
    total = beginningBalance * sixInterest;
	newBalance = beginningBalance + total;
 }
 public void getAmount() {
    return newBalance;
 }
 
 public static void main(String [] args) {
	Investment account = new Investment();
	
	Scanner in = new Scanner(System.in);
	double beginningBalance;
	double annualInterest;
	double monthlyInterest;
	double newBalance;
	
	System.out.print("Enter monthly saving amount: ");
	account.setBalance(in.nextDouble());
	
	System.out.print("Enter yearly percentage: ");
	account.setmonthlyInterest(in.nextDouble());
	
	System.out.print("After the sixth month, the account value is " + account.getAmount());
	
 }
 }