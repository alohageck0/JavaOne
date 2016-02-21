public class Printer {
   private int tonerLevel = 100;
   private int pagesPrinted = 0;
   private boolean duplex;

   public Printer(int tonerLevel, boolean duplex) {
      if (tonerLevel > 0 && tonerLevel <= 100) {
         this.tonerLevel = tonerLevel;
      }
      this.duplex = duplex;
   }

   public void isDuplex() {
      if (duplex) {
         System.out.println("Printer is a duplex");
      } else {
         System.out.println("Priner is not a duplex");
      }
   }

   public void fillUpToner() {
      this.tonerLevel = 100;
      System.out.println("Toner filled up");
   }

   public void printPage(int numberOfPages) {
      this.pagesPrinted += numberOfPages;
      this.tonerLevel -= (numberOfPages * 0.1);
      System.out.println(numberOfPages + " pages printed");
   }

   public int getTonerLevel() {
      return tonerLevel;
   }

   public int getPagesPrinted() {
      return pagesPrinted;
   }
}
