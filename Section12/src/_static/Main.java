package _static;

public class Main {
   public static int multiplier = 7;

   public static void main(String[] args) {
//      StaticTest firstInstance = new StaticTest("1st inst");
//      System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//      StaticTest secondInstance = new StaticTest("2nd");
//      System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//      StaticTest thInstance = new StaticTest("3rd");
//      System.out.println(thInstance.getName() + " is instance number " + StaticTest.getNumInstances());

      int answer = multiply(6);
      System.out.println(answer);
      System.out.println("Multiplier is " + multiplier);
   }

   public static int multiply(int number) {
      return number * multiplier;
   }
}
