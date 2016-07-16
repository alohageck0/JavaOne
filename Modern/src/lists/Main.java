package lists;

import java.util.LinkedList;
import java.util.List;

public class Main {
   public static void main(String[] args) {
      List<String> names = new LinkedList<>();
      names.add("Marty");
      names.add("David");
      names.add("Cay");
      int numEntries = names.size();
      System.out.println("number of entries " + numEntries);
      String secondElem = names.get(1);
      System.out.println("Second element " + secondElem);
      boolean containsJoe = names.contains("Joe");
      System.out.println("Contains Joe - " + containsJoe);
      names.remove("Cay");
      System.out.println(names);
      System.out.println(names.get(names.size()/2));
   }
}
