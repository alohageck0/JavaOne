package ver1;

import java.util.ArrayList;

public class Bank {
   private String name;
   private ArrayList<Branch> branches;

   public Bank(String name) {
      this.name = name;
      this.branches = new ArrayList<>();
   }

   public boolean addBranch(String name) {
      if (findBranch(name) == null) {
         this.branches.add(new Branch(name));
         return true;
      }
      return false;
   }

   public boolean addCustomer(String branchName, String customerName, double initial) {
      Branch branch = findBranch(branchName);
      if (branch != null) {
         return branch.newCustomer(customerName, initial);
      }
      return false;
   }

   public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
      Branch branch = findBranch(branchName);
      if (branch != null) {
         return branch.addCustomerTransaction(customerName, amount);
      }
      return false;
   }

   private Branch findBranch(String name) {
      for (int i = 0; i < branches.size(); i++) {
         Branch checkedBranch = this.branches.get(i);
         if (checkedBranch.getName().equals(name)) {
            return checkedBranch;
         }
      }
      return null;
   }


   public boolean listCustomers(String branchName, boolean showTransactions) {
      Branch branch = findBranch(branchName);
      if (branch != null) {
         System.out.println("Customers details for branch " + branch.getName());
         ArrayList<Customer> branchCustomers = branch.getCustomers();
         for (int i = 0; i < branchCustomers.size(); i++) {
            Customer branchCustomer = branchCustomers.get(i);
            System.out.println("Customer: " + branchCustomer.getName() + "[" + (i + 1) + "]");
            if (showTransactions) {
               System.out.println("Transactions for customer " + branchCustomer.getName());
               ArrayList<Double> trans = branchCustomer.getTransactions();
               for (int j = 0; i < trans.size(); j++) {
                  System.out.println("[" + (j + 1) + "] Amount " + trans.get(j));
               }
            }
         }
         return true;
      } else {
         return false;
      }
   }
}
