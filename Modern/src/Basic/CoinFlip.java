package Basic;

import java.util.Random;

public class CoinFlip {
   public static void main(String[] args) {
      for (int i = 0; i < 10; i++) {
         System.out.println(flipCoin());
      }

   }

   private static String flipCoin() {
      Random random = new Random();
      String result;
      if (random.nextBoolean()) {
         result = "Heads";
      } else {
         result = "Tail";
      }
      return result;
   }
}
