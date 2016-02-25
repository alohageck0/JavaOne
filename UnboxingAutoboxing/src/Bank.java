import java.util.AbstractList;
import java.util.ArrayList;

public class Bank {
   private ArrayList<Branch> branches;

   public Bank() {
      this.branches = new ArrayList<>();
   }

   public void addBranch(Branch newBranch) {
      this.branches.add(newBranch);
   }
}
