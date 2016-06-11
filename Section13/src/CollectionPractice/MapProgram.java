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
      languages.put("Algol", "an algorithmic lang");
      System.out.println(languages.put("basic", "beginners all purpose symbolic instruction code"));
      languages.put("Lisp", "Therein lies madness");

      if (languages.containsKey("Java")) {
         System.out.println("Java already in the map");
      } else {
         languages.put("Java", "this course about Java");
      }

      System.out.println("===========");
//      languages.remove("Lisp");
      if (languages.remove("Algol", "an algorithmic lang")) {
         System.out.println("Algol removed");
      } else {
         System.out.println("Algol not removed");
      }

      if (languages.replace("Lisp", "Therein lies madness", "A func program language")) {
         System.out.println("Lisp replaced");
      } else {
         System.out.println("Lisp was not replaced");
      }
//      System.out.println(languages.replace("Scala", "this will not be added"));
      for (String key : languages.keySet()) {
         System.out.println(key + ", " + languages.get(key));
      }


   }
}
