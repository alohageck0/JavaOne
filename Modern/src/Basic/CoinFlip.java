package basic;

import java.util.Random;
import java.util.Scanner;

public class CoinFlip {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int cycles = sc.nextInt();
      for (int i = 0; i < cycles; i++) {
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
