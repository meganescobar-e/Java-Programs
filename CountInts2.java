/**
 * CIS 4570-0numbers
 * CountInts Assignment
 * @author Megan Escobar
 */
 import java.util.Scanner;
 
 public class CountInts {
	 
 public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
	int[] numList = new int [100];
	int [] count = new int [100];
	int index = 0;
	int temp = 0;
	int number;
	
    System.out.println("Enter integers between 1 and 100. ");
	System.out.println("Finish by entering 0: "); 

    for(int x : numList) {
		number = in.nextInt();
		
		if (number == 0) {
			break;
		}
		numList[index] = number;		
		index++; 	
	}

    for(index = 0; index < numList.length; index++){
            temp = numList[index];
            count[temp]++;
        }

    for(index = 1; index < count.length; index++){

        if(count[index] > 0 && count[index] == 1){
         System.out.printf("%d occurs %d time\n",index, count[index]);
         }
        else if(count[index] > 1){
            System.out.printf("%d occurs %d times\n",index, count[index]);
        }
     }
}
}