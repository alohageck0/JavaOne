import java.util.Scanner;

public class Main {
   private static Scanner scanner = new Scanner(System.in);
   private static GrocerieList grocerieList = new GrocerieList();

   public static void main(String[] args) {
      boolean quit = false;
      int choice = 0;
      printInstuctions();
      while (!quit) {
         System.out.println("Enter you choice: ");
         choice = scanner.nextInt();
         scanner.nextLine();

         switch (choice) {
            case 0:
               printInstuctions();
               break;
            case 1:
               grocerieList.printGroceryList();
               break;
            case 2:
               addItem();
               break;
            case 3:
               modifyItem();
               break;
            case 4:
               removeItem();
               break;
            case 5:
               searchForItem();
               break;
            case 6:
               quit = false;
               break;
         }
      }
   }

   private static void searchForItem() {
      System.out.println("Enter item to search for ");
      String searchItem = scanner.nextLine();
      if (grocerieList.onFile(searchItem)) {
         System.out.println("Found " + searchItem + " in our grocery list");
      } else {
         System.out.println(searchItem + " not found");
      }
   }

   private static void removeItem() {
      System.out.print("Enter item number ");
      String itemNo = scanner.nextLine();
      scanner.nextLine();
      grocerieList.removeGroceryItem(itemNo);
   }

   private static void modifyItem() {
      System.out.print("Enter item number ");
      String itemNo = scanner.nextLine();
      scanner.nextLine();
      System.out.print("Enter relplacement item ");
      String newItem = scanner.nextLine();
      grocerieList.modifyGroceryItem(itemNo, newItem);
   }

   private static void addItem() {
      System.out.print("Please enter grocery item ");
      grocerieList.addGriceryItem(scanner.nextLine());
   }

   public static void printInstuctions() {

   }

}
