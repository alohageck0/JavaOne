package oop.shapes_interface;

public class Square extends Rectangle {

   public Square(double width) {
      super(width, width);
   }

   public void setSides(double side) {
      super.setWidth(side);
      super.setHeight(side);
   }

   @Override
   public double getHeight() {
      return this.getWidth();
   }

   @Override
   public void setHeight(double height) {
      setSides(height);
   }

   @Override
   public void setWidth(double width) {
      setSides(width);
   }

   @Override
   public String toString() {
      return "Square width/height is " + getWidth() + ". Area is " + getArea();
   }
}
