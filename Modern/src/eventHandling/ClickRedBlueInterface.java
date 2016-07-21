package eventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class ClickRedBlueInterface extends JPanel implements java.awt.event.MouseListener {

   public ClickRedBlueInterface() {
      setBackground(Color.RED);
      addMouseListener(this);
   }

   @Override
   public void mouseClicked(MouseEvent e) {

   }

   @Override
   public void mousePressed(MouseEvent e) {
      if (this.getBackground().equals(Color.RED)) {
         this.setBackground(Color.BLUE);
      } else {
         this.setBackground(Color.RED);
      }
   }

   @Override
   public void mouseReleased(MouseEvent e) {

   }

   @Override
   public void mouseEntered(MouseEvent e) {

   }

   @Override
   public void mouseExited(MouseEvent e) {

   }
}
