package Applets;

import java.applet.Applet;
import java.awt.*;

public class DrawLine extends Applet {
   private int heigth, width;

   @Override
   public void init() {
      setBackground(Color.DARK_GRAY);
      setForeground(Color.blue);
      this.heigth = getHeight();
      this.width = getWidth();
   }

   @Override
   public void paint(Graphics g) {
      g.drawLine(0, 0, width / 2, heigth / 2);
   }
}
