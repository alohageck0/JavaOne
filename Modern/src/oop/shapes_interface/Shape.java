package oop.shapes_interface;

public interface Shape {

   double getArea();

   static double sumArea(Shape[] shapes) {
      double sum = 0;
      for (Shape s : shapes) {
         sum += s.getArea();
      }
      return sum;
   }
}
