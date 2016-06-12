package oop.shapes_inheritance;

public class Square extends Rectangle {

   public Square(double width) {
      super(width, width);
   }

   @Override
   public void setWidth(double width) {
      super.setWidth(width);
      super.setHeight(width);
   }

   @Override
   public double getHeight() {
      return this.getWidth();
   }

   @Override
   public void setHeight(double height) {
      super.setHeight(height);
      super.setWidth(height);
   }

   @Override
   public String toString() {
      return "Square width/height is " + getWidth() + ". Area is " + getArea();
   }
}
