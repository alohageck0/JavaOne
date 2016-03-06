package AccessModifiers;

public class Main {
   public static void main(String[] args) {
      Account tims = new Account("Tim");

      tims.deposit(1000);
      tims.withdraw(500);
      tims.withdraw(-200);
      tims.deposit(-20);
      tims.calculateBalance();

//      tims.balance = 5000;

      System.out.println("Balance " + tims.getBalance());
//      tims.transactions.add(4500);
      tims.calculateBalance();
   }
}
