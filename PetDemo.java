/**
 * CIS 4570-01
 * PetDemo Assignment
 * @author Megan Escobar
 */
 
 import java.util.Scanner;

 public class PetDemo {
    public static void main(String [] args) {
	
	Pet pet = new Pet();
	
	Scanner in = new Scanner(System.in);
	System.out.print("enter name of pet: ");
	pet.setName(in.nextLine());
	
	System.out.print("enter type of pet: ");
	pet.setType(in.nextLine());
	
	System.out.print("enter age of pet: ");
	pet.setAge(in.nextInt());
	
	System.out.println("name: " + pet.getName());
	System.out.println("type: " + pet.getType());
	System.out.println("age: " + pet.getAge());
	}
 }
 