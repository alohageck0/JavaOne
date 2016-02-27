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
      return null;
   }
}
