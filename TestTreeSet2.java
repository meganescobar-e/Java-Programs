import java.util.*;

public class TestTreeSet2 {
  public static void main(String[] args) {

    TreeSet<String> treeSet = new TreeSet<>();
    // Add strings to the set, not in sorted order
    treeSet.add("XXXXX");
    System.out.println("add: " + "XXXXX");
    treeSet.add("London");
    System.out.println("add: " + "London");
    treeSet.add("Paris");
    System.out.println("add: " + "Paris");
    treeSet.add("New York");
    System.out.println("add: " + "New York");
    treeSet.add("New York"); //try to insert a dupliacate
    System.out.println("add: " + "New York");
    treeSet.add("San Francisco");
    System.out.println("add: " + "San Francisco");
    treeSet.add("Beijing");
    System.out.println("add: " + "Beijing");
    treeSet.add("New York");
    System.out.println("add: " + "New York");
    treeSet.add("AAAA");
    System.out.println("add: " + "AAAA");

    System.out.println("\nthe TreeSet is sorted:\n" + treeSet);

  }
}
