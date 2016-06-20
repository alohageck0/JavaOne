package CollectionPractice.SecondPractice;

public class Main {
   public static void main(String[] args) {
      Theatre theatre = new Theatre("Olymnian", 8, 12);

      theatre.getSeats();
      if (theatre.reserveSeat("H11")){
         System.out.println("Please pay");
      }else {
         System.out.println("seat is taken");
      }
   }
}
