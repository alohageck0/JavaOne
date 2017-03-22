package ConcurrentPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

import static ConcurrentPack.Main.EOF;

public class Main {
   public static final String EOF = "EOF";

   public static void main(String[] args) {
      List<String> buffer = new ArrayList<>();
      ReentrantLock bufferLock = new ReentrantLock();
      MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_CYAN, bufferLock);
      MyConsumer consumer1 = new MyConsumer(buffer, ThreadColor.ANSI_GREEN, bufferLock);
      MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_PURPLE, bufferLock);

      new Thread(producer).start();
      new Thread(consumer1).start();
      new Thread(consumer2).start();
   }
}

class MyProducer implements Runnable {
   private List<String> buffer;
   private String color;
   private ReentrantLock bufferLock;

   public MyProducer(List<String> buffer, String color, ReentrantLock bufferLock) {
      this.buffer = buffer;
      this.color = color;
      this.bufferLock = bufferLock;
   }

   @Override
   public void run() {
      Random random = new Random();
      String[] nums = {"1", "2", "3", "4", "5"};
      for (String num : nums) {
         try {
            System.out.println(color + "Adding... " + num);
            bufferLock.lock();
            try {
               buffer.add(num);
            } finally {
               bufferLock.unlock();
            }
            Thread.sleep(random.nextInt(1000));
         } catch (InterruptedException e) {
            System.out.println("Producer was interrupted");
         }
      }
      System.out.println(color + "Adding EOF and exiting");
      bufferLock.lock();
      try {
         buffer.add("EOF");
      } finally {
         bufferLock.unlock();
      }
   }
}

class MyConsumer implements Runnable {
   private List<String> buffer;
   private String color;
   private ReentrantLock bufferLock;

   public MyConsumer(List<String> buffer, String color, ReentrantLock bufferLock) {
      this.buffer = buffer;
      this.color = color;
      this.bufferLock = bufferLock;
   }

   @Override
   public void run() {
      int counter = 0;
      while (true) {
         if (bufferLock.tryLock()) {
            try {
               if (buffer.isEmpty()) {
                  continue;
               }
               System.out.println(color + "The counter = " + counter);
               if (buffer.get(0).equals(EOF)) {
                  System.out.println(color + "Exiting " + Thread.currentThread().getName());
                  break;
               } else {
                  System.out.println(color + "Remove " + buffer.remove(0));
               }
            } finally {
               bufferLock.unlock();
            }
         } else {
            counter++;
         }
      }
   }
}
