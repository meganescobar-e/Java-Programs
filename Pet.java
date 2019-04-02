/**
 * CIS 4570-01
 * PetDemo Assignment
 * @author Megan Escobar
 */
 
 import java.util.Scanner;

 public class Pet {

 private String name;
 private String type;
 private int age;
     
    public void setName(String name) {                                             
        this.name = name; 						
    }                                             
      public String getName() {                                                
        return name; 							
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
 }
 