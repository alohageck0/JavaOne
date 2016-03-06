package _final;

public class Main {
   public static void main(String[] args) {
//      Someclass one = new Someclass("one");
//      Someclass two = new Someclass("two");
//      Someclass three = new Someclass("three");
//
//      System.out.println(one.getInstnanceNumber());
//      System.out.println(two.getInstnanceNumber());
//      System.out.println(three.getInstnanceNumber());
//
////      one.instnanceNumber = 5;
//      System.out.println(Math.PI);
//
////      Math m = new Math();
//
//      int pw = 64646;
//      Password password = new ExtendedPass(pw);
//      password.storePass();
//      password.letMeIn(1);
//      password.letMeIn(23424);
//      password.letMeIn(0);
//      password.letMeIn(-1);
//      password.letMeIn(64646);


      System.out.println("Main method called");
      SIB test = new SIB();
      test.someMethod();
      System.out.println("Owner is " + SIB.owner);
   }
}
