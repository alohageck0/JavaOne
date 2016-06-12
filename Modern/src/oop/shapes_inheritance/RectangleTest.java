package oop.shapes_inheritance;

public class RectangleTest {
   public static void main(String[] args) {
      Rectangle rectangle = new Rectangle(4, 5);
      Square square = new Square(5);

      System.out.println(rectangle);
      System.out.println(square);

      square.setHeight(6);
      square.setWidth(4);
      rectangle.setWidth(8);

      System.out.println(rectangle);
      System.out.println(square);

   }
}
