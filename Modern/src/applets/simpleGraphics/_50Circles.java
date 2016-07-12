package applets.simpleGraphics;

import java.applet.Applet;
import java.awt.*;

public class _50Circles extends Applet {
   private int width, heigth;
   private int radius = 10;

   @Override
   public void init() {
      this.width = getWidth();
      this.heigth = getHeight();
      setBackground(Color.RED);
      setForeground(Color.YELLOW);
   }

   @Override
   public void paint(Graphics g) {

      for (int i = 0; i < 50; i++) {
         int coordX = (int) Math.abs(Math.random() * width - radius);
         int coordY = (int) Math.abs(Math.random() * heigth - radius);
         g.fillOval(coordX, coordY, radius, radius);
      }
   }
}
