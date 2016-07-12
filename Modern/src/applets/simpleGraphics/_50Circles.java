package applets.simpleGraphics;

import javax.swing.*;
import java.awt.*;

public class _50Circles extends JPanel {
   private int width, heigth;
   private int radius = 10;

   @Override
   protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      this.width = getWidth();
      this.heigth = getHeight();
      setBackground(Color.RED);
      setForeground(Color.YELLOW);
      for (int i = 0; i < 50; i++) {
         int coordX = (int) Math.abs(Math.random() * width - radius);
         int coordY = (int) Math.abs(Math.random() * heigth - radius);
         g.fillOval(coordX, coordY, radius, radius);
      }
   }

   public static void main(String[] args) {
      new _50Circles();
   }

}
