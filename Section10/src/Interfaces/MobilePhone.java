package Interfaces;

public class MobilePhone implements ITelephone {
   private int myNumber;
   private boolean isRinging;
   private boolean isOn = false;

   public MobilePhone(int m) {
      this.myNumber = m;
   }

   @Override
   public void powerOn() {
      isOn = true;
      System.out.println("Mobile phone powered up");
   }

   @Override
   public void dial(int phoneNumber) {
      if (isOn) {
         System.out.println("Now ringing " + phoneNumber + " on mobile phone");

      } else {
         System.out.println("Phone is swithced off");
      }

   }

   @Override
   public void answer() {
      if (isRinging) {
         System.out.println("Answering mobile phone");
         isRinging = false;
      }
   }

   @Override
   public boolean callPhone(int phoneNumber) {
      if (phoneNumber == myNumber && isOn) {
         isRinging = true;
         System.out.println("Melody Ring");
      } else {
         isRinging = false;
         System.out.println("Mobile phone not on or number different");
      }
      return isRinging;
   }

   @Override
   public boolean isRinging() {
      return isRinging;
   }


}
