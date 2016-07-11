package oopAdvancedProject;

import java.util.Random;

public enum Coin {
   HEADS("Heads"), TAILS("Tails");

   String title;

   Coin(String title) {
      this.title = title;
   }

   static Coin flip() {
      Random random = new Random();
      if (random.nextBoolean()) {
         return HEADS;
      } else {
         return TAILS;
      }
   }

   @Override
   public String toString() {
      return "Coin{" +
              "title='" + title + '\'' +
              '}';
   }
}
