package testing;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class Main {

   @Test
   public void testCalmString() {
      assertThat(calmString("test!"), equalTo("test"));
      assertThat(calmString("t!est!"), equalTo("test"));
      assertThat(calmString("!t!e!st!"), equalTo("test"));
      assertThat(calmString("!!!!!"), nullValue());
      assertThat(calmString(new String()), nullValue());
   }

   static String calmString(String input) {
      String output = null;

      if (input == null) {
         return null;
      }
      input = input.replaceAll("!", "");
      if (input.length() > 0) {
         output = input;
      }
      return output;
   }
}
