import java.util.Scanner;

public class Challenge {
   private static MobilePhone iphone = new MobilePhone();
   private static Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {
      boolean quit = false;
      int choice;
      printInstructions();
      while (!quit) {
         System.out.println("Enter you choice: ");
         choice = scanner.nextInt();
         scanner.nextLine();

         switch (choice) {
            case 0:
               printInstructions();
               break;
            case 1:
               quit = true;
               break;
            case 2:
               iphone.printPhoneBook();
               break;
            case 3:
               iphone.addContact();
               break;
            case 4:
               iphone.updateName();
               break;
            case 5:
               iphone.updatePhone();
               break;
            case 6:
               iphone.deleteContact();
               break;
            case 7:
               iphone.findContact();
               break;
         }
      }
   }

   public static void printInstructions() {
      System.out.println("0 - print instructions");
      System.out.println("1 - Quit");
      System.out.println("2 - print contacts");
      System.out.println("3 - add new");
      System.out.println("4 - update name");
      System.out.println("5 - update phone");
      System.out.println("6 - remove");
      System.out.println("7 - find contact by name");
   }
}
