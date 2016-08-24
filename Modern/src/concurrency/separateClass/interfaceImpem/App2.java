package concurrency.separateClass.interfaceImpem;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App2 implements Runnable {
   private final int loopLimit;

   public App2(int loopLimit) {
      this.loopLimit = loopLimit;
      ExecutorService taskList = Executors.newFixedThreadPool(loopLimit);
      taskList.execute(this);
      taskList.execute(this);
      taskList.execute(this);
      taskList.shutdown();
   }

   public void pause(double seconds) {
      try {
         Thread.sleep(Math.round(1000.0 * seconds));
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
   }

   @Override
   public void run() {
      for (int i = 0; i < loopLimit; i++) {
         String threadName = Thread.currentThread().getName();
         System.out.printf("%s: %s%n", threadName, i);
         pause(Math.random());
      }
   }
}
