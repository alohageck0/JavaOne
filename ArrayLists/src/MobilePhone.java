import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private ArrayList<Contact> phoneBook = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public void addContact() {
        System.out.println("Enter name: \r");
        String name = scanner.nextLine();
        System.out.println("Enter phone: \r");
        String phone = scanner.nextLine();
        if (ifExists(phoneBook, name) < 0) {
            phoneBook.add(new Contact(name, phone));
        }

    }

    public void deleteContact() {
        System.out.println("Enter name: \r");
        String name = scanner.nextLine();
        if (ifExists(phoneBook, name) >= 0) {
            phoneBook.remove(ifExists(phoneBook, name));
        } else {
            System.out.println("There is no such a contact");
        }
    }

    public static int ifExists(ArrayList<Contact> arrayList, String name) {
        for (Contact contact : arrayList) {
            if (contact.getName().equals(name)){
                return arrayList.indexOf(contact);
            }
        }
        return -1;
    }

    public void printPhoneBook() {
        for (Contact aPhoneBook : phoneBook) {
            System.out.println("Name " + aPhoneBook.getName() + ": " + aPhoneBook.getPhone());
        }
    }

    public void updateName() {
        System.out.println("Enter current name: \r");
        String oldName = scanner.nextLine();
        if (ifExists(phoneBook, oldName) >= 0) {
            System.out.println("Enter new name: \r");
            String newName = scanner.nextLine();
            int index = ifExists(phoneBook, oldName);
            phoneBook.set(index, new Contact(newName, phoneBook.get(index).getPhone()));
        } else {
            System.out.println("There is no such a contact");
        }
    }

    public void updatePhone() {
        System.out.println("Enter current name: \r");
        String name = scanner.nextLine();
        if (ifExists(phoneBook, name) >= 0) {
            System.out.println("Enter new phone: \r");
            String newPhone = scanner.nextLine();
            int index = ifExists(phoneBook, name);
            phoneBook.set(index, new Contact(name, newPhone));
        } else {
            System.out.println("There is no such a contact");
        }
    }

    public void findContact() {
        System.out.println("Enter name to find: \r");
        String name = scanner.nextLine();
        if (ifExists(phoneBook, name) >= 0) {
            int i = ifExists(phoneBook, name);
            System.out.println("Name " + phoneBook.get(i).getName() + ": " + phoneBook.get(i).getName());
        } else {
            System.out.println("Does not exist");
        }
    }

//   private String getConatctName(){
//      //todo implement this
//      return
//   }
//private String getConatctPhone(){
//      //todo implement this
//      return
//   }

}
