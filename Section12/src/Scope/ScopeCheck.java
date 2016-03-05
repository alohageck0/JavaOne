package Scope;

public class ScopeCheck {
   public int piblicVar = 0;
   private int privateVar = 1;

   public ScopeCheck() {
      System.out.println("Scope check created, publicVar = " + piblicVar + ", privateVar = " + privateVar);
   }



   public int getPrivateVar() {
      return privateVar;
   }
}

