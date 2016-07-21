package eventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseListener extends MouseAdapter {
   private JPanel panel;

   public MouseListener(JPanel panel) {
      this.panel = panel;
   }

   @Override
   public void mousePressed(MouseEvent e) {
      if (panel.getBackground().equals(Color.RED)) {
         panel.setBackground(Color.BLUE);
      } else {
         panel.setBackground(Color.RED);
      }
   }
}
