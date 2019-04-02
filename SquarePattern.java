/**
 * CIS 4570-01
 * SquarePattern Assignment
 * @author Megan Escobar
 */

public class SquarePattern {

  public static void main(String [] args) {
        
	for(int row=1; row<=11; row++) {
            for(int column=1; column<=27; column++) {
                
		if(row <= 3 || row >= 9 || column <= 6 || column >= 22){
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
             }
             System.out.println();
        }
   }
}