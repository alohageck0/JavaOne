package lists;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapInts {
   static Map<Integer, String> map = new HashMap<>();

   @Test
   public void test() {
      Assert.assertEquals(getIntWord(1), "one");
      Assert.assertEquals(getIntWord(4), "four");
      Assert.assertEquals(getIntWord(2), "two");
      Assert.assertEquals(getIntWord(44), "No such ID");
      Assert.assertEquals(getIntWord(5), "No such ID");

      String[] test = wordsForNumbers(1,4,3,6);
      for (String s:test){
         System.out.println(s);
      }
   }

   static {
      map.put(1, "one");
      map.put(2, "two");
      map.put(3, "three");
      map.put(4, "four");
   }

   public String getIntWord(int number) {
      if (map.containsKey(number)) {
         return map.get(number);
      } else {
         return "No such ID";
      }
   }

   public String[] wordsForNumbers(int... numbers) {
      List<String> words = new ArrayList<>();
      String[] result;
      for (int number : numbers)
         if (map.containsKey(number)) {
            words.add(map.get(number));
         }
      result = new String[words.size()];
      result = words.toArray(result);
      return result;
   }
}
