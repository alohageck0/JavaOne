import java.util.ArrayList;

public class Branch {
   private String name;
   private ArrayList<Customer> customers;

   public Branch(String name) {
      this.name = name;
      this.customers = new ArrayList<>();
   }

   public static Branch createBranch(String name) {
      Branch newBranch = new Branch(name);
      return newBranch;
   }

   public boolean addCustomer(Customer newCustomer) {
      if (findCustomer(newCustomer.getName()) >= 0) {
         System.out.println("Customer already exists");
         return false;
      }

      this.customers.add(newCustomer);
      return true;
   }

   public ArrayList<Customer> getCustomers() {
      return customers;
   }

   public int findCustomer(Customer customer) {
      return this.customers.indexOf(customer);
   }

   public String getName() {
      return name;
   }


   public int findCustomer(String name) {
      for (int i = 0; i < this.customers.size(); i++) {
         Customer customer = this.customers.get(i);
         if (customer.getName().equals(name)) {
            return i;
         }
      }
      return -1;
   }

   public Customer queryCustomer(String name) {
      int position = findCustomer(name);
      if (position >= 0) {
         return this.customers.get(position);
      }
      return null;
   }

   public void printCustomers() {
      System.out.println("List of customers of branch " + this.name + ":");
      for (int i = 0; i < customers.size(); i++) {
         System.out.println(customers.get(i).getName());
         customers.get(i).printTransactions();
      }
   }
}
