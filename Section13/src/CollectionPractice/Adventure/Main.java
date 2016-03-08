package CollectionPractice.Adventure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
   private static Map<Integer, Location> locations = new HashMap<>();

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      locations.put(0, new Location(0, "location0"));
      locations.put(1, new Location(1, "location1"));
      locations.put(2, new Location(2, "location2"));
      locations.put(3, new Location(3, "location3"));
      locations.put(4, new Location(4, "location4"));
      locations.put(5, new Location(5, "location5"));

      int loc = 1;
      while (true) {
         System.out.println(locations.get(loc).getDescription());
         if (loc == 0) {
            break;
         }
         loc = scanner.nextInt();
         if (!locations.containsKey(loc)) {
            System.out.println("you can not run in this direction");
         }
      }
   }
}
