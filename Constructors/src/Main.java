public class Main {
   public static void main(String[] args) {
      //start
//      Account test = new Account();//123123, 0.00, "Bob", "444@email", "234234");
//      System.out.println(test.getBalance());
//
//      test.setBalance(1000);
//      test.deposit(500);
//      test.withdraw(2000);
//
//      Account timsAcc = new Account("Tim", "@@@", "74747");
//      System.out.println(timsAcc.getCustomerName());

      VipCustomer vipCustomer = new VipCustomer();
      System.out.println(vipCustomer.getName());
      System.out.println(vipCustomer.getCreditLimit());
      System.out.println(vipCustomer.getEmail());


      VipCustomer vip1 = new VipCustomer("Vip1", 1300);
      System.out.println(vip1.getName());
      System.out.println(vip1.getCreditLimit());
      System.out.println(vip1.getEmail());

      VipCustomer vip2 = new VipCustomer("Vip2", 1300, "@@@");
      System.out.println(vip2.getName());
      System.out.println(vip2.getCreditLimit());
      System.out.println(vip2.getEmail());

   }
}
