package Interfaces;

public class DeskPhone implements ITelephone {
   private int myNumber;
   private boolean isRinging;

   public DeskPhone(int m) {
      this.myNumber = m;
   }

   @Override
   public void powerOn() {
      System.out.println("No action taken, deskphone does not have power button");
   }

   @Override
   public void dial(int phoneNumber) {
      System.out.println("Now ringing " + phoneNumber + " on deskphone");

   }

   @Override
   public void answer() {
      System.out.println("Answering deskphone");
      isRinging = false;
   }

   @Override
   public boolean callPhone(int phoneNumber) {
      if (phoneNumber == myNumber) {
         isRinging = true;
         System.out.println("Ring Ring");
      } else {
         isRinging = false;
      }
      return isRinging;
   }

   @Override
   public boolean isRinging() {
      return isRinging;
   }
}
