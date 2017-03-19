package Threads;

import static Threads.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {
   @Override
   public void run() {
      System.out.println(ANSI_BLUE + "Hello from " + currentThread().getName());
      try {
         Thread.sleep(5000);
      } catch (InterruptedException e) {
         System.out.println(ANSI_BLUE + "Some thread interrupted AnotherThread");
         return;
      }

      System.out.println(ANSI_BLUE + "5 secs have passed and" + currentThread().getName() + " awake");
   }
}
