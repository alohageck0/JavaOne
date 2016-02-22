class Car {
   private boolean engine;
   private int cylinders;
   private int wheels;
   private String name;

   public Car(int cylinders, String name) {
      this.cylinders = cylinders;
      this.name = name;
      this.engine = true;
      this.wheels = 4;
   }

   public boolean isEngine() {
      return engine;
   }

   public int getCylinders() {
      return cylinders;
   }

   public int getWheels() {
      return wheels;
   }

   public String getName() {
      return name;
   }

   public String startEngine() {
      return "Car engine started";
   }

   public String accelerate() {
      return "Car accelerated";
   }

   public String pressBreak() {
      return "Car break";
   }
}

class Subaru extends Car {
   public Subaru() {
      super(4, "Subaru");
   }

   @Override
   public String pressBreak() {
      return "Subaru pressed break";
   }

   @Override
   public String accelerate() {
      return "Subaru accelerated";
   }

   @Override
   public String startEngine() {
      return "Subaru engine started";
   }
}

class Tesla extends Car {
   public Tesla() {
      super(0, "Tesla");
   }

   @Override
   public String pressBreak() {
      return "Tesla pressed break";
   }

   @Override
   public String accelerate() {
      return "Tesla accelerated";
   }

   @Override
   public String startEngine() {
      return "Tesla engine started";
   }
}

class Mustang extends Car {
   public Mustang() {
      super(6, "Mustang");
   }

   @Override
   public String pressBreak() {
      return "Mustang pressed break";
   }

   @Override
   public String accelerate() {
      return "Mustang accelerated";
   }

}

public class Challenge {
   public static Car randomCar() {
      int randomNum = (int) (Math.random() * 3) + 1;
      System.out.println("Random was " + randomNum);
      switch (randomNum) {
         case 1:
            return new Subaru();
         case 2:
            return new Mustang();
         case 3:
            return new Tesla();
         default:
            return null;
      }
   }

   public static void main(String[] args) {
      for (int i = 1; i < 11; i++) {
         Car movie = randomCar();
         System.out.println("Car # " + i + " " + movie.getName() + "\n" +
                 "start engine: " + movie.startEngine() + "\n" +
                 "break " + movie.pressBreak() + "\n" +
                 "Accelerate car " + movie.accelerate() + "\n" +
                 "Print cylinders count " + movie.getCylinders() + "\n" + "\n");
      }
   }
}
