package _final;

public class Someclass {
   private static int classCounter = 0;
   public final int instnanceNumber;
   private final String name;

   public Someclass(String name) {
      this.name = name;
      classCounter++;
      instnanceNumber = classCounter;
      System.out.println(name + " created, instance number is " + instnanceNumber);

   }

   public int getInstnanceNumber() {
      return instnanceNumber;
   }
}
