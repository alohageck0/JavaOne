package Deadlock.sayHello;

public class Main {

   public static void main(String[] args) {
      final PolitePerson jane = new PolitePerson("Jane");
      final PolitePerson john = new PolitePerson("John");

      new Thread(new Runnable() {
         @Override
         public void run() {
            jane.syaHello(john);

         }
      }).start();

      new Thread(new Runnable() {
         @Override
         public void run() {
            john.syaHello(jane);

         }
      }).start();
   }

   static class PolitePerson {
      private final String name;

      public String getName() {
         return name;
      }

      public PolitePerson(String name) {
         this.name = name;
      }

      public synchronized void syaHello(PolitePerson person) {
         System.out.printf("%s: %s" + " has said hello to me!%n", this.name, person.getName());
         sayHelloBack(this);
      }

      public synchronized void sayHelloBack(PolitePerson person) {
         System.out.printf("%s: %s" + " has said hello to me back!%n", this.name, person.getName());
      }
   }
}
