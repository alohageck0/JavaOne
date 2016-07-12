package applets.simpleGraphics;

import java.applet.Applet;
import java.awt.*;

public class TicTacToe extends Applet {
   private int width, height;

   @Override
   public void init() {
      this.width = getWidth();
      this.height = getHeight();
   }

   @Override
   public void paint(Graphics g) {
      g.drawLine(width / 3, 0, width / 3, height);
      g.drawLine(2 * width / 3, 0, 2 * width / 3, height);
      g.drawLine(0, height / 3, width, height / 3);
      g.drawLine(0, 2*height / 3, width, 2*height / 3);
   }
}
