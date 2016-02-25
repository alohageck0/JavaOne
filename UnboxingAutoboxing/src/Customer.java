import java.util.ArrayList;

public class Customer {
   private String name;
   private ArrayList<Double> transactions;

   public Customer(String name, double initialTransaction) {
      this.name = name;
      this.transactions = new ArrayList<>();
      this.transactions.add(initialTransaction);
   }

   public static Customer createCustomer(String name, double initial) {
      return new Customer(name, initial);
   }

   public String getName() {
      return name;
   }

   public ArrayList<Double> getTransactions() {
      return transactions;
   }

   public void printTransactions() {
      System.out.println("List of transactions for customer " + this.name + ":");
      for (int i = 0; i < transactions.size(); i++) {
         System.out.println(transactions.get(i));
      }
   }
}
