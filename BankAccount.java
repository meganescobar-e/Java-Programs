/**
 * CIS 4570-01
 * BankAccount Assignment
 * @author Megan Escobar
 */
 
 import java.util.Scanner;

 public class BankAccount {
 
    private String accountNumber;
    private double balance;
    private String type;

	public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
	}
	public String getAccountNumber() {
	return accountNumber;
	}
	public void setBalance(double balance) {
	this.balance = balance;
	}
	public double getBalance() {
	return balance;
	}
	public void setType(String type) {
	this.type = type;
	}
	public String getType() {
	return type;
	}
	public void withdraw(double input) {
	balance = balance - input;
	}
	public void deposit(double input) {
	balance = balance + input;
	}
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		BankAccount account = new BankAccount();

		System.out.print("enter the type of the account: ");
		account.setType(in.nextLine());

		System.out.print("enter the number of the account: ");
		account.setAccountNumber(in.nextLine());

		System.out.print("enter the balance of the account: ");
		account.setBalance(in.nextDouble());

		System.out.print("enter an amount to be added to the account: ");
		account.deposit(in.nextDouble());

		System.out.print("enter an amount to be added to the account: ");
		account.deposit(in.nextDouble());

		System.out.print("enter an amount to be withdrawn from the account: ");
		account.withdraw(in.nextDouble());

		System.out.print("enter an amount to be withdrawn from the account: ");
		account.withdraw(in.nextDouble());

		System.out.println("account " + account.getAccountNumber());
		System.out.println("type " + account.getType());
		System.out.println("balance " + account.getBalance());

	}

}