import java.util.Scanner;

public class Challenge {
   private static Scanner scanner = new Scanner(System.in);
   private static Bank chase = new Bank();

   public static void main(String[] args) {
      boolean quit = false;
      printInstructions();
      while (!quit) {
         System.out.println("Enter operation: (5 to show available actions");
         int choice = scanner.nextInt();
         scanner.nextLine();

         switch (choice) {
            case 0:
               System.out.println("Shuttting down... ");
               quit = true;
               break;
            case 1:
               addBranch();
               break;
            case 2:
               addCustomerToBranch();
               break;
//            case 3:
//               updateContact();
//               break;
//            case 4:
//               removeContact();
//               break;
//            case 5:
//               queryContact();
//               break;
//            case 6:
//               printInstructions();
//               break;
         }
      }
   }

   public static void addBranch() {
      System.out.println("Enter branch name: ");
      String branchName = scanner.nextLine();
      Branch newBranch = Branch.createBranch(branchName);
      if (chase.addBranch(newBranch)) {
         System.out.println("Branch " + newBranch.getName() + " was added");
      } else {
         System.out.println("Can not add, branch already exist");
      }
   }

   public static void addCustomerToBranch() {
      System.out.println("Enter branch name: ");
      String branchName = scanner.nextLine();
      Branch existingBranch = chase.queryBranch(branchName);
      if (existingBranch == null) {
         System.out.println("Branch not found");
      }
      System.out.println("Enter Customer name: ");
      String customerName = scanner.nextLine();
      System.out.println("Enter initial transaction: ");
      double transaction = scanner.nextDouble();
      Customer customer = Customer.createCustomer(customerName, transaction);
      chase.addCustomer(existingBranch, customer);

   }

//   public static void printCustomers() {
//      System.out.println("Enter branch name: ");
//      String branchName = scanner.nextLine();
//      chase.printCustomers(chase.);
//
//   }

   public static void printInstructions() {
      System.out.println("\nAvailable operations");
      System.out.println("0 - Quit");
      System.out.println("1 - Add branch");
      System.out.println("2 - Add customer to branch");
      System.out.println("3 - Add transaction to costomer of branch");
      System.out.println("4 - Print list of customers of branch");
      System.out.println("5 - Print instructions");
      System.out.println("Choose your operation");
   }
}
