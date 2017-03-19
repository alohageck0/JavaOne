package Threads;

import static Threads.ThreadColor.ANSI_GREEN;
import static Threads.ThreadColor.ANSI_PURPLE;
import static Threads.ThreadColor.ANSI_RED;

public class Main {
   public static void main(String[] args) {
      System.out.println(ANSI_PURPLE + "Hello from the main thread");
      Thread anotherThread = new AnotherThread();
      anotherThread.setName("===Another thread====");
      anotherThread.start();

      new Thread() {
         public void run() {
            System.out.println(ANSI_GREEN + "Hello from anon class thread");
         }
      }.start();
//
      Thread myRunnable = new Thread(new MyRunnable());
      myRunnable.start();
//
      new Thread(new MyRunnable()) {
         @Override
         public void run() {
            System.out.println(ANSI_RED + "Hello from anon implementation ");
            try {
               anotherThread.join(2000);
               System.out.println(ANSI_RED + "AnotherThread terminated, so anon is running again");
            } catch (InterruptedException e) {
               System.out.println(ANSI_RED + "I couldn't wait after all. I was interrupted");
            }
         }
      }.start();
//      anotherThread.interrupt();

      System.out.println(ANSI_PURPLE + "Hello again from main thread");
   }
}
