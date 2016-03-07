package CollectionPractice;

public class Main {
   public static void main(String[] args) {
      //test

      Theatre theatre = new Theatre("Olympium", 8, 12);
//      theatre.getSeats();
      if (theatre.reserveSeat("D12")) {
         System.out.println("please pay");
      } else {
         System.out.println("Sorry already taken");
      }
   }
}
