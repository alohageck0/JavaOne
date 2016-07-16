package lists;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class MapEmployes {
   static Map<String, String> map = new HashMap<>();

   @Test
   public void test(){
      Assert.assertEquals(getName("a1235"), "Scott McNealy");
      Assert.assertEquals(getName("a1237"), "Bill Gates");
      Assert.assertEquals(getName("a1232"), "No such ID");
      Assert.assertEquals(getName("a1236"), "Jeff Bezos");
   }

   static {
      map.put("a1234", "Steve Jobs");
      map.put("a1235", "Scott McNealy");
      map.put("a1236", "Jeff Bezos");
      map.put("a1237", "Bill Gates");
   }

   public String getName(String id) {
      if (map.containsKey(id)) {
         return map.get(id);
      } else {
         return "No such ID";
      }
   }
}
