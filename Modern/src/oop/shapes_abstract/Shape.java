package oop.shapes_abstract;

public abstract class Shape {
   public abstract double getArea();

   public static double sumArea(Shape[] shapes) {
      double sum = 0;
      for (Shape s : shapes) {
         sum += s.getArea();
      }
      return sum;
   }
}
