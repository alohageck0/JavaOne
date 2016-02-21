public class Door {
   public String material;
   public Dimensions dimensions;

   public Door(String material, Dimensions dimensions) {
      this.material = material;
      this.dimensions = dimensions;
   }


   public void openDoor() {
      System.out.println("Door opened");
   }
}
