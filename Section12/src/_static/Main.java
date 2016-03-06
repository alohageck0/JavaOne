package _static;

public class Main {
   public static void main(String[] args) {
      StaticTest firstInstance = new StaticTest("1st inst");
      System.out.println(firstInstance.getName() + " is instance number " + firstInstance.getNumInstances());
   StaticTest secondInstance = new StaticTest("2nd");
      System.out.println(secondInstance.getName() + " is instance number " + secondInstance.getNumInstances());
StaticTest thInstance = new StaticTest("3rd");
      System.out.println(thInstance.getName() + " is instance number " + secondInstance.getNumInstances());

   }
}
