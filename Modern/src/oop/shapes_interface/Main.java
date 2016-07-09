package oop.shapes_interface;


public class Main {
   public static void main(String[] args) {
      Shape[] shapes = {new Circle(5),
              new Rectangle(3, 5),
              new Square(5)};
      System.out.println(Shape.sumArea(shapes));
   }
}
