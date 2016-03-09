package CollectionPractice.Adventure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
   private static Map<Integer, Location> locations = new HashMap<>();
   private static Map<String, String> directions = new HashMap<>();

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Map<String, Integer> tempExit = new HashMap<>();

      locations.put(0, new Location(0, "location0", tempExit));

      tempExit = new HashMap<>();
      tempExit.put("W", 2);
      tempExit.put("E", 3);
      tempExit.put("S", 4);
      tempExit.put("N", 5);
      locations.put(1, new Location(1, "location1", tempExit));

      tempExit = new HashMap<>();
      tempExit.put("N", 5);
      locations.put(2, new Location(2, "location2", tempExit));

      tempExit = new HashMap<>();
      tempExit.put("W", 1);
      locations.put(3, new Location(3, "location3", tempExit));

      tempExit = new HashMap<>();
      tempExit.put("N", 1);
      tempExit.put("W", 2);
      locations.put(4, new Location(4, "location4", tempExit));

      tempExit = new HashMap<>();
      tempExit.put("S", 1);
      tempExit.put("W", 2);
      locations.put(5, new Location(5, "location5", tempExit));

      directions.put("SOUTH", "S");
      directions.put("NORTH", "N");
      directions.put("WEST", "W");
      directions.put("EAST", "E");
      directions.put("QUIT", "Q");


      int loc = 1;
      while (true) {
         System.out.println(locations.get(loc).getDescription());
         tempExit.remove("S");
         if (loc == 0) {
            break;
         }

         Map<String, Integer> exits = locations.get(loc).getExits();
         System.out.println("Available exits are ");
         for (String exit : exits.keySet()) {
            System.out.print(exit + ", ");
         }
         System.out.println();

         String direction = scanner.nextLine().toUpperCase();
         if (direction.length() > 1) {
            String[] input = direction.split(" ");
            for (String word : input) {
               if (directions.containsKey(word)) {
                  direction = directions.get(word).toUpperCase();
                  break;
               }
            }
         }

         if (exits.containsKey(direction)) {
            loc = exits.get(direction);
         } else {
            System.out.println("You can not go in that direction");
         }
      }
   }
}
