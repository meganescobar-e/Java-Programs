/**
 * CIS 4570-01
 * SetOperations Assignment
 * @author Megan Escobar
 */
 
import java.util.*;

public class SetOperations {

public static void main (String [] args) {

	Scanner input = new Scanner (System.in);
	Set<String> setOp = new LinkedHashSet<>();
	Set<String> setOp2 = new LinkedHashSet<>();
	
	String newChar = "";
	
	while (true){
		System.out.print("enter next element of first set (end with 0): ");
		newChar = input.nextLine();
		if (newChar.equals("0")) {
			break;
		}
		setOp.add(newChar);
	} 
	
	System.out.println("==============");
	
	while (true){
		System.out.print("enter next element of second set (end with 0): ");
		newChar = input.nextLine();
		if (newChar.equals("0")) {
			break;
		}
		setOp2.add(newChar);
	}
	System.out.print("set1: ");
	System.out.println(setOp);
	System.out.print("set2: ");
	System.out.println(setOp2);
	
	//set of union of setOp and setOp2
	Set<String> newSet3 = new LinkedHashSet<>(setOp);
	newSet3.addAll(setOp2);
	System.out.print("The union of the two sets is ");
	System.out.println(newSet3);
	
	//set of intersection of setOp and setOp2
	Set<String> interSet = new LinkedHashSet<>();
	interSet.addAll(setOp);
	interSet.retainAll(setOp2);
	
	//set of difference between setOp and setOp2
	Set<String> diffSet = new LinkedHashSet<>(setOp);
	diffSet.addAll(setOp);
	diffSet.removeAll(interSet);
	
	System.out.print("The difference of the two sets is ");
	System.out.println(diffSet);
	
	System.out.print("The intersection of the two sets is ");
	System.out.println(interSet);
}
}