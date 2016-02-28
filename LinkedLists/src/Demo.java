import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
   public static void main(String[] args) {

      LinkedList<String> placesToVisit = new LinkedList<>();

      addInOrder(placesToVisit, "Sydney");
      addInOrder(placesToVisit, "Melbourne");
      addInOrder(placesToVisit, "Brisbane");
      addInOrder(placesToVisit, "Perth");
      addInOrder(placesToVisit, "Canberra");
      addInOrder(placesToVisit, "Canberra");
      addInOrder(placesToVisit, "Canberra");
      addInOrder(placesToVisit, "Adelaide");
      addInOrder(placesToVisit, "Darwin");
//      placesToVisit.add("Sydney");
//      placesToVisit.add("Melbourne");
//      placesToVisit.add("Brisbane");
//      placesToVisit.add("Perth");
//      placesToVisit.add("Canberra");
//      placesToVisit.add("Adelaide");
//      placesToVisit.add("Darwin");

      printList(placesToVisit);
      addInOrder(placesToVisit, "Canberra");
      addInOrder(placesToVisit, "Alice Springs");
      printList(placesToVisit);

      visit(placesToVisit);

      //
//      placesToVisit.add(1, "Alice Springs");
//      printList(placesToVisit);
//
//      placesToVisit.remove(4);
//      printList(placesToVisit);
//

   }

   private static void visit(LinkedList<String> cities) {
      Scanner scanner = new Scanner(System.in);
      boolean quit = false;
      boolean goingForward = true;
      ListIterator<String> listIterator = cities.listIterator();

      if (cities.isEmpty()) {
         System.out.println("No cities in itenerary");
      } else {
         System.out.println("Now wisiting " + listIterator.next());
         printManu();
      }
      while (!quit) {
         int action = scanner.nextInt();
         scanner.nextLine();
         switch (action) {
            case 0:
               System.out.println("Holiday (vacation) over");
               break;
            case 1:
               if (!goingForward) {
                  if (listIterator.hasNext()) {

                     listIterator.hasNext();
                  }
                  goingForward = true;
               }
               if (listIterator.hasNext()) {
                  System.out.println("Now visiting " + listIterator.next());

               } else {
                  System.out.println("Reached th end of the list");
                  goingForward=false;
               }
               break;
            case 2:
               if (listIterator.hasPrevious()) {
                  if (goingForward) {
                     if (listIterator.hasPrevious()) {
                        listIterator.previous();

                     }
                     goingForward = false;
                  }
                  System.out.println("Now visiting " + listIterator.previous());
               } else {
                  System.out.println("We are at the start");
                  goingForward=true;
               }
               break;
            case 3:
               printManu();
               break;
         }

      }
   }

   private static void printManu() {
      System.out.println("Available actions: \npress");
      System.out.println("0 - ti quit\n" +
              "1 - go to next city\n" +
              "2 - go to previous city\n" +
              "3 - print menu options");
   }

   private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
      ListIterator<String> listIterator = linkedList.listIterator();
      while (listIterator.hasNext()) {
         int comparison = listIterator.next().compareTo(newCity);
         if (comparison == 0) {
            //equal
            System.out.println(newCity + " is already included as a destination");
            return false;
         } else if (comparison > 0) {
            // new city should appear before
            // Brisbane -> Adelaide
            listIterator.previous();
            listIterator.add(newCity);
            return true;
         } else if (comparison < 0) {
            //next city
         }
      }
      listIterator.add(newCity);
      return true;
   }

   private static void printList(LinkedList<String> linkedList) {
      Iterator<String> i = linkedList.iterator();
      while (i.hasNext()) {
         System.out.println("Now visiting " + i.next());
      }
      System.out.println("========");
   }
}
