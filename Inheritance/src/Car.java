public class Car extends Vehicle {
   public int doors;
   public String color;
   public int maxSpeed;
   public String bodyType;
   public String engineType;
   public int mpg;
   public int currentSpeed;
   public String currentGear;


   public Car(String make, String model, String condition, String fuel, int doors, String color, int maxSpeed, String bodyType, String engineType, int mpg) {
      super("Car", make, model, condition, fuel);
      this.doors = doors;
      this.color = color;
      this.maxSpeed = maxSpeed;
      this.bodyType = bodyType;
      this.engineType = engineType;
      this.mpg = mpg;
      this.currentSpeed = 0;
      this.currentGear = "P";
   }

   public void changeGear(String gear) {
      if (gear == this.currentGear) {
         System.out.println("Current gear " + this.currentGear);
      } else {
         this.currentGear = gear;
         System.out.println("Gear changed to " + gear);
      }

   }

   public void turnLeft() {
      System.out.println("Car turning left");
   }

   public void turnRight() {
      System.out.println("Car turning right");
   }

   public String selectGear(int speed) {
      if (speed == 0) {
         return "P";
      } else if (speed > 0 && speed <= 25) {
         return "1";
      } else if (speed <= 45 && speed > 25) {
         return "2";
      } else if (speed > 45) {
         return "3";
      } else {
         return "4";
      }

   }

   public void startMove(int speed) {
      if (speed >= 25) {
         System.out.println("Speed is too high to start. Select less than 25 mph");
      } else {

         changeGear("1");
         this.currentSpeed = speed;
         move(currentSpeed);
      }

   }

   public void speedUp(int speed) {
      System.out.println("Speed increased by " + (speed - this.currentSpeed));
      this.currentSpeed = speed;
      changeGear(selectGear(currentSpeed));
      move(currentSpeed);

   }

   public void slowDown(int speed) {
      int diff = this.currentSpeed - speed;
      if ((diff) > 0) {
         System.out.println("Speed decreased by " + diff);
         this.currentSpeed = speed;
         changeGear(selectGear(currentSpeed));
         move(currentSpeed);

      } else if (diff <= 0) {
         System.out.println("Speed decreased by " + this.currentSpeed);
         this.currentSpeed = 0;
         changeGear(selectGear(currentSpeed));
         System.out.println("Car is stoped");
      }

   }

   @Override
   public void move(int speed) {
      System.out.println("Car is moving. Car's speed " + speed);
      System.out.println();
   }
}
