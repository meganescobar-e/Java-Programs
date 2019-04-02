/**
 * CIS 4570-01
 * Investment Assignment
 * @author Megan Escobar
 */
 
 import java.util.Scanner;
 
 public class Investment {
	private double savingsAmount;
	private double annualInterestRate;
	private double accountValue1;
	private double accountValue2;
	private double accountValue3;
	private double accountValue4;
	private double accountValue5;
	private double newAccountValue;


	public void setBalance(double savingsAmount) {
		this.savingsAmount = savingsAmount;
	}
	public void setInterest(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public double Display() {
		accountValue1 = savingsAmount * (1.000d +(annualInterestRate/12.0));
		accountValue2 = (savingsAmount + accountValue1) * (1.000d + (annualInterestRate/12.0));
		accountValue3 = (savingsAmount + accountValue2) * (1.000d + (annualInterestRate/12.0));
		accountValue4 = (savingsAmount + accountValue3) * (1.000d + (annualInterestRate/12.0));
		accountValue5 = (savingsAmount + accountValue4) * (1.000d + (annualInterestRate/12.0));
		newAccountValue = (savingsAmount + accountValue5) * (1.000d + (annualInterestRate/12.0));
		
		return newAccountValue;
	}
	public static void main(String[] args) {
		Investment account = new Investment();
		Scanner in = new Scanner(System.in);
		
		double savingsAmount;
		double annualInterestRate;
	
		System.out.print("Enter monthly saving amount: ");
		account.setBalance(in.nextDouble());

		System.out.print("Enter yearly percentage: ");
		account.setInterest(in.nextDouble());

		System.out.println("After the sixth month, the account value is " + account.Display());

    }
    
}

