package Scope;

public class Main {
   public static void main(String[] args) {
      String var4 = "this is private to main()";

      ScopeCheck scopeInstance = new ScopeCheck();
      scopeInstance.useInner();

      ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//      System.out.println("varThree is not accesible here "+ innerClass.varThree);
//      System.out.println("Scope instance varOne is " + scopeInstance.getVarOne());
//      System.out.println(var4);
//
//      scopeInstance.timesTwo();
//      System.out.println("******");
//      ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//      innerClass.timesTwo();
   }
}
