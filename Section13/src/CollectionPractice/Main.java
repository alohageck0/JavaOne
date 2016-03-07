package CollectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
   public static void main(String[] args) {
      //test

      Theatre theatre = new Theatre("Olympium", 8, 12);
////      theatre.getSeats();
//      if (theatre.reserveSeat("D12")) {
//         System.out.println("please pay");
//      } else {
//         System.out.println("Sorry already taken");
//      }

      List<Theatre.Seat> seatsCopy = new ArrayList<>(theatre.seats);
      printList(seatsCopy);
      seatsCopy.get(1).reserve();
      if (theatre.reserveSeat("A02")) {
         System.out.println("Please pay");
      } else {
         System.out.println("Already reserved");
      }

      Collections.shuffle(seatsCopy);
      System.out.println("Printing seatCopy");
      printList(seatsCopy);
      System.out.println("Printing theatre.seat");
      printList(theatre.seats);

      Theatre.Seat minSeat = Collections.min(seatsCopy);
      Theatre.Seat maxSeat = Collections.max(seatsCopy);
      System.out.println("Min seat number " + minSeat.getSeatNumber());
      System.out.println("Max seat number " + maxSeat.getSeatNumber());

      sortList(seatsCopy);
      System.out.println("Printing sorted seatCopy");
      printList(seatsCopy);

//      List<Theatre.Seat> newList = new ArrayList<>(theatre.seats.size());
//      Collections.copy(newList, theatre.seats);
   }

   public static void printList(List<Theatre.Seat> list) {
      for (Theatre.Seat seat : list) {
         System.out.print(" " + seat.getSeatNumber());
      }
      System.out.println();
      System.out.println("+++++++++++++++");
   }

   public static void sortList(List<? extends Theatre.Seat> list) {
      for (int i = 0; i < list.size() - 1; i++) {
         for (int j = i + 1; j < list.size(); j++) {
            if (list.get(i).compareTo(list.get(j)) > 0) {
               Collections.swap(list, i, j);
            }
         }
      }
   }

}
