import java.util.*;


public class SetOperations2 {
public static void main(String [] args){
Scanner in=new Scanner(System.in);

//String stuff= in.nextLine();

//ArrayList stuff = new ArrayList(str);


Set<String> set1= new LinkedHashSet<>();
do {
System.out.println("enter next element of first set (end with 0): ");
set1.add(in.nextLine());






}while (!set1.contains(0)); 

/*while (set1.contains()){
set1.add(in.nextLine());
set1.add(in.nextLine());
break;
} */

System.out.println(set1);
}

}