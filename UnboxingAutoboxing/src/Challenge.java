import test.Bank;

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
               System.out.println("Shutting down... ");
               quit = true;
               break;
            case 1:
               addBranch();
               break;
            case 2:
               addCustomerToBranch();
               break;
            case 3:
               addTransactionToCustomer();
               break;
            case 4:
               printListOfCustomers();
               break;
            case 5:
               printInstructions();
               break;
         }
      }
   }

   private static void printListOfCustomers() {
      System.out.println("Enter branch name: ");
      String branchName = scanner.nextLine();
      Branch existingBranch = chase.queryBranch(branchName);
      if (existingBranch == null) {
         System.out.println("Branch not found");
         return;
      }
      existingBranch.printCustomers();
   }

   private static void addTransactionToCustomer() {
      System.out.println("Enter branch name: ");
      String branchName = scanner.nextLine();
      Branch existingBranch = chase.queryBranch(branchName);
      if (existingBranch == null) {
         System.out.println("Branch not found");
         return;
      }
      System.out.println("Enter Customer name: ");
      String customerName = scanner.nextLine();
      Customer existingCustomer = existingBranch.queryCustomer(customerName);
      if (existingCustomer == null) {
         System.out.println("Customer not found");
         return;
      }
      System.out.println("Enter transaction amount: ");
      double transaction = scanner.nextDouble();
      existingCustomer.addTransaction(transaction);
      System.out.println("Transaction " + transaction + " added to customer ->" + existingCustomer.getName());
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
      Customer existingCustomer = existingBranch.queryCustomer(customerName);
      if (existingCustomer != null) {
         System.out.println("Customer already exists");
         return;
      }
      System.out.println("Enter initial transaction: ");
      double transaction = scanner.nextDouble();
      Customer customer = Customer.createCustomer(customerName, transaction);
      chase.addCustomer(existingBranch, customer);

   }


   public static void printInstructions() {
      System.out.println("\nAvailable operations");
      System.out.println("0 - Quit");
      System.out.println("1 - Add branch");
      System.out.println("2 - Add customer to branch");
      System.out.println("3 - Add transaction to customer of branch");
      System.out.println("4 - Print list of customers of branch");
      System.out.println("5 - Print instructions");
      System.out.println("Choose your operation");
   }
}
