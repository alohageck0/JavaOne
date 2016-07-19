package testing;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static java.lang.Math.*;

public class Main {

   @Test
   public void testCalmString() {
      assertThat(calmString("test"), equalTo("test"));
      assertThat(calmString("test!"), equalTo("test"));
      assertThat(calmString("t!est!"), equalTo("test"));
      assertThat(calmString("!t!e!st!"), equalTo("test"));
      assertThat(calmString("!!!!!"), equalTo(""));
      String string = null;
      assertThat(calmString(string), nullValue());
   }

   @Test
   public void testCalmAttendies() {
      ArrayList<String> test1 = new ArrayList<>(Arrays.asList("Democrat", "Liberal", "Comunist"));
      assertThat(calmAttendies(test1), sameInstance(test1));
      test1 = new ArrayList<>(Arrays.asList("Democrat", "Republican", "Liberal", "Comunist"));
      assertThat(calmAttendies(test1), not(hasItems("Democrat", "Republican")));
      System.out.println(test1.toString());
      test1 = new ArrayList<>(Arrays.asList("Republican", "Liberal", "Comunist"));
      assertThat(calmAttendies(test1), sameInstance(test1));

   }

   static String calmString(String input) {
      if (input != null) {
         input = input.replaceAll("!", "");
      }
      return input;
   }

   private static List<String> calmAttendies(List<String> parties) {
      if (parties == null) {
         return null;
      }
      if (parties.contains("Democrat") && parties.contains("Republican")) {
         Random random = new Random();
         if (random.nextBoolean()) {
            parties.remove("Democrat");
         } else {
            parties.remove("Republican");
         }
      }
      return parties;
   }
}
