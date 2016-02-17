public class Main {
   public static void main(String[] args) {
      //start
      Account test = new Account();//123123, 0.00, "Bob", "444@email", "234234");
      System.out.println(test.getBalance());

      test.setBalance(1000);
      test.deposit(500);
      test.withdraw(2000);

   }
}
