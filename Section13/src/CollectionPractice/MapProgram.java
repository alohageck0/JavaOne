package CollectionPractice;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
   public static void main(String[] args) {
      Map<String, String> languages = new HashMap<>();
      if (languages.containsKey("Java")) {
         System.out.println("Java already in the map");
      } else {
         languages.put("Java", "a compiled high level, obj-ori, platform independent");
         System.out.println("Java added succeesfuly");
      }
      languages.put("Python", "an interprteded, OO, high-level, with dynamic semantics");
      languages.put("Argol", "an algorithmic lang");
      System.out.println(languages.put("Basic", "beginners all purpose symbolic instruction code"));
      languages.put("Lisp", "Therein lies madness");

      if (languages.containsKey("Java")) {
         System.out.println("Java already in the map");
      } else {
         languages.put("Java", "this course about Java");
      }

      System.out.println("===========");
      for (String key : languages.keySet()) {
         System.out.println(key + ", " + languages.get(key));
      }
   }
}
