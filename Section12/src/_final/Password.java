package _final;

public class Password {
   private static final int key = 1231232545;
   private final int encriptedPass;

   public Password(int pass) {
      this.encriptedPass = enctyptDecrypt(pass);

   }

   private int enctyptDecrypt(int pass) {
      return pass ^ key;
   }

   public final void storePass() {
      System.out.println("Saving pass as " + this.encriptedPass);
   }

   public boolean letMeIn(int pass) {
      if (enctyptDecrypt(pass) == this.encriptedPass) {
         System.out.println("welcome");
         return true;
      } else {
         System.out.println("nope");
         return false;
      }

   }

}
