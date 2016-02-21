public class Printer {
   private int tonerLevel = 100;
   private int pagesPrinted = 0;
   private boolean duplex;

   public Printer(int tonerLevel, boolean duplex) {
      if (tonerLevel > 0 && tonerLevel <= 100) {
         this.tonerLevel = tonerLevel;
      } else {
         this.tonerLevel = -1;
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

   public int fillUpToner(int tonerAmmount) {
      if (tonerAmmount > 0 && tonerAmmount <= 100) {
         if (this.tonerLevel + tonerAmmount > 100) {
            return -1;
         }
         this.tonerLevel += tonerAmmount;
         return this.tonerLevel;
      } else {
         return -1;
      }
   }

   public int printPage(int numberOfPages) {
      int pagestoPrint = numberOfPages;
      if (this.duplex) {
         pagestoPrint /= 2;
         System.out.println("printing in duplex mode");
      }
      this.pagesPrinted += pagestoPrint;
      this.tonerLevel -= (numberOfPages * 0.1);
      System.out.println(pagestoPrint + " pages printed");
      return pagestoPrint;
   }

   public int getTonerLevel() {
      return tonerLevel;
   }

   public int getPagesPrinted() {
      return pagesPrinted;
   }
}
