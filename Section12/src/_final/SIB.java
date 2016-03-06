package _final;

public class SIB {
   public static final String owner;

   static {
      owner = "tim";
      System.out.println("SIB test static initialization block called");
   }

   public SIB() {
      System.out.println("SIB constructor called");
   }

   static {
      System.out.println("Second initial block called");
   }

   public void someMethod() {
      System.out.println("Some method called");
   }
}
