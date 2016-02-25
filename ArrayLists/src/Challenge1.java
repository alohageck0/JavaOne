import java.util.Scanner;

public class Challenge1 {
   private static Scanner scanner = new Scanner(System.in);
   private static Mobile mobilePhone = new Mobile("31232 12312 1231");


   public static void main(String[] args) {
      boolean quit = false;
      startPhone();
      printInstructions();
      while (!quit) {
         System.out.println("Enter action: (6 to show available actions");
         int choice = scanner.nextInt();
         scanner.nextLine();

         switch (choice) {
            case 0:
               System.out.println("Shuttting down... ");
               quit = true;
               break;
            case 1:
               mobilePhone.printContacts();
               break;
            case 2:
               addNewContact();
               break;
            case 3:
               updateContact();
               break;
            case 4:
               removeContact();
               break;
            case 5:
               queryContact();
               break;
            case 6:
               printInstructions();
               break;
         }
      }
   }

   private static void queryContact() {
      System.out.println("Enter existing contact name ");
      String name = scanner.nextLine();
      Contact existingContact = mobilePhone.queryContact(name);
      if (existingContact == null) {
         System.out.println("Contact not found");
         return;
      }
      System.out.println("Name: " + existingContact.getName() + " phone number is " + existingContact.getPhone());
   }

   private static void removeContact() {
      System.out.println("Enter existing contact name ");
      String name = scanner.nextLine();
      Contact existingContact = mobilePhone.queryContact(name);
      if (existingContact == null) {
         System.out.println("Contact not found");
         return;
      }
      if (mobilePhone.removeContact(existingContact)) {
         System.out.println("Succesfully deleted");
      } else {
         System.out.println("Error deleting");
      }

   }


   private static void updateContact() {
      System.out.println("Enter existing contact name ");
      String name = scanner.nextLine();
      Contact existingContact = mobilePhone.queryContact(name);
      if (existingContact == null) {
         System.out.println("Contact not found");
         return;
      }
      System.out.println("Enter new contact name ");
      String newName = scanner.nextLine();
      System.out.print("Enter new contact phone number");
      String newNumber = scanner.nextLine();
      Contact newContact = Contact.createContact(newName, newNumber);
      if (mobilePhone.updateContact(existingContact, newContact)) {
         System.out.println("Successfully updated");
      } else {
         System.out.println("Error updating record");
      }

   }

   private static void addNewContact() {
      System.out.println("Enter new contact name ");
      String name = scanner.nextLine();
      System.out.println("Enter phone number");
      String phone = scanner.nextLine();
      Contact newContact = Contact.createContact(name, phone);
      if (mobilePhone.addNewContact(newContact)) {
         System.out.println("New contact added " + name + ", phone = " + phone);
      } else {
         System.out.println("Cannot add, " + name + " already on file");
      }
   }


   private static void startPhone() {
      System.out.println("Starting phone... ");
   }

   public static void printInstructions() {
      System.out.println("\nAvailable actions");
      System.out.println("0 - Quit");
      System.out.println("1 - print contacts");
      System.out.println("2 - add new");
      System.out.println("3 - update ");
      System.out.println("4 - remove");
      System.out.println("5 - query if an existing contact exists");
      System.out.println("6 - print list of actions");
      System.out.println("Choose your action");
   }
}
