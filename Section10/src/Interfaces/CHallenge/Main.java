package Interfaces.CHallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      ISavable character;

      character = new Player("Bob");
      character.populateFields(readValues());
      System.out.println(character.toString());
      checkListToSave(character.returnList());

      character = new Monster("Hell");
      character.populateFields(readValues());
      System.out.println(character.toString());
      checkListToSave(character.returnList());

   }

   public static ArrayList<String> readValues() {
      ArrayList<String> values = new ArrayList<>();

      Scanner scanner = new Scanner(System.in);
      boolean quit = false;
      int index = 0;
      System.out.println("Choose\n" +
              "1 to enter a string\n" +
              "0 to quit");

      while (!quit) {
         System.out.println("Choose an option: ");
         int choice = scanner.nextInt();
         scanner.nextLine();
         switch (choice) {
            case 0:
               quit = true;
               break;
            case 1:
               System.out.println("Enter a string: ");
               String stringInput = scanner.nextLine();
               values.add(index, stringInput);
               index++;
               break;
         }
      }
      return values;
   }

   public static void checkListToSave(ArrayList<String> arrayList) {
      System.out.println("Values from object to save");
      if (arrayList.size() > 0) {
         arrayList.forEach(System.out::println);

      }
   }

}
