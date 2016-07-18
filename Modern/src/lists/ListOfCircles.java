package lists;

import oop.shapes_interface.Circle;

import java.util.ArrayList;
import java.util.List;

public class ListOfCircles {
   public static void main(String[] args) {
      List<Circle> listOfCircles = new ArrayList<>();
      while (true) {
         double radius = Math.random();
         if (radius < 0.01) {
            break;
         } else {
            listOfCircles.add(new Circle(radius));
         }
      }
      for (int i = 0; i < listOfCircles.size(); i++) {
         System.out.printf("Area of circle %4d: %5.3f%n", i, listOfCircles.get(i).getArea());
      }
   }
}
