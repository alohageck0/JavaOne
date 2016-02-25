import java.util.AbstractList;
import java.util.ArrayList;

public class Bank {
   private ArrayList<Branch> branches;

   public Bank() {
      this.branches = new ArrayList<>();
   }

   public boolean addBranch(Branch newBranch) {
      if (findBranch(newBranch.getName()) >= 0) {
         System.out.println(newBranch.getName() + " branch already exists");
         return false;
      }
      this.branches.add(newBranch);
      return true;
   }

   public void addCustomer(Branch branch, Customer customer) {

      if (findBranch(branch) >= 0) {
         branch.addCustomer(customer);
      } else {
         System.out.println("Branch does not exist");
      }
   }

   public void addCustomerTransaction(Branch branch, Customer customer, double transaction) {
      if (findBranch(branch) >= 0) {
         if (branch.findCustomer(customer) >= 0) {
            int customerPosition = branch.findCustomer(customer);
            branch.getCustomers().get(customerPosition).addTransaction(transaction);
         } else {
            System.out.println("Customer does not exist");
         }
      } else {
         System.out.println("Branch does not exist");
      }
   }

   public Branch queryBranch(String name) {
      int position = findBranch(name);
      if (position >= 0) {
         return this.branches.get(position);
      }
      return null;
   }

   private int findBranch(Branch branch) {
      return branches.indexOf(branch);
   }

   private int findBranch(String name) {
      for (int i = 0; i < this.branches.size(); i++) {
         Branch branch = this.branches.get(i);
         if (branch.getName().equals(name)) {
            return i;
         }
      }
      return -1;
   }
//   public void printBranches(Branch branch) {
//      if (findBranch(branch) >= 0) {
//         this.branches.get(findBranch(branch)).printCustomers();
//      } else {
//         System.out.println("Branch does not exist");
//      }
//   }

   public void printCustomers(Branch branch) {
      if (findBranch(branch) >= 0) {
         this.branches.get(findBranch(branch)).printCustomers();
      } else {
         System.out.println("Branch does not exist");
      }
   }

}
