/**
 * CIS 4570-0numbers
 * CountInts Assignment
 * @author Megan Escobar
 */
 import java.util.Scanner;
 
 public class CountInts {

 public static void countNums(int[] list) {
    for (int i = 1; i <= 100; i++) {
        int count = 0;
            
		for (int j = 0; j < list.length - 1; j++) {
            
			if (list[j] == i) {
            count += 1;
			}
			
        }
            
	if(count > 0 && count == 1){
        System.out.printf("%d occurs %d time\n",i, count);
    }
        
	else if(count > 1){
        System.out.printf("%d occurs %d times\n",i, count);
    }
	
    } 
 }
	
 public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int[] numList = new int[100];
    int input;
    int count = 0;
        
	System.out.println("Enter integers between 1 and 100.\nFinish by entering 0: ");
        
		do
        {
            input = in.nextInt();
			if(input == 0){
				break;
			}
			
            numList[count] = input;
            count += 1;
        }
        while (input >= 0);

        countNums(numList);
    }

   
 }