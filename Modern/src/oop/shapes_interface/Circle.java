package oop.shapes_interface;

/**
 * Circle class used to create circles.
 * Use any length measurment for raduis.
 */
public class Circle implements Shape {
   private double radius;

   /**
    * Create object of circle class.
    * Use radius argument
    *
    * @param radius
    */
   public Circle(double radius) {
      this.radius = radius;
   }

   @Override
   public double getArea() {
      return Math.PI * Math.pow(radius, 2);
   }
}
