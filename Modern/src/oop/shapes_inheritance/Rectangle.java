package oop.shapes_inheritance;

public class Rectangle {
   private double width, heigth;

   public Rectangle(double width, double heigth) {
      this.width = width;
      this.heigth = heigth;
   }

   public double getArea() {
      return width * heigth;
   }

}
