package Challenge;

public class StockItem implements Comparable<StockItem> {
   private final String name;
   private double price;
   private int quantityStock;
   private int reserved;

   public StockItem(String name, double price) {
      this(name, price, 0);
   }

   public StockItem(String name, double price, int quantityStock) {
      this.name = name;
      this.price = price;
      this.quantityStock = quantityStock;
      this.reserved = 0;
   }

   public int getReserved() {
      return reserved;
   }

   private boolean available(int quntity) {
      return (this.quantityStock - this.reserved - quntity) >= 0;
   }

   public int reserveItems(int quantity) {
      if (available(quantity)) {
         this.reserved += quantity;
         System.out.println("You've reserved " + quantity + " of " + this.name + "\nTotal reserved " + this.reserved);
         return quantity;
      }
      System.out.println(this.name + " out of stock");
      return 0;
   }

   public String getName() {
      return name;
   }

   public double getPrice() {
      return price;
   }

   public int quantityInStock() {
      return quantityStock;
   }

   public void setPrice(double price) {
      if (price > 0.0) {
         this.price = price;
      }
   }

   public void adjustStock(int quantity) {
      int newQuantity = this.quantityStock + quantity;
      if (newQuantity >= 0) {
         this.quantityStock = newQuantity;
      }
   }

   @Override
   public boolean equals(Object obj) {
      System.out.println("Entering stockItem.equals");
      if (obj == this) {
         return true;
      }
      if ((obj == null) || (obj.getClass() != this.getClass())) {
         return false;
      }
      String objName = ((StockItem) obj).getName();
      return this.name.equals(objName);
   }

   @Override
   public int hashCode() {
      return this.name.hashCode() + 43;
   }

   @Override
   public int compareTo(StockItem o) {
      System.out.println("Entering StockItem.compareTo");
      if (this == o) {
         return 0;
      }

      if (o != null) {
         return this.name.compareTo(o.getName());
      }
      throw new NullPointerException();
   }

   @Override
   public String toString() {
      return this.name + ": price " + this.price;
   }
}
