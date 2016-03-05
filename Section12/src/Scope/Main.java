package Scope;

public class Main {
   public static void main(String[] args) {
String privateVar = "this is private to main()";
      ScopeCheck scopeInstance = new ScopeCheck();
      System.out.println("Scope instance privateVar is "+ scopeInstance.getPrivateVar());
      System.out.println(privateVar);
   }
}
