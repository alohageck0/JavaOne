public class Vehicle {
   public String type;
   public String make;
   public String model;
   public String condition;
   public String fuel;

   public Vehicle() {
      this("Default type", "Default make", "Def model", "Def condition", "gasoline");
   }

   public Vehicle(String type, String make, String model, String condition, String fuel) {
      this.type = type;
      this.make = make;
      this.model = model;
      this.condition = condition;
      this.fuel = fuel;
   }

   public void move(int speed) {
      System.out.println("Vehicle.move at speed " + speed);
   }

   public void damage() {
      System.out.println("Vehicle.damage callede");
   }

}
