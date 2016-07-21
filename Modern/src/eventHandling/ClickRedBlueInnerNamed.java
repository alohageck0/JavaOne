package eventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseListener;

public class ClickRedBlueInnerNamed extends JPanel {

   public ClickRedBlueInnerNamed() {
      setBackground(Color.RED);
      addMouseListener(new MouseListener());
   }

   private class MouseListener implements java.awt.event.MouseListener {

      @Override
      public void mouseClicked(MouseEvent e) {

      }

      @Override
      public void mousePressed(MouseEvent e) {
         if (getBackground().equals(Color.RED)) {
            setBackground(Color.BLUE);
         } else {
            setBackground(Color.RED);
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
}
