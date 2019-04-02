/**
 * CIS 4570-01
 * CharsInCommon Assignment
 * @author Megan Escobar
 */
 import java.util.Scanner;
 import java.util.HashSet;
 import java.util.Set;
 import java.util.Iterator;
 
 public class CharsInCommon {

 public static String findCommonChars(String a, String b) {
	StringBuilder resultBuilder = new StringBuilder();
    Set<Character> charsMap = new HashSet<Character>();
        for (int i = 0; i < a.length(); i++) {
             char ch = a.charAt(i); 
             if (b.indexOf(ch) != -1){
                 charsMap.add(Character.valueOf(ch));
             }
        }
        Iterator<Character> charsIterator = charsMap.iterator();
        while(charsIterator.hasNext()) {
            resultBuilder.append(charsIterator.next().charValue());
        }
        return resultBuilder.toString();
    }
 public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
	   System.out.print("enter first word: ");
	   String word1 = in.nextLine();
	   System.out.print("enter second word: ");
       String word2 = in.nextLine();

       String commons = findCommonChars(word1, word2);
	   int stringLength = commons.length();
       System.out.println("count: " + stringLength);     
    }

}