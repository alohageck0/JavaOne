package Threads;

import static Threads.ThreadColor.ANSI_BLUE;
import static Threads.ThreadColor.ANSI_RED;

public class AnotherThread extends Thread {
   @Override
   public void run() {
      System.out.println(ANSI_BLUE + "Hello from " + currentThread().getName());
      try {
         Thread.sleep(3000);
      } catch (InterruptedException e) {
         System.out.println(ANSI_RED + "Another thread woke me up");
      }

      System.out.println(ANSI_BLUE + "3 secs passes and I'm awake");
   }
}
