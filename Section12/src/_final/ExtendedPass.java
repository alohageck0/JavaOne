package _final;

public class ExtendedPass extends Password {
   private int decryptedPass;

   public ExtendedPass(int pass) {
      super(pass);
      this.decryptedPass = pass;
   }

//   @Override
//   public void storePass() {
//      System.out.println("Saving pass as " + this.decryptedPass);
//   }
}
