import java.io.*;
import java.util.*;
public class StringReplaceTask{ 

public static void main(String args[]) { 

	// Removing new line characters form Java String 
	
	String sample="We are going to replace newline character \\n " 
	+ "New line should start now if \\n \n is working"; 
	
	System.out.println("Original String: " + sample); 
	
	//replacing \n or newline character so that all text come in one line 
	System.out.println("Escaped String: " + sample.replaceAll("\n", "")); 
	
	// removing line breaks from String read from text file in Java 
	String text = readFileToString("words.txt"); 
	text = text.replace(System.getProperty("line.separator"), ""); 
}
 } 

