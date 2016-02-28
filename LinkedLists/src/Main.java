public class Main {
   public static void main(String[] args) {
      //tes
//todat
      Customer customer = new Customer("Tim", 442.23);

      Customer anotherCust;
      anotherCust = customer;
      anotherCust.setBalance(12.43);
      System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

   }
}
