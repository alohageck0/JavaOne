package ConcurrentPack;

import java.util.Random;
import java.util.concurrent.*;

import static ConcurrentPack.Main.EOF;

public class Main {
   public static final String EOF = "EOF";

   public static void main(String[] args) {
      ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<String>(6);
      ExecutorService executorService = Executors.newFixedThreadPool(5);

      MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_CYAN);
      MyConsumer consumer1 = new MyConsumer(buffer, ThreadColor.ANSI_GREEN);
      MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_PURPLE);

      executorService.execute(producer);
      executorService.execute(consumer1);
      executorService.execute(consumer2);

      Future<String> future = executorService.submit(new Callable<String>() {
         @Override
         public String call() throws Exception {
            System.out.println(ThreadColor.ANSI_RED + "Called from callable class");
            return "This is the callable result";
         }
      });
      try {
         future.get();
      } catch (ExecutionException e) {
         System.out.println("Something went wrong");
      } catch (InterruptedException e) {
         System.out.println("Thread was interrupted");
      }
      executorService.shutdown();
   }
}

class MyProducer implements Runnable {
   private ArrayBlockingQueue<String> buffer;
   private String color;

   public MyProducer(ArrayBlockingQueue<String> buffer, String color) {
      this.buffer = buffer;
      this.color = color;
   }

   @Override
   public void run() {
      Random random = new Random();
      String[] nums = {"1", "2", "3", "4", "5"};
      for (String num : nums) {
         try {
            System.out.println(color + "Adding... " + num);
            buffer.put(num);

            Thread.sleep(random.nextInt(1000));
         } catch (InterruptedException e) {
            System.out.println("Producer was interrupted");
         }
      }
      System.out.println(color + "Adding EOF and exiting");
      try {
         buffer.put("EOF");
      } catch (InterruptedException e) {
      }
   }
}

class MyConsumer implements Runnable {
   private ArrayBlockingQueue<String> buffer;
   private String color;

   public MyConsumer(ArrayBlockingQueue<String> buffer, String color) {
      this.buffer = buffer;
      this.color = color;
   }

   @Override
   public void run() {
      while (true) {
         synchronized (buffer) {
            try {
               if (buffer.isEmpty()) {
                  continue;
               }
               if (buffer.peek().equals(EOF)) {
                  System.out.println(color + "Exiting " + Thread.currentThread().getName());
                  break;
               } else {
                  System.out.println(color + "Remove " + buffer.take());
               }
            } catch (InterruptedException e) {

            }
         }
      }
   }
}
