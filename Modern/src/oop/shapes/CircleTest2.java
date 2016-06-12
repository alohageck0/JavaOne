package oop.shapes;

public class CircleTest2 {
   public static void main(String[] args) {
      Circle[] arrayCircles = new Circle[100];
      for (int i = 0; i < arrayCircles.length; i++) {
         arrayCircles[i] = new Circle(Math.random() * 100 + 1);
      }

      System.out.println(getBiggestArea(arrayCircles));
      System.out.println(getSmallestArea(arrayCircles));
   }

   public static double getBiggestArea(Circle[] circles) {
      double maxArea = 0;
      for (Circle circle : circles) {
         double newArea = circle.computeArea();
         if (newArea > maxArea) {
            maxArea = newArea;
         }
      }
      return maxArea;
   }

   public static double getSmallestArea(Circle[] circles) {
      double minArea = 0;
      for (Circle circle : circles) {
         double newArea = circle.computeArea();
         if (newArea < minArea || minArea == 0) {
            minArea = newArea;
         }
      }
      return minArea;
   }
}
